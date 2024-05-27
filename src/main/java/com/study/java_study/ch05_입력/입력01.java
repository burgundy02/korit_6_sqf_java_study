package com.study.java_study.ch05_입력;

import java.util.Scanner;

public class 입력01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("a : " );

        /*
        next() 메소드의 특징
        1. 공백과 줄바꿈(엔터)는 무시한다.(적용안된다)
        2. 버퍼를 사용한다.
         */
        String a = scanner.next();              // scanner.next();는 String타입 리턴
        System.out.println("에이: " + a);

        System.out.println("b : ");
        String b = scanner.nextLine();          //next는 공백, 줄바꿈 포함 x, nextLine은 공백, 엔터 포함
        System.out.println("비 : " + b);








    }
}
