package com.basic.designpattern.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * 测试效率
 */
public class Client {

    public static void main(String[] args) throws Exception {

        long starttime = System.currentTimeMillis();
        int threadNum = 10;
        final CountDownLatch countDownLatch = new CountDownLatch(threadNum);

        for(int j =0;j<threadNum;j++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0;i<100000;i++) {
                        Object o = Singleton01.getInstance();
                    }
                    countDownLatch.countDown();
                }
            }).start();

        }

        countDownLatch.await();
        long end = System.currentTimeMillis();

        System.out.println("总耗时："+(end - starttime));
    }




}
