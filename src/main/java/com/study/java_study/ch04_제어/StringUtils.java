package com.study.java_study.ch04_제어;

public class StringUtils {
    boolean isEmpty(String str) {
        if (str == null) {           //str이 비어있거나 ""이 들어있거나 / null을 항상 앞에둬서 체크
            return true;
        }
        return str.equals("");      // false면 이까지 온다 / 근데 "김지현과 ""는 !=이라서 false가 나온다.
                                    //name안에 들어있는 값이 ""이랑 같니? / name은 boolean이라서 같다면 true가 나옴
    }
}
