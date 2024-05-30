package com.study.java_study.ch12_추상화03;

/*
인터페이스의 특징
1. 일반 클래스와 동일하게 정의할 수 없다.
2. 일반 변수(멤버변수)를 정의 할 수 없다.
3. 무조건 상수만 정의 할 수 있다.
4. 일반 메소드(멤버메소드)를 정의하기 위해서는 default 키워드를 사용하여야한다.
5. 추상메소드를 정의 할 때 abstract 키워드를 생략 할 수 있다.
6. 인터페이스 안에 정의되어 지는 모든 상수와 메소드들은 public 접근 지정자를 사용한다. (그래서 생략 가능)
 인터페이스와 인터페이스끼리는 extends로 상속

- 리모컨과 에어컨 리모컨은 상속, 버튼과 리모컨은 인터페이스 im~로 받는다(기능적인거는 인터페이스, 버튼이 리모컨에만 있는게 아니기깨문이다)

- 하위개념인 초등학생, 중학생, 고등학생의 공통사항인 학생이 학생이라는 상위개념에 업캐스팅할 수 있다.
 */
public interface Authority {
    // public static final 생략
    public String DEFAULT_ROLE = "ROLE_USER";       // 상수

//    public static final String DEFAULT_ROLE = "ROLE_USER";

    // public abstract 생략
      String getAuthority();    // ;이 있는 것 자체가 abstract 생략

    // public 생략
      default void printAuthority() {       // 인터페이스 안의 일반메소드를 가리키는 default
        System.out.println(DEFAULT_ROLE);
    }
}
