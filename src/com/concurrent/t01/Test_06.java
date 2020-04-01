package com.concurrent.t01;

/**
 * synchronized 关键字
 * 读可重入，同一个线程，多次调用同步代码，锁定同一对象，可重入。
 */

import java.sql.Time;
import java.util.concurrent.TimeUnit;

public class Test_06 {

    synchronized void m1() {
        System.out.println("m1 start ");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        m2();
        System.out.println("m1 end ");
    }

    synchronized void m2() {
        System.out.println("m2 start ");
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("m2 end ");
    }
}
