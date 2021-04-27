package org.uranus.observer.event

import lombok.Getter
import lombok.Setter
import org.uranus.observer.Event
import java.util.*

/**
 * @author yanghai
 * @since 2021/4/27-11:21 上午
 */
@Getter
@Setter
open class GoblinEvent : Event() {

    companion object {
        private const val serialVersionUID = -14715397232752578L
    }

    //课的状态
    var state: String? = null

    //课程的开始时间
    var startTime: Date? = null

    //课程的结束时间
    var endTime: Date? = null
}