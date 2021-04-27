package org.uranus.observer

import lombok.Getter
import lombok.Setter
import java.io.Serializable
import java.util.*

/**
 * @author yanghai
 * @since 2021/4/27-11:16 上午
 */
@Getter
@Setter
abstract class Event : Serializable {

    companion object {
        private const val serialVersionUID = -1471539721545752578L
    }

    var eventId: String? = null

    var type: String? = null

    var eventTime: Date? = null
}