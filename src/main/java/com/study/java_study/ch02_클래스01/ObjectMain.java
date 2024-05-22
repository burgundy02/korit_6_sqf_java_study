package com.study.java_study.ch02_클래스01;

public class ObjectMain {
    public static void main(String[] args) {
        int a = 10;     // 10의 주소를 변수에 담다

        ObjectA objectA1 = new ObjectA(); // 100번(주소) / 저장소의 주소
        ObjectA objectA2 = new ObjectA(); // 200번

        System.out.println(a);
        System.out.println(objectA1);
        System.out.println(objectA2);

        objectA1.num = 20;
        objectA2.num = 30;

        System.out.println(objectA1.num);
        System.out.println(objectA2.num);

        System.out.println(objectA1.name);









    }
}
