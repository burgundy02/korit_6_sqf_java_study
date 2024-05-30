package com.study.java_study.ch01_변수와_자료형;

public class Operation01 {
    public static void main(String[] args) {

        /*

        f5 = 파일, 폴더 복사

        ctrl + o = 오버라이드 단축

        ctrl + i = 오버라이트 인터페이스만 단축

        shift + f6 = 클래스 이름 바꾸기

        ctrl + Alt + l = 정렬 단축키

        윈도우 + shift + s = 마우스로 드레그 범위설정 캡쳐

        shift + alt + +,- = 글자 크기 조절

        alt + insert = 생성자, getter, setter, to String

         리팩토링 : 쓸 때없는 변수 만들지 말고 그냥 호출,리턴해라(코드 최대한 줄여라)
         좋은 예 )

         클린코드 : 읽기좋게 가독성있게

            비지니스레이어를 service에 mvc가 지금 포함 돼 있음
            그 안에 데이터를 추가하고 조회하고 하는 것들을 리포지토리에서 함
            엔티티는 정보의 집합체
         */


        // 연산자

        // 산술연산자
        int num1 = 10 + 20;
        int num2 = 9 / 2;
        System.out.println(num2);
        int num3 = 9 % 2; //나머지
        System.out.println(num3);
        boolean num4 = 5 % 2 == 0;
        System.out.println(num4);

        System.out.println("////////////");

        // 증감연산
        int i = 0;
        System.out.println(i);
        i++;
        System.out.println(i);
        i = i + 1;
        System.out.println(i);

        ++i;
        System.out.println(i);
        System.out.println(++i); // 즉시증가
        System.out.println(i++); // 이 명령이 끝나고 증가
        System.out.println(i);

        System.out.println(--i);
        System.out.println(i--);
        System.out.println(i);

        // 논리연산자
        // true => 1
        // false => 0
        // && => AND(곱)
        // || => OR(합)
        // ! => NOT(부정)
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(true || true); // 0이 아니면 true
        System.out.println(false || false);
        System.out.println(!true && true);

        // 관계연산자
        System.out.println(3 > 2 && 1 == 1);
        System.out.println(1 != 1);

       // 조건연산자
        System.out.println(3 > 2 ? 10 : 20);
        int x = 10;
        int y = 2;

        String result = x % y == 0 ? "y의 배수입니다." : "y의 배수가 아닙니다."; // 3항연산자는 자료형 일치
        String result2 = "" + 10 / 2;

        // 복합대입연산자
        int number = 10;
        number += 5;        // 15
        number -= 1;
        number *= 2;
        number /= 2;
        number %= 2;

    }
}
