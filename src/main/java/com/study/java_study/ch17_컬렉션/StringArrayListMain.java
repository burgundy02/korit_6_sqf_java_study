package com.study.java_study.ch17_컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class StringArrayListMain {
    public static void main(String[] args) {
        String[] strArray = new String[10];
        ArrayList<String> strList = new ArrayList<>();          // 순서가 있고 데이터 중복 허용
        strList.add("test1");


        // 배열 <-> 리스트 변환
        List<String> list = Arrays.asList(strArray);
        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list);
        String[] strArray2 = strList.toArray(new String[strList.size()]);

        // 리스트 값 조회
        System.out.println(strList);

        // contains 포함 여부
        System.out.println(strList.contains("test1"));

        // 리스트 바로 생성
        List<Integer> nums = List.of(1, 2, 3, 4);
        System.out.println(nums);

        // 제거
                         // removeAll Set에서 가지고 있는 값과 일치하는 것만 지운다.(인덱스가 아니라 값을 비교)
        strList.add("김지현");
        strList.add("김지현1");
        strList.add("김지현2");
        System.out.println(strList);
        System.out.println(strList.remove("test1"));
        System.out.println(strList);
        System.out.println(strList.remove(1));
        System.out.println(strList);  // 김지현1 지웠다

        System.out.println(nums);
        List<Integer> nums2 = List.of(1, 3, 5);
        ArrayList<Integer> nums3 = new ArrayList<>();
        nums3.addAll(nums);
        System.out.println(nums3.removeAll(nums2));     // nums2 안만들고 바로 넣어도 된다
        System.out.println(nums3);

        // 수정
        nums3.set(0, 10);   // 0을 10으로 바꿔라
        System.out.println(nums3);
        nums3.addAll(List.of(1, 2, 3));
        System.out.println(nums3);

        // 반복
        for(int i = 0; i < nums3.size(); i++) {         // 리스트에서 get해라
            System.out.println(nums3.get(i));
        }

        for(int num : nums3) {
            System.out.println(num);
        }

        Iterator<Integer> ir = nums3.iterator();        // for each랑 비슷
        while(ir.hasNext()) {
            System.out.println(ir.next());
        }





    }
}
// 매개변수로 타입이 정해지는 경우, 대입 되어질 앞의 타입list으로 정해지는 경우