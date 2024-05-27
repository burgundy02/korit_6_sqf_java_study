package com.study.java_study.ch04_제어;

import com.study.java_study.ch04_제어.StringUtils;

public class 조건문02 {
    public static void main(String[] args) {
        String text = new String("");   // 공백도 하나의 리터널이다. new String하는 순간 동적할당을 한다.(새로운 주소가 생긴다)
        // 99라는 리터럴주소를 100이라는 주소를 가진 new String에 넣었고
        // 그 new String을 text에 넣었기때문에 text를 불러오면 100이 나옴
        // ex) String a = "김지현";        <- a == "김지현"; true
        // String b = new String("김지현");    <- b == "김지현"; false


        String name = "김지현";   // 값의 자료형이 String       // 99라는 주소를 name에 바로넣음
        String phone = null;    // 값의 자료형이 null         // null안에는 기능들이 없기때문에 호출할 수 없다.

        System.out.println(text);
        System.out.println(name);

        System.out.println(text.length());
        System.out.println(name.length());
//        System.out.println(phone.length());

        StringUtils stringUtils = new StringUtils();

        if (stringUtils.isEmpty(name)) {
            System.out.println("name이 비어있습니다.");
            return;             //  true면 여기서 끝 / 김지현 != "" => false
        }

        if (stringUtils.isEmpty(phone)) {              // 이런 조건식은 쓰면 안된다 : phone에 들어가면 null이기 때문에
            System.out.println("phone이 비어있습니다.");
            return;
        }

        if (stringUtils.isEmpty(text)) {
            System.out.println("text이 비어있습니다.");
            return;         // 이 return은 의미 없음
        }

        // 이런 식에서는 else if쓰지말기 : 가독성 떨어지고 / 참이면 끝이고 아니면 넘어가는 식 -> 굳이 안쓰는게 더 이득

    }
}
