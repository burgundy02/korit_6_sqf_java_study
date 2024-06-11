package com.study.java_study.ch20_람다;

public class AdditionMain {
    public static void main(String[] args) {

        Addition addition = new Addition() {    // 익명클래스, 정의와 생성을 동시에
            @Override
            public int add(int x, int y) {
               return x + y;
            }
        };

        int result = addition.add(10, 20);
        System.out.println("결과: " + result);


        Addition addition2 = (x, y) -> x + y;   // 익명클래스의 정의와 생성을 람다로 줄일 수 있다.(정의, 생성이 포함 돼 있음)
        result = addition2.add(10,20);
        System.out.println("결과: " + result);







    }
}
