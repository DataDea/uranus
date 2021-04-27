package org.uranus.observer

import java.util.*

/**
 * @author yanghai
 * @since 2021/4/27-11:12 上午
 */
interface EventHandlerListener : EventListener {

    fun identify(): String

    fun accept(event: Event?): Boolean

    fun handler(event: Event?)
}