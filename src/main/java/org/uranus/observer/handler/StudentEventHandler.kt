package org.uranus.observer.handler

import org.mars.JsonUtils
import org.uranus.observer.Event
import org.uranus.observer.EventHandlerListener
import org.uranus.observer.event.GoblinStudentEvent

/**
 * @author yanghai
 * @since 2021/4/28-3:03 下午
 */
open class StudentEventHandler private constructor() : EventHandlerListener {

    companion object {
        private val INSTANCE = StudentEventHandler()

        @JvmStatic
        fun getInstance(): StudentEventHandler {
            return INSTANCE
        }
    }

    override fun identify(): String {
        return "STUDENT-01"
    }

    override fun accept(event: Event?): Boolean {
        if (event !is GoblinStudentEvent) {
            return false
        }
        if (null == event.subject || null == event.teacher
                || null == event.start || null == event.end) {
            return false
        }
        return true
    }

    override fun handler(event: Event?) {
        println("${identify()} know event ${JsonUtils.toJson(event)}")
    }
}