package com.study.java_study.ch20_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdaInterface {
    public static void main(String[] args) {
        // Runnable은 매개변수도 없고, 리턴값도 없는 인터페이스
        // Runnable이라는 인터페이스안에 있는 run() 메소드를 재정의 (override와 new 생략: 람다)
        Runnable runnable = () -> {
            System.out.println("프로그램 실행");     // 메뉴만들기에서 run쓸 때 이걸로도 쓸 수 있음
            System.out.println("프로그램 종료");
        };

        runnable.run();


        // Function 인터페이스 / 제네릭 지정안하면 매개변수, 리턴타입 오브젝트로 자동완성 된다.
        // 메소드에 리턴 밖에 없으면: 명령이 한 줄이면 중괄호 생략(리턴도 같이 생략), 매개변수 한 개면 소괄호 생략가눙
        Function<String, Integer> fx = s -> Integer.parseInt(s);  // parseInt는 문자열 10을 정수로 바꿔준다.

        Integer num = fx.apply("10");
        System.out.println("num: " + num);

        // 출력하면 110
        Integer num2 = fx.andThen(result -> result + 100).apply("10"); // apply의 값이 result에 들어간다
        System.out.println("num2: " + num2);



        // Consumer은 매개변수는 있고, 리턴값은 없다
        // Consumer 인터페이스 / 명령어 하나면 중괄호 생략 가능 / 제네릭으로 타입이 지정 돼 있어서 타입 생략 가능
        Consumer<String> transform = s -> {
            System.out.println(s + "님이 서버에 접속하였음");
            System.out.println(s + "님 환영합니다.");
            };

        transform.accept("김지현");


        // Supplier 인터페이스
        Supplier<Integer> role = () -> {
            Integer result = num + 999;   // 람다를 사용하면 이렇게 num을 정의해서 쓸 수 있다. 메소드 안의 메소드 정의 가능
            return result;
        };

        System.out.println(role.get());


        // Predicate 인터페이스 boolean타입으로 알려줌
        Predicate<Integer> even = n -> n % 2 == 0;

        System.out.println(even.test(10));


    }
}
