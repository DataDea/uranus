package org.uranus.observer

import java.util.concurrent.locks.ReentrantReadWriteLock
import kotlin.concurrent.write

/**
 * @author yanghai
 * @since 2021/4/27-11:39 上午
 */
open class EventBusManager private constructor() : EventBus {

    companion object {
        private val INSTANCE = EventBusManager()

        @JvmStatic
        fun getInstance(): EventBusManager {
            return INSTANCE
        }

        //存放时间处理类的集合
        private val LISTENERS = mutableListOf<EventHandlerListener?>()

        //读写锁
        val lock = ReentrantReadWriteLock()
    }

    override fun registerHandler(handler: EventHandlerListener?): Boolean? {
        if (null == handler) {
            return false
        }
        lock.write {
            val ret = LISTENERS.firstOrNull { it?.identify() == handler.identify() }
            if (null != ret) {
                return false
            }
            return LISTENERS.add(handler)
        }
    }

    override fun unRegisterHandler(identifyId: String?): Boolean? {
        if (null == identifyId) {
            return false
        }
        lock.write {
            return LISTENERS.removeIf { it?.identify() == identifyId }
        }
    }

    override fun notify(event: Event?) {
        for (it in LISTENERS) {
            if (null == it) {
                continue
            }
            if (!it.accept(event)) {
                continue
            }
            it.handler(event)
        }
    }
}