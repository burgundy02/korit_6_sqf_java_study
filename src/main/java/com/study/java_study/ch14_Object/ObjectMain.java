package com.study.java_study.ch14_Object;

import java.util.Objects;

/*
 Object 클래스(최상위 클래스)
 - 모든 클래스는 최상위 클래스를 extends하고 있다. 그래서 object 클래스 안에 들어있는 것을 쓸 수 있다.

 - 모든 데이터를 다 수용해야 할 때 밑에 처럼 업캐스팅해서 사용된다.
 */
public class ObjectMain {
    public static void main(String[] args) {
        Object object = new Object();       // Object클래스 객체 생성
        Student student = new Student("김지현", 23);
        Student student2 = new Student("김지현", 23);

        Object[] objects = new Object[3];       // 어떤 자료형이든 최상위 클래스라서 업캐스팅 가능하다
        objects[0] = new Object();
        objects[1] = "test";
        objects[2] = new Student("김지현", 23);


        // toString 설명
//        System.out.println(student.toString());
        System.out.println(student);


        System.out.println(student);
        String str = new String("데이터");
        System.out.println(str.equals("test"));

        String studentData = student.toString();  // 단순히 주소값만 / toString 해줘야 대입이된다(?)

        System.out.println(student.equals(student2));

        System.out.println(student.hashCode());
        System.out.println(student2.hashCode());

        System.out.println(student.hashCode() == student2.hashCode());   // true가 나왔으면 좋겠다

        System.out.println(Objects.hash("김지현"));        // 동일한 해쉬 값이 나온다
        System.out.println(Objects.hash("김지현"));













    }
}

// getClass(); - 객체 자료형 비교할 때 사용

// hashcode(); 해당 객체.해쉬코드하면 그 객체의 주소를 알려줌