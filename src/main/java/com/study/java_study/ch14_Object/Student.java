package com.study.java_study.ch14_Object;

import java.util.Objects;

public class Student {    // extends Object가 생략 돼 있다.    // 대부분 이 순서대로 코드를 작성. 나중에 위에 어노테이션 하나 달고
                                                             // 간편하게 쓸 수 있음
    private String name;                // 변수
    private int age;


    public Student(String name, int age) {          //생성자
        this.name = name;
        this.age = age;
    }

    // getter ande setter


    @Override
    public boolean equals(Object obj) {                 // equals
        if(this == obj) {                               // 배열의 주소 비교가 아니라 값 비교로 바꿔서 사용하는 equals
            return true;
        }
        if(obj.getClass() == this.getClass()) {
            Student student = (Student) obj;
//            return Objects.equals(Student.name, name) && Objects.equals(student.age, age); // Objects 처럼 뒤에 s가 붙는 것들 : 오브젝트를 다루는 데 필요한 도구들이 듦
        }
        return false;
    }



    @Override                                           // hashCode
    public int hashCode() {                             // 완전히 다른 객체라도 안에 든 값이 같은지 비교(쓸 일 없음)
        return Objects.hash(name, age);
    }


    @Override                           // object 클래스에서 override한 것         // toString
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }






}
