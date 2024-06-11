package com.study.java_study.ch15_Static;

public class StudentService {

    private static StudentService instance;

    private StudentService() {}         // 생성자 private

    public static StudentService getInstance() {
        if(instance == null) {
            instance = new StudentService();
        }
        return instance;
    }

    public void addStudent() {
        StudentRepository.getInstance().add("김지현");
    }

    public void getStudentData() {
        String[] names = StudentRepository.getInstance().getNames();
        for(String name : names) {
            System.out.println(name);
        }
        System.out.println();
    }



}
