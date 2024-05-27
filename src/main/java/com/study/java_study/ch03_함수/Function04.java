package com.study.java_study.ch03_함수;

public class Function04 {
    // 오버로딩(어떤 자료형을 가지느냐에 따라서 알아서 매개변수가 찾아감, 메서드명 중복 가능 :
    // 매개변수 개수가 다르거나, 매개변수 자료형이 다르거나(순서 달라도 됌), 리턴자료형이 다르면 오버로딩안된다(void와 int 안된다)
    // 오버로딩의 사용처 : 같은 이름의 메서드명인데 매개변수가 web이고, http라면 매개변수 입력에 따라 다양한 경우의 수를 쓸 수 있다.

    void add(int a, int b) {
        System.out.println("a + b");
    }
    // 리턴자료형
    void add(int a, String b) {

        int c = Integer.parseInt(b);

        System.out.println(a + b);
    }

    void add(int a, int b, int c){
        System.out.println(a + b + c);
    }


}
