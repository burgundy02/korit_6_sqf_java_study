package com.study.java_study.ch20_람다;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LamdaInterface2 {
    public static void main(String[] args) {
        // Runnable
        Runnable runnable = () -> {
            System.out.println("프로그램 실행");
            System.out.println("프로그램 종료");
        };

        // Runnable 인터페이스에 있는 run()메소드를 람다로 프로그램 실행, 종료 명령을 넣어서 runnable에서 재정의했음
        // 그다음에 runnable.run해서 메소드를 호출하면 오버라이드된 메소드가 호출 된다.
        runnable.run();

        // Function
        // String 타입의 매개변수 s를 Integer.parseInt해서 정수로 바꾼다. 중괄호 생략할거면 return키워드도 같이 생략해야 함,
        // 제네릭으로 타입이 지정 돼 있어서 매개변수의 타입 생략 가능
        Function<String, Integer> function = s -> Integer.parseInt(s);

        // 매개변수의 리턴값을 정수로 만들어준다
        Integer num = function.apply("20");
        System.out.println("num: " + num);

        // andThen메소드
        // "20"이 result에 들어간다.
        Integer num2 = function.andThen(result -> result + 100).apply("20");
        System.out.println();

        // Consumer
        Consumer<String> transform = s -> {
            System.out.println(s + "님이 입장하셨습니다.");
            System.out.println(s + "님 환영합니다.");
        };
        transform.accept("김지현");

        System.out.println("---------------------------");

        // Supplier
        Supplier<Integer> role = () -> {
            Integer result = num + 100;
                return result;
            };
        System.out.println(role.get());

        // Predicate
        Predicate<Integer> even = n -> n % 2 == 0;   // 리턴값이 true이거나 false이거나

        System.out.println(even.test(20));   // 매개변수가 20이기 때문에 결과는 true

    }
}
