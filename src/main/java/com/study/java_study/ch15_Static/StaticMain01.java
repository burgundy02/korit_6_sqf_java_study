package com.study.java_study.ch15_Static;

/*
 스태틱(static)
 - 일반 변수나 메소드의 경우 객체가 생성될 때마다 호출되기 때문에 서로 다른 주소값을 가지고 있다.
 - 각 객체들에서 공통적으로 관리해야하는 경우는 static 키워드를 사용하는 것이 유용하다.
 - 객체에 소속된 멤버가 아닌 클래스 자체에 소속된 멤버이기 때문에 new 키워드 없이 해당 멤버를 사용할 수 있다.
 - static은 static끼리 객체 생성없이 바로 쓸 수 있다.
 1. 공유 영역(다른 객체들끼리 공유할 수 있다)
 2. 스태틱 변수나 메소드는 클래스명. 을 통해 접근한다.

 메모리에 존재하지 않는 얘들은 호출해서 쓸 수 없다. static이 아닌 얘들
 static은 정적할당 : 유일(동적할당/ 할 이유가 없다면 전부 다 static해도 된다)
 static은 클래스 생성없이 바로 . 찍어서 호출할 수 있다 (static이 아닌얘들은 반드시 클래스생성을 해야 사용할 수 있음)
 클래스명. 찍으면 static / Arrays.sort()도 static
 */
public class StaticMain01 {
    public static void main(String[] args) {
        System.out.println(Static01.num);
        Static01.num = 20;                      // 객체 생성 안하고 클래스명. 해서 쓸 수 있다.
        System.out.println(Static01.num);

        Static01 static01 = new Static01();
        static01.num = 30;

        System.out.println(Static01.num);


    }
}
