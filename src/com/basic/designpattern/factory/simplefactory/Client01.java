package com.basic.designpattern.factory.simplefactory;

/**
 * 测试没有工厂模式下
 */
public class Client01 {
    public static void main(String[] args) {
        Car c1 = new AoDi();
        Car c2 = new Byd();

        c1.run();
        c2.run();
    }
}
