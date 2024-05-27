package com.study.java_study.ch07_클래스02;

public class StudyMain {
    public static void main(String[] args) {
        StudyA a = new StudyA(100, 1000);        // 생성자 이름이면서 리턴자료형이기 때문에 a에 대입이 된다.

        System.out.println(a);                   // 이 주소값이 a에 들어가있다.

        System.out.println(a.num);
        System.out.println(a.num2);

        StudyB b = new StudyB();
        b.show();       // 메인이 부탁해서 b안에 들어있는 값을 확인시켜준다.


    }
}
