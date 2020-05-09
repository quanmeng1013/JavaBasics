package com.basic.designpattern.singleton;

/**
 * 静态内部类模式
 *线程安全，调用效率高，实现延时加载
 */
public class Singleton03 {

    private static class SingletonClassInstance {
         private static Singleton03 instance = new Singleton03();
    }

    private Singleton03(){}

    private static Singleton03 getInstance() {
       return SingletonClassInstance.instance;
    }

}
