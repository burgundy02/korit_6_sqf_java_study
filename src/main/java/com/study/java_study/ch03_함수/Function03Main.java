package com.study.java_study.ch03_함수;

public class Function03Main {
    public static void main(String[] args) {
        Function03 fx = new Function03();

        fx.fx01(1234, "김지현", 31, "01012345678"); // 0으로 시작해서 전화번호 문자열

        Student student = new Student();
        student.studentCode = 1234;
        student.name = "김지현";
        student.age = 31;
        student.phone = "01023343";

        fx.fx02(student);







    }


    }
