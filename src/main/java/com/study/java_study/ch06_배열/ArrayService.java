package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class ArrayService {
    public static void main(String[] args) {
        ArrayUtils arrayUtils = new ArrayUtils();
        Scanner scanner = new Scanner(System.in);
        String[] names = new String[0];     // 전역변수

        boolean isRun = true;
                                                        // CRDU순서로 작성
        while (isRun) {
            System.out.println("[이름 관리 프로그램]");
            System.out.println("1. 등록");     // 순서 : 등록, 전체조회, 이름찾기, 삭제, 수정: 여러가지가 있으면 제일 앞에 있는 걸 수정,삭제
            System.out.println("2. 수정");     // 배열에 새로 추가하고 싶을 때 배열을 새로 만든다.
            System.out.println("3. 삭제");
            System.out.println("4. 이름찾기");
            System.out.println("5. 전체조회");
            System.out.println("q. 프로그램 종료");

            System.out.println();

            System.out.print("메뉴 선택 : ");
            String selexctedMenu = scanner.nextLine();

            String[] newNames = null;
            int findIndex = -1;

            switch (selexctedMenu) {
                case "1":
                    System.out.println("[이름 등록]");
                    newNames = new String[names.length + 1];   // 배열을 수정하려면 새로 만들어야 함
                    for (int i = 0; i < names.length; i++) {
                        newNames[i] = names[i];     // 그자리 그대로 옮기기 / 처음에는 names에 방이없어서 못넣음
                    }                               // 5번 반복한다면 newNames는 방이 6개라서 하나에 아무것도 못넣는다(names의 길이만큼 반복)
                    names = newNames;               // 원래 names보다 방이 하나 더 많아짐
                    System.out.print("등록 할 이름: ");
                    names[names.length - 1] = scanner.nextLine();   // names의 방길이 - 1하면 names의 인덱스에 새로운 이름 추가
                    System.out.println("등록 완료!");                // (인덱스 번호는 0부터 시작)
                    break;
                case "2":
                    System.out.println("[이름 수정]");
                    System.out.print("수정 할 이름: ");
                    String modifyName = scanner.nextLine();

                    findIndex = arrayUtils.findIndexByName(names, modifyName);

                    if(findIndex == -1) {
                        System.out.println("해당 이름은 존재하지 않습니다.");
                        break;              // 스위치문 빠져나가는 break, 밑에까지 안가고 여기서 break;
                    }
                    System.out.print("새 이름: ");
                    names[findIndex] = scanner.nextLine();

                    System.out.println("수정 완료!");
                    break;
                case "3":
                    System.out.println("[이름 삭제]");
                    System.out.print("삭제 할 이름: ");
                    String removeName = scanner.nextLine();

                    findIndex = arrayUtils.findIndexByName(names, removeName);  // return값 -1이나 i가 들어간다.
                    if(findIndex == -1) {
                        System.out.println("해당 이름은 존재하지 않습니다.");
                        break;              // 스위치문 빠져나가는 break, 밑에까지 안가고 여기서 break;
                    }
                    newNames = new String[names.length - 1];

                    for(int i = 0; i < newNames.length; i++) {
                        if(i < findIndex) {
                            newNames[i] = names[i];
                            continue;                           // 한 번 반복하고 밑으로 내려오지말고 조건이 성립하면 계속 반복
                        }
                        newNames[i] = names[i + 1];
                    }
                    names = newNames;                      // newNames에 들어있던 최신내용을 다시 원래 names에 넣는다.(최신 정보로
                    System.out.println(removeName + "을(를) 삭제하였습니다.");                                  // 또 이용가능)
                    break;
                case "4":
                    System.out.println("[이름 찾기]");
                    System.out.print("조회 할 이름: ");
                    String findName = scanner.nextLine();

                    findIndex = arrayUtils.findIndexByName(names, findName);
                    if(findIndex == -1) {
                        System.out.println("해당 이름은 존재하지 않는 이름입니다.");
                        break;
                    }
                    System.out.println("해당 이름은 등록된 이름입니다.");
                    break;
                case "5":
                    System.out.println("[전체 조회]");
                    for (int i = 0; i < names.length; i++) {
                        System.out.println("index[" + i + "]: " + names[i]);
                    }
                    break;
                case "q":
                    System.out.println("프로그램을 종료합니다.");
                    isRun = false;
                    break;                                 // break : 여기까지만 continue : 조건이 맞으면 밑에꺼 하지말고 반복 계속해
                default:
                    System.out.println("다시 입력하세요.");
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
