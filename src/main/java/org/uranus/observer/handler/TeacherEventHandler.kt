package org.uranus.observer.handler

import org.uranus.observer.Event
import org.uranus.observer.EventHandlerListener
import org.uranus.observer.event.GoblinEvent

/**
 * @author yanghai
 * @since 2021/4/27-4:36 下午
 */
open class TeacherEventHandler private constructor() : EventHandlerListener {

    companion object {
        private val INSTANCE = TeacherEventHandler()

        @JvmStatic
        fun getInstance(): TeacherEventHandler {
            return INSTANCE
        }
    }

    override fun identify(): String {
        return "T_LESSON"
    }

    override fun accept(event: Event?): Boolean {
        if (event !is GoblinEvent) {
            return false
        }
        if (null == event.endTime || null == event.startTime || null == event.state) {
            return false
        }
        return true
    }

    override fun handler(event: Event?) {

        println()
    }
}