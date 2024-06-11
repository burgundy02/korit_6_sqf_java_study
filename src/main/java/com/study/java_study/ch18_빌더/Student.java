package com.study.java_study.ch18_빌더;

public class Student {
    private int studentCode;
    private String name;
    private int age;

    // 2. 상위 클래스의 생성자 필요(All)
    public Student(int studentCode, String name, int age) {
        this.studentCode = studentCode;
        this.name = name;
        this.age = age;
    }


    // 3. 메소드 필요 (시작점)
    // 리턴값이 클래스 안의 static 클래스인 메소드
    public static StudentBuilder builder() {
        return new StudentBuilder();
    }


    // 1. 클래스 안의 클래스
    public static class StudentBuilder {
        private int studentCode;
        private String name;
        private int age;


        // 4. StudentBuilder클래스 안에 메소드 만들기
        public Student build() {
            return new Student(studentCode, name, age);
        }

        public StudentBuilder studentCode(int studentCode) {
            this.studentCode = studentCode;
            return this;
        }

        public StudentBuilder name(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder age(int age) {
            this.age = age;
            return this;
        }
    }
}