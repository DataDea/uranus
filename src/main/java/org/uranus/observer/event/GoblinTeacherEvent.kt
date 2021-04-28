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
open class GoblinTeacherEvent : Event() {

    companion object {
        private const val serialVersionUID = -14715397232752578L
    }

    //课程的名字
    var name: String? = null

    //课程的开始时间
    var start: String? = null

    //课程的结束时间
    var end: String? = null

    //课程所属的班级
    var classz: String? = null

    //课程的地点
    var address: String? = null
}