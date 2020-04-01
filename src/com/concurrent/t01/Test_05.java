package com.concurrent.t01;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

/**
 *synchronized 关键字
 *
 *同步方法只能保证当前方法的原子性，不能保证多个业务方法之间的互相访问的原子性。
 * 在商业开发中，多方法要求结果访问的原子性，需要多方法加锁，且锁定同一资源。
 * 一般来说，在商业项目中，不考虑业务逻辑上的脏读问题。
 */
public class Test_05 {

    private double d = 0.0;

    public synchronized void m1(double d) {
        try {
            //相当于复杂的业务逻辑代码
            TimeUnit.SECONDS.sleep(2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.d = d;
    }

    public double m2() {
        return this.d;
    }

    public static void main(String[] args){
        final Test_05 t = new Test_05();
        new Thread(new Runnable() {
            @Override
            public void run() {
                t.m1(100);
            }
        }).start();
        System.out.println(t.m2());
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(t.m2());
    }
}
