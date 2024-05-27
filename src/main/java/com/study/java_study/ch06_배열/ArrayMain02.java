package com.study.java_study.ch06_배열;

public class ArrayMain02 {
    public static void main(String[] args) {
        // "김지현" => 999
        String a = "김지현";              // 999
        String b = new String("김지현");  // 200번 안의 999

        System.out.println(a);
        System.out.println(b);

        System.out.println(a == "김지현");
        System.out.println(b == "김지현");

        String[] names = new String[2];
        names[0] = "김지현";                                             // "김지현"을 변수에 넣으면 "김지현"의 리터럴주소이 생긴다.
        names[1] = new String("김지현");                                 // names와 names2의 값을 비교하면 똑같은 리터럴주소을 가지고 있어서
                                                                        // true이다.
        String[] names2 = new String[] {"김지현", new String("김지현")};  // new String[]생략가능 / 문법상 크기를 입력하면 x
                                                                        // 뒤에 null을 일일이 붙여서 값은 두 개만 넣지만 빈 방은 999개인
                                                                        // 배열도 만들 수 있다.
        System.out.println("--------------------------------------");

        System.out.println(names[0] == names2[0]);
        System.out.println(names[1] == names2[1]);

        System.out.println("-----------------------------------------");

        System.out.println(names == names2);  // 배열비교 : names와 names2의 주소가 같은지 비교(안에 들어있는 거x)

        System.out.println("-----------------------------------------");

        System.out.println(new String[2]);            // 이건 new String[]생략하면 안된다. 위에는 새로 생성하는구나를 알지만 이건 아님
        System.out.println(new String[] {"a", "b"});  // new String의 주소가 출력된다.

        /*
        배열의 특징
        1. 값의 중복이 허용(각각 인덱스 번호로 구분가능)
        2. 배열의 크기는 바꿀 수 없다.(바꾸고 싶으면 새로 만들어야 함 : 인덱스번호는 같기때문에 새로 반복문으로 넣음)
         */
    }
}
