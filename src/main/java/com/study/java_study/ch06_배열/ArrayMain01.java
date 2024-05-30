package com.study.java_study.ch06_배열;

public class ArrayMain01 {
    public static void main(String[] args) {

        int[] nums = new int[100];           // 배열도 자료형 int배열, 크기가 정해져있지 않음, new해서 동적할당해야한다.

        for(int i = 0; i < 100; i++) {
            nums[i] = (i + 1) * 10;
        }

//        for(int num : nums) {               // for each문 : 무조건 처음부터 끝까지 반복
//            System.out.println(num);        // 바로 nums를 출력하면 nums에 담긴 값이 나오는게 아니라 new 새로 만든 메모리주소가 출력된다.
                                              // (새로운 메모리 주소 : 제일 앞에 있는 0번 인덱스 주소)
//        }                                   // for each문을 써서 nums의 방 하나하나를 다 옮긴 후 num을 출력하면, num안에 들어있는
                                              // 인덱스번호의 주소를 불러오고 그 주소안에 들어있는 값을 출력한다.
        for(int i = 0; i < nums.length; i++) {
            if(i % 2 == 0) {
                continue;                   // continue를 만나면 밑에꺼 안하고 위로 올라감 / 인덱스 번호가 홀수면 출력
            }
            int num = nums[i];
            System.out.println(num);
        }
    }
}
