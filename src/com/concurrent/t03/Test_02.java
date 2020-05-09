package com.concurrent.t03;
/**
 * 尝试�?
 */
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test_02 {
    Lock lock = new ReentrantLock();

    void m1(){
        try{
            lock.lock();
            for(int i = 0; i < 10; i++){
                TimeUnit.SECONDS.sleep(1);
                System.out.println("m1() method " + i);
            }
        }catch(InterruptedException e){
            e.printStackTrace();
        }finally{
            lock.unlock();
        }
    }

    void m2(){
        boolean isLocked = false;
        try{
            // 尝试锁， 如果有锁，无法获取锁标记，返回false�?
            // 如果获取锁标记，返回true
            // isLocked = lock.tryLock();

            // 阻塞尝试锁，阻塞参数代表的时长，尝试获取锁标记�?
            // 如果超时，不等待。直接返回�?
            isLocked = lock.tryLock(5, TimeUnit.SECONDS);

            if(isLocked){
                System.out.println("m2() method synchronized");
            }else{
                System.out.println("m2() method unsynchronized");
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(isLocked){
                // 尝试锁在解除锁标记的时候，一定要判断是否获取到锁标记�?
                // 如果当前线程没有获取到锁标记，会抛出异常�?
                lock.unlock();
            }
        }
    }

    public static void main(String[] args) {
        final Test_02 t = new Test_02();
        new Thread(new Runnable() {
            @Override
            public void run() {
                t.m1();
            }
        }).start();
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        new Thread(new Runnable() {
            @Override
            public void run() {
                t.m2();
            }
        }).start();
    }
}
