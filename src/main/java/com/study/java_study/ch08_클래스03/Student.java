package com.study.java_study.ch08_클래스03;

public class Student {

    private int code;
    private String name;
    private int age;

    public Student() {}

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public Student(int code, String name, int age) {
        this.code = code;
        this.name = name;
        this.age = age;
    }
}
