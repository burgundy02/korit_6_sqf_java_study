package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        PracticeUtils practiceUtils = new PracticeUtils();
        Scanner scanner = new Scanner(System.in);

        String[] musics = new String[0];                    // *배열을 담는 변수명은 항상 복수로 한다

        boolean isRun = true;

        while(isRun) {
            System.out.println("[플레이리스트 관리 프로그램]");
            System.out.println("1. 노래 등록(추가)");           // 배열을 새로 만들어서 등록, 삭제했다면 수정한 배열에 든 값들을
            System.out.println("2. 플레이리스트 노래 수정");
            System.out.println("3. 노래 삭제");                 // 다시 원래 배열에 넣어줘야 한다.
            System.out.println("4. 플레이리스트 내 노래 찾기");
            System.out.println("5. 플레이리스트 전체조회");
            System.out.println("q. 프로그램 종료");

            System.out.println();

            System.out.print("메뉴를 선택해 주세요: ");
            String selextedMenu = scanner.nextLine();

            String[] newMusic = null;                             // 노래삭제, 노래등록할 때 배열을 새로 만들어야 할 때 변수이름 중복으로
            int findIndex = -1;                                   // 쓰려고 전역변수로 switch밖에 선언
                                                                  // 기존배열에 있는 값과 입력값이 같은지 비교할 때 변수이름 중복으로
            switch(selextedMenu) {                                // 쓰려고 전역변수로 switch밖에 선언
                case "1" :
                    System.out.println("[노래 등록]");
                    newMusic = new String[musics.length + 1];        // 1. 방을 하나 더 추가한 새로운 배열을 만든다.
                    for(int i = 0; i < musics.length; i++) {         // 원래 값들을 새 방에 옮기고
                        newMusic[i] = musics[i];                     // //
                    }
                    musics = newMusic;                               // 원래 방에 최신정보를 보낸다.(원래방에 방이 하나 더 생겼다)
                    System.out.print("플리에 넣고 싶은 노래를 입력하세요: ");
                    musics[musics.length - 1] = scanner.nextLine();
                    System.out.println("플레이리스트에 노래가 추가 됐습니다^^");
                    break;
                case "2" :
                    System.out.println("[플레이리스트 노래 수정]");
                    System.out.print("수정하고 싶은 노래를 입력하세요: ");
                    String modifyMusic = scanner.nextLine();

                    findIndex = practiceUtils.findIndexByMusic(musics, modifyMusic);

                    if(findIndex == -1) {
                        System.out.println("플레이리스트에 없는 노래입니다.");
                        break;
                    }
                    System.out.print("수정할 노래를 입력하세요: ");
                    musics[findIndex] = scanner.nextLine();          // 수정하고싶은 값의 인덱스 번호에 새로운 값을 넣어서 수정완료

                    System.out.println("플레이리스트 수정이 완료됐습니다!");
                    break;
                case "3" :
                    System.out.println("[노래 삭제]");
                    System.out.print("삭제하고 싶은 노래를 입력해주세요: ");
                    String removeMusic = scanner.nextLine();

                    findIndex = practiceUtils.findIndexByMusic(musics, removeMusic);  // 참고 : musics.length는 타입이 String[]아님

                    if(findIndex == -1) {
                        System.out.println("플레이리스트에 없는 노래입니다.");
                        break;
                    }
                    newMusic = new String[musics.length - 1];           // 1. 방을 하나 삭제한 새로운 배열을 만든다.

                    for(int i = 0; i < newMusic.length; i++) {          // 삭제되고 남은 것들을 넣어야 되니까 newMusic.length이다
                        if(i < findIndex) {                             // 삭제하고싶은 인덱스번호보다 작은 번호들은 그냥 옮기기
                            newMusic[i] = musics[i];
                            continue;                             // continue; 조건이 성립하면 같은 반복문 안에서 밑으로 내려가지 말고
                        }                                         // 다시 반복해라
                        newMusic[i] = musics[i + 1];                    // ex) 2번 값 삭제를 원한다면 새로운 배열의 2번에 기존배열의
                    }                                                   // 3번 값이 들어온다. 2번값 삭제
                    musics = newMusic;
                    System.out.println(removeMusic + "을(를) 플레이리스트에서 삭제했습니다.");
                    break;
                case "4" :
                    System.out.println("[플레이리스트 내 노래 찾기]");
                    System.out.print("찾고싶은 노래를 입력하세요: ");
                    String findMusic = scanner.nextLine();      // 1. 입력값 받기(변수에 넣어야 관리가 편함)
                    // 2. '입력한 값이 있는지 없는지 먼저 확인(있으면 그 값이 들어있는 인덱스를 찾았다find)
                    findIndex = practiceUtils.findIndexByMusic(musics, findMusic);

                    if(findIndex == -1) {
                        System.out.println("플레이리스트에 없는 노래입니다.");
                        break;
                    }
                    System.out.println("플레이리스트에 있는 노래를 찾았습니다!: " + findMusic);
                    break;
                case "5" :
                    System.out.println("[플레이리스트 전체 조회]");
                    for(int i = 0; i < musics.length; i++) {
                        System.out.println("index[" + i + "]" + musics[i]);  // for each를 안쓰는 이유 : for each는 그냥 값만 처음
                    }                                                       // 부터 끝까지 나오게 한다.
                    System.out.println("조회 완료!");
                    break;
                case "q" :
                    System.out.println("프로그램을 종료합니다.");
                    isRun = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해 주세요");
                    break;
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
