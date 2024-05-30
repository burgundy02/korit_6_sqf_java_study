package com.study.java_study.ch07_클래스02;

public class StudyB {

    private String name;        // 같은 클래스 안에서만 접근 가능
    private int age;

    public StudyB() {}          // 기본이 이거고 생략돼 있는데 밑에서 오버로딩하면 이거는 비활성화 된다. 이것도 쓰고 싶으면 정의해야 함

    public StudyB(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {              // 외부클래스의 매개변수가 private 변수에 접근하려면 setter를 써야 한다.
        this.name = name;
    }

    public String getName() {                       // 외부클래스에서 private 변수를 호출하려면 getter를 써야한다.
        return name;
    }

    public void show() {                            // 메서드 : b.show()하면 so가 출력된다.
        System.out.println(name);
        System.out.println(age);

    }
}
