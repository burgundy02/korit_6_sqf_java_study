package com.study.java_study.ch06_배열;

public class ArrayMain03 {
    public static void main(String[] args) {

        int[] nums = new int[] { 10, 20, 30, 40, 50, 60 };

        int num1 = 10;
        int num2 = 20;
        int num3 = 30;
        int num4 = 40;
        int num5 = 50;
        int num6 = 60;

        nums[0] = 10;           // 10을 bookEntity로 생각하면 된다.
        nums[1] = 20;
        nums[2] = 30;
        nums[3] = 40;
        nums[4] = 50;
        nums[5] = 60;

        String[] strArray = new String[5];
        strArray[0] = "가";
        strArray[1] = "나";
        strArray[2] = "다";
        strArray[3] = "라";
        strArray[4] = "마";

        for(int num : nums) {               // 조건 넣어서 break;걸면 중간에 빠져나갈 수 있다.
            System.out.println(num);
        }

        for(String str : strArray) {        // strArray에 들어있는 값의 타입이 String이라서 str의 타입도 String이어야 한다.
            System.out.println(str);
        }

        double[] doubles = new double[3];
        doubles[0] = 10.5;
        doubles[1] = 20.5;
        doubles[2] = 30.5;

        for(double dNum : doubles) {
            System.out.println(dNum);

            Computer[] computers = new Computer[3];
            computers[0] = new Computer("i3", "8GB");       // allAgs 생성자에 매개변수를 넣어서 private 변수에 값을 넣음
            computers[1] = new Computer("i5", "16GB");      // *private 변수에 값 넣는 두 가지 방법:
            computers[2] = new Computer("i7", "32GB");      // 1. stter 사용
                                                            // 2. 생성자를 이용
            for(Computer computer : computers) {
                System.out.println(computers.toString());
            }
        }
    }
}
