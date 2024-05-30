package com.study.java_study.ch10_추상화01;

public class Tiger extends Animal{
    private int power;

    public Tiger(String name, int age, int power) {     // Tiger가 매개변수를 받아서 Animal까지 전달한다.
        super(name, age);           // 부모 name,age에 매개변수 전달
        this.power = power;         // 이 클래스의 power에 매개변수 power전달
    }

    public Tiger() {
        super();    //Aanimal 객체 생성자 호출 기본적으로 생략 돼 있음 // super에 괄호를 열고 닫으면 부모객체 생성이된다.
        System.out.println("호랑이 객체 생성");
//        super();  : 부모가 먼저 오기전에 자식객체에서 어떤 행동을 할 수 없다.
    }

    @Override
    public String toString() {              // power를 출력하고 Animal을 보기위해서
        return "Tiger{" +
                "power=" + power +
                "} " + super.toString();
    }

    // 재정의 -> 상속관계에서만 가능
    @Override // @어노테이션
    public void move() {            // 물려준걸 자식 쪽에서 재정의 할 수 있다.
        System.out.println("호랑이가 네 발로 뛰어 갑니다.");
        super.move();               // 부모의 move도 호출 (호출에는 순서없음, 생성에만 순서가 상관있음)
    }


    public void hunt() {
        System.out.println("호랑이가" + power + "의 힘으로 사냥을 합니다.");
    }
}
