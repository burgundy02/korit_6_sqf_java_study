package com.study.java_study.ch18_빌더;

public class DataMain {
    public static void main(String[] args) {
        Data data = new Data("a", 0, 10.5, null);

        Data data2 = new Data();
        data2.setData1("a");
        data2.setData3(3.14);

        DataEntity dataEntity = DataEntity.builder()         // 이렇게 생성 / DataEntity.builder() 클래스명.은 static
                .data2(10)                                   // DataEntity.builder() 객체
                .data1("a")
                .data4("b")
                .build();                                    // 마지막 build()까지 호출하면 dataEntity에 들어간다.


        DataEntity2 dataEntity2 = DataEntity2.builder()
                .data1("a")
                .data2(20)
                .data3(3.14)
                .data4("b")
                .build();

    }
}