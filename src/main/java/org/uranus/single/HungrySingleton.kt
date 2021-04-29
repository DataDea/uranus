package org.uranus.single

/**
 * @author yanghai
 * @since 2021/4/29-10:35 上午
 */
open class HungrySingleton private constructor() {
    companion object {
        private val INSTANCE = HungrySingleton()

        @JvmStatic
        fun getInstance(): HungrySingleton {
            return INSTANCE
        }
    }
}