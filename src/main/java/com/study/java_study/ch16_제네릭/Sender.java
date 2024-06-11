package com.study.java_study.ch16_제네릭;

import lombok.ToString;

@ToString
public class Sender<T, T2, T3> {                          // Object클래스로 쓰면 업캐스팅하고 다운캐스팅해서 써야한다.
    private T data1;                                      // 생성할때 메모리에 할당할 때 타입을 지정한다.
    private T2 data2;
    private T3 data3;


    public T getData1() {
        return data1;
    }

    public void setData1(T data1) {
        this.data1 = data1;
    }

    public T2 getData2() {
        return data2;
    }

    public void setData2(T2 data2) {
        this.data2 = data2;
    }

    public T3 getData3() {
        return data3;
    }

    public void setData3(T3 data3) {
        this.data3 = data3;
    }

    public Sender(T data1, T2 data2, T3 data3) {
        this.data1 = data1;
        this.data2 = data2;
        this.data3 = data3;

    }
}

