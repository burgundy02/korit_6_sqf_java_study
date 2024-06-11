package com.study.java_study.ch19_익명클래스;

public class KeyMain {
    public static void main(String[] args) {

        Key attackKey = new AttackKey();
        attackKey.onKeyDown();
        attackKey.onKeyUp();

        Key customKey = new Key() {
            @Override
            public void onKeyUp() {
                System.out.println("커스텀 키 뗌");
            }

            @Override
            public void onKeyDown() {
                System.out.println("커스텀 키 누름");

            }
        };     // 클래스파일을 따로 만들지 않고 여기서 정의, 생성함 / Key()를 implem해서 중괄호에 AttackKey처럼 따로 한 게아니라 일회용으로 여기서 쓰고 말 용도


       customKey.onKeyDown();
       customKey.onKeyUp();















    }
}
