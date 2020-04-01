package com.concurrent.t01;

/**
 * synchronized 关键字
 * 同步方法 staic
 * 静态同步方法，锁的是当前类型的类对象，Test_02.class
 */
public class Test_02 {

    private static int staticCount = 0;

    public static synchronized void sync4() {
        System.out.println(Thread.currentThread().getName()
                +"staticCount=="+staticCount++);
    }

    public static void sync5() {
        synchronized(Test_02.class) {
            System.out.println(Thread.currentThread().getName()
                    +"staticCount=="+staticCount++);
        }

    }
}
