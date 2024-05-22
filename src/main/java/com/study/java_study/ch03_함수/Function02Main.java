package com.study.java_study.ch03_함수;

public class Function02Main {
    public static void main(String[] args) {
    /*
    -fx안에는 기능이 있고 fx.하면 안으로 들어감, 호출가능
    -new student() 하면 틀을 가지고 찍어내는 것. 한 변수에 주소가 100이면 변수.하면 그 주소로 간다
    -클래스 안에서 정의한 함수는 메소드, 밖에서는 함수
    -멤버
    -new : new가 들어가면 동적메모리이다. 찍어내는 행위는 전부 동적메모리할당, 주소를 예측할 수 없다 (정적,동적메모리)
    -할당된 메모리가 인스턴스(실제로 메모리를 할당하면 그게 인스턴스)
    -1010이 들어있는 곳의 주소가 2943489라고 한다면 주소로 들어있는 값인 1010을 들고오는 것 보다 변수로 값인 1010을 들고온다.
     */

        Function02 fx = new Function02();  // 붕어빵(객체)이 만들어져야 먹을 수 있다(실행하면 인스턴스)

        fx.fx01();
        fx.fx02(10, 20);
        fx.fx02(100, 200);
        fx.빙수만들기("딸기", 10);

        System.out.println(fx.빙수만들기("딸기", 10) + "주문 완료");
        String 빙수 = fx.빙수만들기("초코", 5);
        System.out.println(빙수);



    }
}
