package com.study.java_study.ch04_제어;

import java.util.Random;
import java.util.Scanner;

public class 연습 {
    public static void main(String[] args) {


//        // [5일차]까지 하루에 20번 씩 총 100번 투구하기
//        for(int i = 0; i < 5; i++) {
//            System.out.println("[" + (i + 1) + "일차]");
//            for(int j = 0; j < 20 * (i + 1); j++) {
//                System.out.println((j + 1) + "번");
//            }
//        }
//
//          /*
//        [2단]
//        2 x 1 = 2
//        2 x 2 = 4
//        ...
//        2 x 9 = 18
//
//        ...
//
//        [9단]
//        9 x 1 = 9
//        ...
//        9 x 9 = 81
//         */
//
//        for(int i = 0; i < 8; i++) {                    // 8번 반복
//            System.out.println("[" + (i + 2) + "단]");   // 8번 반복하면서 뭘 출력할건지
//            for(int j = 0; j < 9; j++) {
//                System.out.println((i + 2) + "x" + (j + 1) + "=" + (i + 2) * (j + 1));
//            }
//        }
//
//        for(int i = 0; i < 8; i++) {
//            int dan = i + 2;
//            System.out.println("[" + dan + "단]");
//            for(int j = 0; j < 9; j++) {
//                int num = j + 1;
//                System.out.println(dan + "x" + num + "=" + dan * num);
//            }
//        }


        /*
        [3단]
        3x1 = 3
        3x2 = 6
        ...

        [8단]


         */

//       for(int i = 0; i < 6; i++) {
//           int dan = i + 3;
//           System.out.println("{" + dan + "단}");
//           for(int j = 0; j < 9; j++) {
//               int num = j + 1;
//               System.out.println(dan + "x" + num + "=" + dan * num);
//           }
//       }


//        // 랜덤한 숫자 맞추기
//        Random random = new Random();
//        Scanner scanner = new Scanner(System.in);
//
//        int num = random.nextInt(7);
//
//        while(true) {
//            System.out.println("[랜덤한 0~6까지의 숫자 중 하나를 맞줘보세요]");
//            System.out.print("숫자 입력: ");
//            int data = scanner.nextInt();
//
//            if(num == data) {
//                System.out.println("정답입니다~~");
//                break;
//            }
//            System.out.println("다시 도전해 보세요!");
//        }

//        // 홀짝알려주기
//        Scanner scanner1 = new Scanner(System.in);
//
//        while(true) {
//            System.out.println();
//
//            System.out.println("[입력한 값이 홀수인지 짝수인지 알려줍니다^^]");
//            System.out.print("숫자를 입력하세요 : ");
//            int num2 = scanner1.nextInt();
//
//            if(num2 % 2 == 0) {
//                System.out.println("짝수입니다.");
//
//                System.out.println();
//
//                System.out.println("한 번 더!!");
//                continue;
//            }
//            System.out.println("홀수입니다.");
//
//            System.out.println();
//
//            System.out.println("한 번 더!!");
//
//        }

        /* 사용자가 입력한 숫자까지 홀짝 알려주기
           전체반복은 사용자가 입력한 수만큼 반복

         */

//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("숫자를 입력하시오 :");
//        int count = scanner.nextInt();
//
//       for(int i = 0; i < count; i++) {
//           if(count % 2 == 0) {
//               System.out.println("짝수입니다.");
//               continue;
//           }
//           System.out.println("홀수입니다.");
//        }


            /*
                구단의 선수 관리 프로그램만들기
             */
//
//        Scanner scanner = new Scanner(System.in);
//
//        boolean playerSys = true;
//
//        while(playerSys) {
//            System.out.println("[선수 관리 프로그램]");
//            System.out.println("1. 선수 등록");
//            System.out.println("2. 선수 조회");
//            System.out.println("3. 선수 탈퇴");
//            System.out.println("q. 프로그램 종료");
//
//            System.out.println();
//
//            System.out.print("선택헤주세요 :");
//            String player = scanner.nextLine();
//
//            switch(player) {
//                case "1" :
//                    System.out.println("1. 선수등록 페이지로 오셨습니다.");
//                    break;
//                case "2" :
//                    System.out.println("2. 선수 조회 페이지로 오셨습니다.");
//
//                    boolean playerSearch = true;
//
//                    while(playerSearch) {
//                        System.out.println("[선수 조회]");
//                        System.out.println("1. 선수 이름으로 조회");
//                        System.out.println("2. 선수 등번호로 조회");
//                        System.out.println("b. 돌아가기");
//                        System.out.println("q. 프로그램을 종료합니다.");
//
//                        System.out.println();
//
//                        System.out.print("메뉴를 선택헤 주세요 :");
//                        String playerSearchMenu = scanner.nextLine();
//
//                        switch(playerSearchMenu) {
//                            case "1" :
//                                System.out.println("선수 이름으로 조회합니다.");
//                                break;
//                            case "2" :
//                                System.out.println("선수 등번호로 조회합니다.");
//                                break;
//                            case "b" :
//                                System.out.println("뒤로 돌아갑니다.");
//                                playerSearch = false;
//                                break;
//                            case "q":
//                                System.out.println("프로그램을 종료합니다.");
//                                playerSys = false;
//                                playerSearch = false;
//                                break;
//                            default:
//                                System.out.println("다시 입력해 주세요");
//                        }
//                    }
//                    break;
//                case "3":
//                    System.out.println("3. 선수 탈퇴 페이지로 오셨습니다.");
//                    break;
//                case "q" :
//                    System.out.println("프로그램을 종료합니다.");
//                    playerSys = false;
//                    break;
//                default:
//                    System.out.println("다시 선택해 주세요");
//            }
//            System.out.println();
//        }
//        System.out.println("프로그램 종료");


        // 큠 선수 관리 프로그램

//        Scanner scanner = new Scanner(System.in);
//
//        boolean playerSys = true;
//
//        while(playerSys) {
//            System.out.println("[큠선수 관리 프로그램]");
//            System.out.println("1. 선수 목록");
//            System.out.println("2. 선수 조회");
//            System.out.println("3. 선수 삭제");
//            System.out.println("q. 프로그램 종료하기");
//
//            System.out.println();
//
//            System.out.print("메뉴를 선택해 주세요 :");
//            String playerMenu = scanner.nextLine();
//
//            switch(playerMenu) {
//                case "1" :
//                    System.out.println("선수 목록으로 들어오셨습니다.");
//                    break;
//                case "2":
//                    System.out.println("선수 조회로 들어오셨습니다.");
//
//                    System.out.println();
//
//                    boolean playerSearch = true;
//
//                    while(playerSearch) {
//                        System.out.println("[선수 조회]");
//                        System.out.println("1. 선수 이름으로 조회하기");
//                        System.out.println("2. 선수 등번호로 조회하기");
//                        System.out.println("b. 메인 메뉴로 돌아가기");
//                        System.out.println("q. 프로그램 종료하기");
//
//                        System.out.println();
//
//                        System.out.print("메뉴를 선택해 주새요: ");
//                        playerMenu = scanner.nextLine();
//
//                        switch (playerMenu) {
//                            case "1":
//                                System.out.println("선수 이름으로 조회합니다.");
//                                break;
//                            case "2":
//                                System.out.println("선수 등번호로 조회합니다.");
//                                break;
//                            case "b":
//                                System.out.println("메인 메뉴로 돌아갑니다.");
//                                playerSearch = false;
//                                break;
//                            case "q":
//                                System.out.println("프로그램을 종료합니다.");
//                                playerSys = false;
//                                playerSearch = false;
//                                break;
//                            default:
//                                System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
//                        }
//                        System.out.println();       // break걸린다음 스위치문 밖에 있는 거 읽은 다음 올라감
//                    }
//                    break;
//                case"3":
//                    System.out.println("선수 삭제로 들어오셨습니다.");
//                    break;
//                case"q":
//                    System.out.println("프로그램을 종료합니다.");
//                    playerSys = false;
//                    break;
//                default:
//                    System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
//            }
//            System.out.println();
//        }
//        System.out.println("프로그램 종료");


        // 배열
        // 20의 배수를 넣고 인덱스번호 짝수만 출력
//        int[] nums = new int[150];
//
//        for(int i = 0; i < nums.length; i++) {
//            nums[i] = (i + 1) * 20;
//        }
//
//        for(int i = 0; i < nums.length; i++) {
//            if(i % 2 != 0) {
//                continue;
//            }
//            int num = nums[i];
//            System.out.println(num);
//        }

        // 크기가 50인 배열에 5의 배수를 넣고 인덱스 번호 홀수일 때만 출력
//        int[] nums = new int[50];
//
//        for(int i = 0; i < 50; i++) {
//            nums[i] = (i + 1) * 5;
//        }
//
//        for(int i = 0; i < nums.length; i++) {
//            if(i % 2 == 0) {
//                continue;
//            }
//            int num = nums[i];
//            System.out.println(num);
//        }

        // 크기가 100인 배열에 10의 배수를 넣고 출력

//        int[] nums = new int[100];
//
//        for(int i = 0; i < 100; i++) {
//            nums[i] = (i + 1) * 10;
//        }
//        for(int num : nums) {
//            System.out.println(num);
//        }

        // [이름 관리 프로그램]
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0];

        boolean isRun = true;

        while(isRun) {
            System.out.println("[이름 관리 프로그램]");
            System.out.println("1. 등록");
            System.out.println("2. 수정");
            System.out.println("3. 삭제");
            System.out.println("4. 이름찾기");
            System.out.println("5. 전체조회");
            System.out.println("q. 프로그램 종료");

            System.out.println();

            System.out.print("메뉴를 선택해 주세요^^: ");
            String selextedMenu = scanner.nextLine();

            String[] newName = null;

            switch(selextedMenu) {
                case "1":
                    System.out.println("[이름 등록]");
                    newName = new String[names.length + 1];     // 기존의 것에 추가를 해야한다.
                    for(int i = 0; i < names.length; i++) {
                        newName[i] = names[i];
                    }
                    names = newName;
                    System.out.print("이름을 등록해 주세요: ");
                    names[names.length - 1] = scanner.nextLine();
                    break;
                case"2":

                    break;
                case"3":

                    break;
                case"4":

                    break;
                case"5":

                    break;
                case"q":

                    break;
            }
        }













    }
}



