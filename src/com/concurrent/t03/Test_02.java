package com.concurrent.t03;
/**
 * å°è¯é?
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
            // å°è¯éï¼ å¦ææéï¼æ æ³è·åéæ è®°ï¼è¿åfalseã?
            // å¦æè·åéæ è®°ï¼è¿åtrue
            // isLocked = lock.tryLock();

            // é»å¡å°è¯éï¼é»å¡åæ°ä»£è¡¨çæ¶é¿ï¼å°è¯è·åéæ è®°ã?
            // å¦æè¶æ¶ï¼ä¸ç­å¾ãç´æ¥è¿åã?
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
                // å°è¯éå¨è§£é¤éæ è®°çæ¶åï¼ä¸å®è¦å¤æ­æ¯å¦è·åå°éæ è®°ã?
                // å¦æå½åçº¿ç¨æ²¡æè·åå°éæ è®°ï¼ä¼æåºå¼å¸¸ã?
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
