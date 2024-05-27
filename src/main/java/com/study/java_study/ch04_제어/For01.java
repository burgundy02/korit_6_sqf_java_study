package com.study.java_study.ch04_제어;

public class For01 {
    public static void main(String[] args) {
        for(int i = 0; i < 10000; i++) {       // 초기문이라서 한 번만 초기 / 후처리라서 마지막 순서
            System.out.println(i + 1);
        }

        for(int i = 0; i < 10000; i++) {
            System.out.println(10000 - i);    // 위에 건들지 말고 여기 건들기
        }

    }
}
