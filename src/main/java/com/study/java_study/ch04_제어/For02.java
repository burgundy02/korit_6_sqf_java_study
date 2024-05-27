package com.study.java_study.ch04_제어;

public class For02 {
    public static void main(String[] args) {

        for(int i = 0; i < 3; i++) {
            System.out.println(i + 1 + "일차");
            for(int j = 0; j < 10 * (i + 1); j++) {
                System.out.println("줄넘기: " + (j + 1)+ "개");    // 문자열 뒤에 j가 바로오면 문자열로 인식해서 괄호로 우선순위를 정함
            }                                                     // 두 번째 반복문은 조건이 다 성립될 때까지 반복한다. 그 다음에
        }                                                         // 다시 올라감


    }
}
