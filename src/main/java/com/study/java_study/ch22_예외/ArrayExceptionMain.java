package com.study.java_study.ch22_예외;

/*
예외(오류)
1. 컴파일 오류 -> 프로그램이 실행(메모리에 할당) 되기 전에 오류
2. 런타임 오류 -> 프로그램이 실행(메모리에 할당)된 후에 오류 / 없는 메모리에 접근하던가, 실행 중에 메모리가 부족하던가 등

프로그램이 갑자기 꺼지는 걸 방지

예외는 밑에서 부터 위로 올라온다. 오류 찾을 때 제일 윗 줄 보기
 */

public class ArrayExceptionMain {

    public static void printArray(Integer[] nums, int length) throws Exception {

        for (int i = 0; i < length; i++) {
            System.out.println("i: " + nums[i]);
        }
//        } catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println(e.getMessage());
//            e.printStackTrace();      // 비동기처리 : 먼저 완료 된 것을 우선 처리(동기 처리는 순서대로 처리)
//        }

    }
    public static void main(String[] args) {

        Integer[] nums = new Integer[] {1, 2, 3, 4, 5};

        try {
            printArray(nums, 6);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("프로그램 종료");


    }
}
