package com.study.java_study.ch13_추상화04;

public class ClassA1 extends ClassA{
    @Override
    public void print(InterfaceA interfaceA) {
        System.out.println("A1 클래스에서 print 호출");
        interfaceA.test();  // print 메소드가 매개변수에 의존한다. 매개변수가 있어야 이 줄이 호출가능
                            // 이때 매개변수를 DI(외부에서 주입하는)
    }





}



// 다운캐스팅 쓰는 이유 : 자식 클래스만 가지고 있는 걸 부모가 쓰고싶을 때 다운캐스팅 함