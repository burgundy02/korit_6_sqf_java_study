package com.study.java_study.ch20_람다;

public class CustomKeyMain {
    public static void main(String[] args) {

        CustomKey attackKey = new CustomKey() {
            @Override
            public void onKeyPress() {
                System.out.println("공격키 누름");
            }
        };

        attackKey.onKeyPress();
                                        // 생성하면서 대입(new 안해도)
        CustomKey skillKey = () -> {   // CustomKey 인터페이스안에는 하나의 메소드만 들어있어야 함(메소드 이름이 없기 때문에 2개 이상은 누구를 재정의 할지 모름)
            System.out.println("스킬키 누름");
        };

        skillKey.onKeyPress();






    }
}
