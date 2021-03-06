package org.uranus.observer.handler

import org.mars.JsonUtils
import org.uranus.observer.Event
import org.uranus.observer.EventHandlerListener
import org.uranus.observer.event.GoblinTeacherEvent

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
        return "TEACHER-ENGLISH"
    }

    override fun accept(event: Event?): Boolean {
        if (event !is GoblinTeacherEvent) {
            return false
        }
        if (null == event.classz || null == event.name
                || null == event.start || null == event.end
                || null == event.address) {
            return false
        }
        return true
    }

    override fun handler(event: Event?) {
        println("${identify()} know event ${JsonUtils.toJson(event)}")
    }
}