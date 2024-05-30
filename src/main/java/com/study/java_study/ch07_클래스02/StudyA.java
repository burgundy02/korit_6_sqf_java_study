package com.study.java_study.ch07_클래스02;

public class StudyA {
    int num;
    int num2;

    // 생성자
    // 1. 클래스 명과 동일하다.
    // 2. 리턴 자료형이 없다.
    // 3. 생성자는 무조건 할당된 메모리의 주소를 리턴한다.

    //NoArgsConstructor
    StudyA() {
        System.out.println("스터디 에이 객체 생성");
    }

    //AllArgsConstructor
    StudyA(int num, int num2) {                      // 생성자 이름이면서 리턴자료형이다.
        System.out.println("스터디 에이 객체 생성");
        this.num = num;                              //  그냥 num쓰면 지역변수가 우선
        this.num2 = num2;
    }                      // 생성자를 통해 변수에 접근

    /*
    - this. 자기 자신의 주소 / (this.는 객체 자체를 가리킨다.) ex) 99라는 주소를 가진 클래스에서 this.num하면 99.num
    - 한 중괄호 안이 지역
     */

    void increase(int increaseNum) {
        num += increaseNum;             // 객체의 동작을 담당
        num2 += (increaseNum * 2);
    }

    void decrease(int decreaseNum) {
        num -= decreaseNum;
        num2 -= (decreaseNum * 2);
    }
}
