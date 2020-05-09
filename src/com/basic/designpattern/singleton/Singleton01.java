package com.basic.designpattern.singleton;

/**
 * 测试饿汉式单例模式
 */
public class Singleton01  {

    //类初始化时立即加载（没有延时加载的优势）,由于加载类时，天然时线程安全的
    public static Singleton01 instance = new Singleton01();
    private Singleton01(){}

    //方法没有同步，调用效率高
    public static Singleton01 getInstance() {
        return instance;
    }

}
