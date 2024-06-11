package com.study.java_study.ch17_컬렉션;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class StringHashMapMain {
    public static void main(String[] args) {
        HashMap<Integer, String> strMap = new HashMap<>();

        strMap.put(10, "김지현");
        strMap.put(11, "김지현1");
        strMap.put(12, "김지현2");
        strMap.put(13, "김지현3");

        System.out.println(strMap);

        System.out.println(strMap.get(11));     // 이 key값을 입력하면 해당 value값을 가져온다.

        Map<String, String> lang = Map.of(
                "java", "자바",
                "c", "C",
                "python", "파이썬",
                "js", "자바스크립트"
        );

        System.out.println(lang);

        System.out.println(lang.get("java"));

        // entry를 왜 쓰는가?
        // Map.entry 스태틱
        // key = value가 하나의 객체로 묶여져있지 않고 각각 키랑 벨류의 값으로 나눠져있다.
        // 나눠져있어서 for each에 넣지 못해서 entry로 묶어준다.
        // Map을 반복을 돌리기 위해 entry 사용
        // List는 인터페이스라서 생성 x, List<String> list = List.of()는 가능
        // 캐스팅 할 수 있는 상황을 만들어야한다. : List<> = 에 ArrayList등등을 넣어서 언제든지 바꿀 수 있게 캐스팅 할 수 있는 상황을 만든다.
        // List<>, Set<>, Map<> 이라는 인터페이스에 AL, LL/ HS, TS/ HM, TM을 넣어서 사용한다.
        // List자체는 인터페이스라서 생성을 못한다 그래서 AL같은 애들로 생성, 근데 List에 넣어서 캐스팅할 수 있는 상황을 만드는게 좋아서
        // 저런 인터페이스에 넣는다.

        // List.of, Map.of, Set.of 등 of를 써서 만들면 정해진 데이터를 수정x. of 쓰면 수정x.   // abstract List(인터페이스)


        //- entry는 list에는 못넣는다. Set으로 / entry도 제네릭
        //  set 안에 엔트리 엔크리안에 키 vlue String 2개
        //- key, value를 entry로 하나로 묶어서 get으로 불러온다.

        Set<Map.Entry<String, String>> entries = lang.entrySet();

        // for each는 하나의 변수에 하나씩만 꺼낼 수 있다
        for(Map.Entry<String, String> entry: entries) {
            System.out.println("key : " + entry.getKey());
            System.out.println("value : " + entry.getValue());
        }












    }
}
