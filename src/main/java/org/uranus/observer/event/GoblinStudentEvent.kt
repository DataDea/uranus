package org.uranus.observer.event

import lombok.Getter
import lombok.Setter
import org.uranus.observer.Event

/**
 * @author yanghai
 * @since 2021/4/28-3:15 下午
 */
@Getter
@Setter
open class GoblinStudentEvent : Event() {

    companion object {
        private const val serialVersionUID = -1471539723232752578L
    }

    //课程的名字
    var name: String? = null

    //课程科目
    var subject: String? = null

    //课程的开始时间
    var start: String? = null

    //课程的结束时间
    var end: String? = null

    //课程的老师
    var teacher: String? = null

}