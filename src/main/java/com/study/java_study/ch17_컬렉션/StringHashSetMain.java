package com.study.java_study.ch17_컬렉션;

import java.util.*;

public class StringHashSetMain {
    public static void main(String[] args) {

        HashSet<String> strSet = new HashSet<>();

        // 추가
        strSet.add("김지현");
        strSet.add("김지현1");
        strSet.add("김지현2");
        strSet.add("김지현3");

        System.out.println(strSet);

        for(String name : strSet) {
            System.out.println(Objects.hash(name));
        }

        strSet.addAll(List.of("김지현", "김지현", "김지현1"));    // 중복이 안된다. Set은 순서x, 중복x
        ArrayList<String> strList = new ArrayList<>();
        strList.addAll(strSet);

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        };

        strList.sort((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1, o2));
        System.out.println(strList);













    }
}
