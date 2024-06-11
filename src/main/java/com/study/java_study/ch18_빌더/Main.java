package com.study.java_study.ch18_빌더;

public class Main {
    public static void main(String[] args) {
        // 내부 클래스
        A a = new A();      // A를 먼저 생성해야 B도 생성가능
        A.B b = a.new B();  // a가 생성이 돼야 B도 생성이 가능

        a.test();
        b.print();

        // C Static           // static이라서 A를 먼저 생성하지 않아도 된다.
        A.C c = new A.C();   // A안에 들어있는 C생성
        c.show();            // 얘는 static이 아니라서 생성하고 써야함

        // C안에 또 static 메소드가 있는거
//        A.C.show2();


    }
}
