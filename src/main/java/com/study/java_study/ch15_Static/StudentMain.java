package com.study.java_study.ch15_Static;

/*
    싱글톤 디자인 패턴                              // 싱글톤 : 유일한 객체 하나로(하나의 주소로) 계속 쓸 수 있다.
    1. 객체를 유일하게 하나만 생성하여 사용하는 기법                        // 삼성이라는 객체에서 사원증을 발급한다는 메소드가 있다면 이 객체는 다른
    2. 생성자가 private으로 외부에서는 생성할 수 없다.                   // 엘지에(다른객채는 못감)
 */
public class StudentMain {
    public static void main(String[] args) {
//    StudentService studentService = new StudentService();

        StudentService studentService = StudentService.getInstance(); // 싱글톤 : 나중에 한 번 더 호출하면 전에 만들어 놓은게 출력된다.
        StudentService studentService2 = StudentService.getInstance();

        studentService.addStudent();
        StudentRepository.getInstance().add("김지현1");    //원래는 new해서 생성했어야한다.
        studentService2.addStudent();

        studentService.getStudentData();



    }
}