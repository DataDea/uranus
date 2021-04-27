package org.uranus.observer

/**
 * @author yanghai
 * @since 2021/4/27-11:32 上午
 */
interface EventBus {

    /**
     * 注册
     */
    fun registerHandler(handler: EventHandlerListener?): Boolean?

    /**
     * 取消注册
     */
    fun unRegisterHandler(identifyId: String?): Boolean?

    /**
     * 通知
     */
    fun notify(event: Event?)
}