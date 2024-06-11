package com.study.java_study.ch19_익명클래스;

public class CarMain {
    public static void main(String[] args) {
        KiaCar kiaCar = new KiaCar("k8", "화이트");
        System.out.println(kiaCar);

        // KiaCar클래스처럼 안만들고 한 번쓰고 말 클래스는 이렇게 이름없이 만듬 : 익명클래스 / 익명클래스를 생성하려면 추상클래스이거나 인터페이스이거나
        // 익명클래스 쓰는 이유 : 한 페이지 넘어가면 안쓰는 것들을 익명클래스로 일회용으로 씀
        // 익명클래스 : 부모가 가지고 있는거를 잠시 오버라이드해서 쓰고 말 용도 / 객체의 형태를 잠시 쓰고말 형태로 쓰고 말 용도 / 생성자 정의 불가
        // : 생성자 이름은 클래스 이름인데 익명클래스는 클래스 이름이 없기 때문에 불가
        AbstractCar abstractCar = new AbstractCar("내가 만든 자동차", "블랙") {
            @Override
            public void createCar() {
                System.out.println("한 번 만들어봄");
            }

            @Override
            public void showCar() {
                System.out.println("자동차 정보...");

            }
        };




    }
}
