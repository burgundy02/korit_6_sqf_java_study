package com.study.java_study.ch04_제어;

public class Star {
    public static void main(String[] args) {

        /*

         *
         **
         ***
         ****
         *****

         */

        // 풀이
            for(int i = 0; i < 5; i++) {
                for(int j = 0; j < i + 1; j++) {       // i는 0이고 1개부터 찍어야해서 i + 1부터 시작
                    System.out.print("*");
                }
                System.out.println();
            }


        System.out.println("-------------------------------");

        /*

         *****
         ****
         ***
         **
         *

         */

       for(int i = 0; i < 5; i++) {
           for(int j = 0; j < 5 - i; j++) {         // i는 0이고, 5개부터 줄어들게 찍어야해서 5 - i로 시작(i가 0인걸 이용)
               System.out.print("*");
           }
           System.out.println();
       }

        System.out.println("-------------------------");

        /*
             *
            **
           ***
          ****
         *****

         */
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < 5 - 1 - i; j++) {            // 5를 변수로 만들어서 6줄, 7줄까지도 만들 수 있다.
                System.out.print(" ");
            }
            for(int j = 0; j < i + 1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("--------------------------------");
        /*
               *****
                ****
                 ***
                  **
                   *
             */

            for(int i = 0; i < 5; i++) {
                for(int j = 0; j < i; j++) {
                    System.out.print(" ");
                }
                for(int j = 0; j < 5 - i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

        System.out.println("--------------------------");


            /*

             *                  1x2     (i+1)x2-1
            ***                 2x2
           *****                3x2
          *******
         *********

             */

        // 1 3 5 7 9 / 2-1 4-1 6-1 8-1 10-1 2의 배수

       for(int i = 0; i < 5; i++) {                             // 처음에 공백을 먼저 찍고
            for(int j = 0; j < 5 - 1 - i; j++) {
                System.out.print(" ");
            }
            for(int j = 0; j < (i + 1) * 2 - 1; j++) {          // 그 다음에 1 3 5 7 9 개를 바로 찍는다.
                System.out.print("*");
            }
           System.out.println();                                // j 또 쓸 수 있는 이유는 중괄호안이 다르기 때문이다.
       }
    }
}