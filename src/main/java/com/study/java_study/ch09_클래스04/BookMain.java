package com.study.java_study.ch09_클래스04;

public class BookMain {
    public static void main(String[] args) {
        BookService bookService = new BookService();

        System.out.println("프로그램을 실행합니다.");

        while(bookService.run()) {}          // run이 false가 될때까지 계속 반복 / while문은 돌 떄마다 메서드 호출

        System.out.println("프로그램을 종료합니다.");


    }
}
