package com.study.java_study.ch04_제어;

public class 스위치 {
    public static void main(String[] args) {
        String grade = "A";             // 목차를 선택하면 그 선택부터 쭉 나오는 예(break X)
                                        // 게임에서 깨면 다음 단계로 넘어가고 아니면 멈춤(break O)
        switch (grade) {                // 로그인할 때 소셜로그인할 떄 구글이면 구글로 넘어가면 거기에 맞는 조건을 쓰고 break;
            case "A":                   // kakao면 거기에 맞는 걸로 break;
                System.out.println("A등급");      // 조건문은 수많은 갈림길 중 하나에 가게 해주는 것
                break;
            case "B":
                System.out.println("B등급");
                break;
            case "C":
                System.out.println("C등급");
                break;
            case "D" :
                System.out.println("D등급");
                break;
            default:
                System.out.println("F등급");

        }



    }
}
