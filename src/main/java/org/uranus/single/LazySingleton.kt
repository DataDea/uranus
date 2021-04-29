package org.uranus.single

import java.util.concurrent.locks.ReentrantLock

/**
 * @author yanghai
 * @since 2021/4/29-10:33 上午
 */
open class LazySingleton private constructor() {

    companion object {
        private var INSTANCE: LazySingleton? = null

        private val lock = ReentrantLock()

        @JvmStatic
        fun getInstance(): LazySingleton {
            lock.lock()
            try {
                if (null == INSTANCE) {
                    INSTANCE = LazySingleton()
                }
                return INSTANCE as LazySingleton
            } finally {
                lock.unlock()
            }

        }
    }
}