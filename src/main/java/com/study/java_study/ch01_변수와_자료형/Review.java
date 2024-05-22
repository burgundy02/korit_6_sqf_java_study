package com.study.java_study.ch01_변수와_자료형;

public class Review {
    public static void main(String[] args) {
        // 자료형
        // [ 일반 자료형 ]

        /*
        boolean - 1
        char - 2
        short - 2
        int - 4
        float - 4
        double - 8
        long - 8
         */

        // 논리형
        boolean b = false;

        // 문자형
        char c = '가';

        // 정수형
        int n = 1;
        long l = 100000000000l;

        // 실수형
        float f = 3.14f;
        double d = 3.14;

        // 문자열
        String s = "안녕하세요";


        // 업캐스팅
        double num1 = 3;
        System.out.println(num1);

        // 다운캐스팅
        int num2 = (int)1.23;
        System.out.println(num2);

        // 형변환 : 문자 -> 정수 -> 실수

        System.out.println("--------------------------------");

        // 연산자
        // 산술연산자
        int num3 = 10 + 20;
        int num4 = 30 - 10;
        int num5 = 10 * 20;
        System.out.println(num5);
        int num6 = 2 / 4;
        System.out.println(num6);
        int num7 = 3 % 5;
        System.out.println(num7);

        boolean num8 = 7 % 2 == 0;
        System.out.println(num8);


        System.out.println("-----------------------------");


        // 증감연산
        int i = 0;
        System.out.println(i);
        i++;
        System.out.println(i);

        ++i;
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i++);
        System.out.println(i);
        System.out.println(--i);
        System.out.println(i--);
        System.out.println(i--);
        System.out.println(i++);
        System.out.println(--i);
        System.out.println(i--);
        System.out.println(++i);
        System.out.println(--i);

        System.out.println("-------------------------");
        // 논리연산자
        /*
        true => 1
        false => 0
        && => AND(곱)
        || => OR(합)
        ! => NOT(부정)
         */
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(!(false || false));

        // 관계연산자
        System.out.println(5 > 2 && 2 == 2);
        System.out.println(3 != 3);


        // 조건연산자
        System.out.println(7 < 10 ? 100 : 10);

        int x = 20;
        int y = 4;
        String result = x % y == 0 ? "y의 배수입니다" : "y의 배수가 아닙니다.";





        // 복합대입연산자
        int Num1 = 10;

        Num1 += 10;
        Num1 -= 5;
        Num1 *= 2;
        Num1 /= 2;
        Num1 %= 3;

        System.out.println(Num1);


    }
}
