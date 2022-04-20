package com.pmart5a.myclasses;

import com.pmart5a.myinterfaces.Ints;

public class IntsCalculatorImpl implements Ints {
    protected final Calculator target;

    public IntsCalculatorImpl() {
        this.target = new Calculator();
    }

    @Override
    public int sum(int arg0, int arg1) {
        return (int) target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
    }

    @Override
    public int mult(int arg0, int arg1) {
        return (int) target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
    }

    @Override
    public int pow(int arg, int degree) {
        return (int) target.newFormula()
                .addOperand(arg)
                .addOperand(degree)
                .calculate(Calculator.Operation.POW)
                .result();
    }
}