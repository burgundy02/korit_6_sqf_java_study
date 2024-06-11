package com.study.java_study.ch16_제네릭;

public class MessageMain {
    public static void main(String[] args) {
        // 제네릭 와일드 카드: 기호 -> ?

        // int num;
        // num = 10;

        Message<?> m1;                                  // 와일드카드 Object -> ? / 와일드카드 쓰면 다운캐스팅 해야한다.
        Message<String> m2 = null;                      //와일드 카드로 수용할 수 있는 범위
                                                        // 자기 자신이거나 자신을 상속받은 애들만 와일드카드 / 하행
                                                        // 상행 String 위에는 Object라서 가능 / 나 자신으로 부터 위로는 다 된다.
                                                        // tiger라고 쓰면 animal, Object는 되지만 dog는 안된다.

        m1 = new Message<>("10");
        String s = (String) m1.getMessage();

        // 와일드 카드 제약
        Message<? extends String> m3 = new Message<>("10");
        Message<? super String> m4 = new Message<>(new Object());

        String s2 = m3.getMessage();



    }
}
