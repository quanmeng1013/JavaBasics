package com.basic.skip;

/**
 * 测试包装类
 */
public class TestWrappedClass {

    public static void main(String[] args) {
        //基本数据类型转换成包装类对象
        Integer a = new Integer(3);
        Integer b = Integer.valueOf(3);

        //包装类转换成基本数据类型
        int c = b.intValue();
        double d = b.doubleValue();

        //把字符串转成包装类对象
        Integer e = new Integer("999");
        Integer f = Integer.parseInt("333");

        //把包装类转字符串
        String st = f.toString();//+"";
    }
}
