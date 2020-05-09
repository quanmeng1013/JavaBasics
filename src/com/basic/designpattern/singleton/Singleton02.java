package com.basic.designpattern.singleton;

/**
 * 懒汉式
 */
public class Singleton02 {

    //类初始化时不初始化对象（延时加载，真正调用的时候在创建）
    public static Singleton02 singleton02;

    private Singleton02(){}

    //方法同步，调用效率低
    public static synchronized Singleton02 getInstance() {
        if(singleton02 == null) {
            singleton02 = new Singleton02();
        }
        return singleton02;
    }
}
