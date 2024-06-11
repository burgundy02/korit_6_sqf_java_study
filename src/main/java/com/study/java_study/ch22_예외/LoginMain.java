package com.study.java_study.ch22_예외;

import java.util.Scanner;

public class LoginMain {
    // 입력 받은 값이 USERNAME, PASSWORD와 하나라도 일치하지 않으면 예외 발생
    private static final String USERNAME = "admin";
    private static final String PASSWORD = "1234";

    public static void login(String username, String password) throws LoginException {
        // 1. 만약 이 조건이 성립하면
        if(!(USERNAME.equals(username) && PASSWORD.equals(password))) {
            // 2. 예외를 터트려라
            throw new LoginException("로그인 실패", username);
        }
        System.out.println("로그인 성공 이후 절차 진행");
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String username;
        String password;

        System.out.println("사용자이름: ");
        username = scanner.nextLine();
        System.out.println("비밀번호: ");
        password = scanner.nextLine();

        try {
            login(username, password);
        } catch (LoginException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getErrorMessage());
            e.printStackTrace();
        }

        System.out.println("프로그램 종료");

    }
}