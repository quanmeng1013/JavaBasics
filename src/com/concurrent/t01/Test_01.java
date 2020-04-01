package com.concurrent.t01;

/**
 * synchronized 关键字
 * 锁对象。
 * 1.testSync2和 testSync3锁当前对象，testSync1锁临界资源对象
 *
 * 当前对象是指 ：创建线程的对象
 *
 */
public class Test_01 {

    private int count = 0;
    private Object o = new Object();

    public void testSync1() {
        synchronized (o) {
            System.out.println(Thread.currentThread().getName()
            +"count=="+count++);
        }
    }

    public void testSync2() {
        synchronized (this) {
            System.out.println(Thread.currentThread().getName()
                    +"count=="+count++);
        }
    }

    public synchronized void testSync3() {
            System.out.println(Thread.currentThread().getName()
                    +"count=="+count++);
        }

        public static void main(String[] args) {

            Test_01 t = new Test_01();
            t.testSync1();
        }
}
