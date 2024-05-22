package com.study.java_study.ch03_함수;

public class FunctioinMain01 {
    public static void main(String[] args) {
        /*
        Function01타입의 변수, 타입안에는 함수가 있다.
        Function01에 기능이 들어있음

        int add(int a, int b) {
        int result = a + b;
        return result;

        function01 변수에 값을 넣어서 계산된 함수는 result에 담기고
        result는 return값을 받아서

         */
        Function01 functioin01 = new Function01();

        int result = functioin01.add(10, 2);
        int result2 = functioin01.add(100, 50);

        System.out.println(result);
        System.out.println(result2);

        System.out.println("---------------------");

        int result3 = functioin01.sub(7, 3);
        int result4 = functioin01.sub(10, 8);

        System.out.println(result3);
        System.out.println(result4);

    }
}
