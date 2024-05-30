package com.study.java_study.ch10_추상화01;

public class Animal {                       // Animal은 Dog,Tiger을 추상화했다.
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Animal() {
        System.out.println("동물 객체 생성");

    }

        public void move() {
            System.out.println("동물이 움직입니다.");

    }
}
