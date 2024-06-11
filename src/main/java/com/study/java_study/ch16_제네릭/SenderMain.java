package com.study.java_study.ch16_제네릭;

public class SenderMain {
    public static void main(String[] args) {

        // [Wrapper 자료형] 일반 자료형이 Wrapper자료형으로 되는 게 박싱, Wrapper자료형이 일반 자료형으로 되는 게 언박싱
       // Integer int / Boolean --(언박싱)--> boolean / Character <--(박싱)-- char / Double double / Long long / Float float


        Integer num = new Integer(10);      // 박싱
        int num2 = num.intValue();          // 언박싱

        Integer num3 = 20;                  // 자동 박싱        20이 Integer안으로 박싱된다
        int num4 = num3;                    // 자동 언박싱

        Sender<Integer, String, Double> sender = new Sender<>(10, "20", 3.14); // 앞에 자료형쓰면 뒤에는 생략 가능





    }
}
