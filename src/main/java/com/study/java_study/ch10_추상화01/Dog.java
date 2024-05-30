package com.study.java_study.ch10_추상화01;

public class Dog extends Animal{          // Animal에서 확장된다. Animal에서 살을 붙여서 Dog를 만든다.
    private String breed;


    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }

    @Override
    public void move() {            // ctrl + o하면 자동 상속
        System.out.println("강아지가 네발로 움직입니다.");
    }

    public void bark() {
        System.out.println(breed + "종의 강아지가 짖습니다.");
    }


    public Dog() {
        super();    //Aanimal 객체 생성자 호출 기본적으로 생략 돼 있음 // super에 괄호를 열고 닫으면 부모객체 생성이된다.
        System.out.println("강아지 객체 생성");


    }
}
