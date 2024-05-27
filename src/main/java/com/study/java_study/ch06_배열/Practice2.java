package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Practice2Utils practice2Utils = new Practice2Utils();
        Scanner scanner = new Scanner(System.in);
        String[] musics = new String[0];

      boolean isRun = true;

      while(isRun) {
          System.out.println("[플레이리스트 관리 프로그램]");
          System.out.println("1. 노래 등록(추가)");
          System.out.println("2. 플레이리스트 노래 수정");
          System.out.println("3. 노래 삭제");
          System.out.println("4. 플레이리스트 내 노래 찾기");
          System.out.println("5. 플레이리스트 전체조회");
          System.out.println("q. 프로그램 종료");

          System.out.println();

          System.out.print("메뉴를 선택해 주세요: ");
          String selextedMenu = scanner.nextLine();

          String[] newMusic = null;
          int findIndex = -1;

          switch(selextedMenu) {
              case "1" :
                  System.out.println("[노래 등록(추가)]");
                  newMusic = new String[musics.length + 1];
                  for(int i = 0; i < musics.length; i++) {
                      newMusic[i] = musics[i];
                  }
                  musics = newMusic;
                  System.out.print("등록: ");
                  musics[musics.length - 1] = scanner.nextLine();

                  System.out.println("등록완료");
                  break;
              case "2" :
                  System.out.println("[플레이리스트 노래 수정]");
                  System.out.print("수정하고싶은 노래 입력: ");
                  String modifyMusic = scanner.nextLine();

                  findIndex = practice2Utils.findIndexByMusic(musics, modifyMusic);

                  if(findIndex == -1) {
                      System.out.println("없는 노래입니다.");
                      break;
                  }
                  System.out.print("수정할 노래: ");
                  musics[findIndex] = scanner.nextLine();

                  System.out.println("수정완료 됐습니다.");
                  break;
              case "3" :
                  System.out.println("[노래 삭제]");
                  System.out.print("삭제할 노래 입력: ");
                  String removeMusic = scanner.nextLine();

                  findIndex = practice2Utils.findIndexByMusic(musics, removeMusic);

                  if(findIndex == -1) {
                      System.out.println("없는 노래입니다.");
                      break;
                  }
                  newMusic = new String[musics.length - 1];
                  for(int i = 0; i < newMusic.length; i++) {
                      if(i < findIndex) {
                          newMusic[i] = musics[i];
                          continue;
                      }
                      newMusic[i] = musics[i + 1];
                  }
                  musics = newMusic;
                  System.out.println("삭제 완료 됐습니다.");
                  break;
              case "4" :
                  System.out.println("플레이리스트 내 노래 찾기");
                  System.out.print("찾고싶은 노래 입력: ");
                  String findMusic = scanner.nextLine();

                  findIndex = practice2Utils.findIndexByMusic(musics, findMusic);

                  if(findIndex == -1) {
                      System.out.println("없는 노래입니다.");
                      break;
                  }
                  System.out.println("있는 노래입니다.");
                  break;
              case "5" :
                  System.out.println("[플레이리스트 전체조회]");
                  for(int i = 0; i < musics.length; i++) {
                      System.out.println("index[" + i + "]" + musics[i]);
                  }
                  break;
              case "q" :
                  System.out.println("프로그램을 종료합니다.");
                  isRun = false;
                  break;
              default :
                  System.out.println("잘못된 입력입니다.");
                  break;
          }
          System.out.println();
      }
    }
}
