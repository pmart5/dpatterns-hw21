package com.pmart5a;

import com.pmart5a.myclasses.IntsCalculatorImpl;
import com.pmart5a.myinterfaces.Ints;

public class Main {
    public static void main(String[] args) {
        Ints intsCalc = new IntsCalculatorImpl();
        System.out.println(intsCalc.sum(2, 2));
        System.out.println(intsCalc.mult(10, 22));
        System.out.println(intsCalc.pow(2, 10));
    }
}