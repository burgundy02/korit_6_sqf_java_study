package com.study.java_study.ch05_입력;

import java.util.Scanner;

public class 입력02 {
    public static void main(String[] args) {
        String name = null;     // next()
        int age = 0;            // nextInt()
        String address =  null; // nextLine()
        String gender = null;   // next()
        String phone = null;    // nextLine()

        /*
        이름 : 김지현
        나이 : 23
        주소 : 부산 서구
        성별 : 여
        연락처 : 010 - 1234 -5678
          */

        Scanner scanner = new Scanner(System.in);

        System.out.print("이름 : ");
        name = scanner.next();

        System.out.print("나이: ");
        age = scanner.nextInt();

        scanner.nextLine();             // 남아있는 엔터를 날린다.

        System.out.print("주소: ");
        address = scanner.nextLine();

        System.out.print("성별: ");
        gender = scanner.next();

        scanner.nextLine();          // 엔터날리기

        System.out.print("연락처: ");
        phone = scanner.nextLine();

        System.out.println();

        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("주소 : " + address);
        System.out.println("성별 : " + gender);
        System.out.println("연락처 : " + phone);

    }
}
