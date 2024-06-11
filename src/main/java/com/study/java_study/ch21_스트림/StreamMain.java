package com.study.java_study.ch21_스트림;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        /*
        생성(사용) 절차
        1. 배열 생성 -> 스트림으로 변환
        2. List 생성 -> 스트림으로 변환
        3. generate 메소드 -> 스트림 생성
        4. 범위 지정 -> 스트림 생성
        5. 빌더 -> 스트림 생성

        중간(가공) 절차
        1. map(Function)
        2. filter(Predicate) // 조건에 해당하는 것만 map()에 넣겠다(새로운 스트림에)
        3. sorted(Comparator) // 정렬

        최종(결과) 절차
        1. collect -> stream을 list 변환
        2. 반복자 -> forEach
         */

        Stream<Integer> st1 = Arrays.stream(new Integer[] {1, 2, 3, 4, 5});  // 생성
//        System.out.println(st1);  stream이야 라고만 출력 된다

        // 스트림이 실행될 때 중간에 확인할 때 사용
        // for each처럼 스트림에서 n에 1~5까지 담아서 *2 해서 새로운 스트림에 넣는다.
        List<Integer> numberList = st1.map(n -> n * 2)   // 가공
                .peek(n -> System.out.println(n)) // 가공(기타스트림 메소드)
                .collect(Collectors.toList()); // 최종
// [1, 2, 3, 4, 5] =>  [2, 4, 6, 8, 10]해서 List에 넣는다

        numberList.forEach(n -> System.out.println("n: " + n));


        // List에 [2, 4, 6, 8, 10]이 들어있는데
        List<Integer> filteringNumberList = numberList.stream()
                .map(n -> n / 2)
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(filteringNumberList);

        List<Integer> sortedNumberList = numberList.stream()
                //  o2 - 01 내림차순
                .sorted((o1, o2) -> o2 - 01)
                // 리스트로 바꾸기
                .collect(Collectors.toList());

        System.out.println(sortedNumberList);

        Stream<String> nameStream = Stream.<String>builder()
                .add("김지현1")
                .add("김지현2")
                .add("김지현3")
                .add("김지현4")
                .add("김지현5")
                .build();

//        nameStream.sorted().forEach(name -> System.out.println(name));
        // 역정렬 / 문자열은 정수가 아니기 때문에 hash값을 입력한다.
        nameStream
                .sorted((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o2, o1))
                .forEach(name -> System.out.println(name));

        List<Phone> phoneList = List.of(
                Phone.builder().number(1).model("아이폰").build(),
                Phone.builder().number(2).model("갤럭시").build(),
                Phone.builder().number(3).model("샤오미").build()
        );

        // 세 번 만들어서 각 각 1개씩 쓸 수 있음
        // [p1, p2, p3]를 100번 주소를 200번을 만들어서 새로 넣는다 [     ]
        phoneList.stream().map(phone -> Phone.builder()
                .number(phone.getNumber() * 2)
                .model(phone.getModel())
                .build())
                .forEach(phone -> System.out.println(phone));


        phoneList.stream()
                .filter(phone -> phone.getNumber() % 2 != 0)  // phone객체에서 하나 꺼내서 2로 나눴을 떄 아니면(조건)
                .forEach(phone -> System.out.println(phone));


        phoneList.stream()
                // 역정렬
                .sorted((o1, o2) -> o2.getNumber() - o1.getNumber())
                .forEach(phone -> System.out.println(phone));

        phoneList.stream()
                .sorted((o1, o2) -> String.CASE_INSENSITIVE_ORDER.compare(o1.getModel(), o2.getModel()))
                // 쓰려고 하는 메소드만 적어주면 된다, println메소드에 집어 넣는다
                .forEach(System.out :: println);


    }
}
