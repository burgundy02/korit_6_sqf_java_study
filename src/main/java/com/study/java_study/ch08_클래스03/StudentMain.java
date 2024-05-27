package com.study.java_study.ch08_클래스03;

public class StudentMain {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int[] nums = new int[5];
        nums[0] = 10;
        nums[1] = 20;
        nums[2] = 30;

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        Student[] students = new Student[5];
        students[0] = new Student(20240501, "김지현", 23);         // 학생은 이때 만들어진다.
        students[1] = new Student(20240502, "김지현1", 24);
        students[2] =  new Student(20240503, "김지현2", 25);

        Student[] studentss = new Student[] {
                new Student(20240501, "김지현", 23),
                new Student(20240502, "김지현1", 24),
                new Student(20240503, "김지현2", 25)
        };

        for(int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                continue;
            }
            System.out.println("학번: " + students[i].getCode());
            System.out.println("이름: " + students[i].getName());
            System.out.println("나이: " + students[i].getAge());
            System.out.println();
        }
    }
}
