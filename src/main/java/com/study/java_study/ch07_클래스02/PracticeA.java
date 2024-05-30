package com.study.java_study.ch07_클래스02;

public class PracticeA {
    int a;
    int b;

    public PracticeA() {
    }

    public PracticeA(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void increase(int increase) {
        a += increase;
        b += (increase * 2);
    }

    void decrease(int decrease) {
        a -= decrease;
        b -= (decrease / 2);
    }


}
