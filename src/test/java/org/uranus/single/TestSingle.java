package org.uranus.single;

import org.junit.Test;

/**
 * @author yanghai
 * @since 2021/4/28-3:43 下午
 */
public class TestSingle {

    @Test
    public void testHungrySingleton() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            System.out.println(HungrySingleton.getInstance());
        }
        long end = System.currentTimeMillis();
        System.out.printf("耗时：%d", end - start);

    }

    @Test
    public void testLazySingleton() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            System.out.println(LazySingleton.getInstance());
        }
        long end = System.currentTimeMillis();
        System.out.printf("耗时：%d", end - start);
    }
}
