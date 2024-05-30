package com.study.java_study.ch11_추상화02;

public class AnimalMain {
    public static void main(String[] args) {
//        Animal a = new Animal();

        Animal[] animals = new Animal[10];      // 위 주석처럼 생성은 못해도 배열은 공간을 만드는 거라서 가능

        for(int i = 0; i < animals.length; i++) {
            animals[i] = i % 2 == 0 ? new Dog() : new Tiger();
        }

        for(Animal animal : animals) {
            animal.move();
        }
    }
}
