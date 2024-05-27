package com.study.java_study.ch07_클래스02;

public class StudyB {

    private String name;        // 같은 클래스 안에서만 접근 가능
    private int age;

    public StudyB() {}          // 기본이 이거고 생략돼 있는데 밑에서 오버로딩하면 이거는 비활성화 된다. 이것도 쓰고 싶으면 정의해야 함

    public StudyB(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void show() {
        System.out.println(name);
        System.out.println(age);
    }
}
