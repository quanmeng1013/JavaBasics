package com.basic.collection;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        Predicate<Integer> p = num->(num%2 ==0 && num%4==0);
        Predicate<Integer> p2 = p.or(num1->num1%3==0);
        List<Integer> ai = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        ai.parallelStream().filter(p.negate().and(p2)).forEach(a->System.out.println("Print "+ a));
    }
}
