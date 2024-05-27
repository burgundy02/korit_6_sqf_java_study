package com.study.java_study.ch06_배열;

import java.util.Scanner;

public class BookArrayService {
    public static void main(String[] args) {
        BookArrayUtils bookArrayUtils = new BookArrayUtils();
        Scanner scanner = new Scanner(System.in);

        String[] books = new String[0];

        boolean isRun = true;

        while(isRun) {
            System.out.println("[도서 관리 프로그램]");
            System.out.println("1. 도서 등록");
            System.out.println("2. 도서 수정");
            System.out.println("3. 도서 삭제");
            System.out.println("4. 도서 찾기");
            System.out.println("5. 도서 조회");
            System.out.println("q 프로그램 종료");

            System.out.println();

            System.out.print("메뉴를 선택해 주세요: ");
            String bookMenu = scanner.nextLine();

            String[] newBook = null;                        // 전역 변수 / 저 변수는 while문 돌때마다 초기화 된다.
            int findIndex = -1;

            switch(bookMenu) {
                case "1" :
                    System.out.println("[도서 등록]");
                    newBook = new String[books.length + 1];
                    for(int i = 0; i < books.length; i++) {      //newBook은 방이 하나 더 생기는 배열을 담는다.
                        newBook[i] = books[i];                   // 반복문을 돌려서 기존 정보들을 방이 하나 더 생긴 배열에 다 넣는다.
                    }
                    books = newBook;                             // 방이 하나 더 있고, 나머지 방에 기존 정보들도 다 들어있는 변수를
                    System.out.print("도서를 등록해 주세요: ");                     // 원래 변수에 넣는다.
                    books[books.length - 1] = scanner.nextLine();
                    System.out.println("등록 완료!");
                    break;
                case "2" :
                    System.out.println("[도서 수정]");
                    System.out.print("수정하고 싶은 도서: ");
                    String modifyName = scanner.nextLine();

                    findIndex = bookArrayUtils.findIndexbyBook(books, modifyName);
                    if(findIndex == -1) {
                        System.out.println("등록되지 않은 도서입니다.");
                        break;
                    }
                    System.out.print("수정할 도서: ");
                    books[findIndex] = scanner.nextLine();

                    System.out.println("수정이 완료됐습니다.");
                    break;
                case "3" :
                    System.out.println("[도서 삭제]");
                    System.out.print("삭제할 도서를 입력해 주세요: ");
                    String removeBook = scanner.nextLine();

                    findIndex = bookArrayUtils.findIndexbyBook(books, removeBook);
                    if(findIndex == -1) {
                        System.out.println("등록되지 않은 도서입니다.");
                        break;
                    }
                    newBook = new String[books.length - 1];

                    for(int i = 0; i < books.length; i++) {
                        if(i < findIndex) {               // findIndex : 삭제하고 싶은 책이 들어있는 인덱스번호
                            newBook[i] = books[i];
                            continue;                     // if문이 성립하면 continue;
                        }
                        newBook[i] = books[i + 1];        // ex) 새로운 2번 인덱스에 기존의 3번 인덱스를 넣는식으로 2번삭제
                    }
                    books = newBook;                      // newBook에 최신정보가 들어있지만 books에도 옮겨야함
                    System.out.println(removeBook + "을(를) 삭제했습니다.");
                    break;
                case "4" :
                    System.out.println("[도서 찾기]");
                    System.out.print("찾고싶은 도서명을 입력하세요: ");
                    String findBookName = scanner.nextLine();

                    findIndex = bookArrayUtils.findIndexbyBook(books, findBookName);

                    if(findIndex == -1) {
                        System.out.println("등록되지 않은 도서입니다.");
                        break;
                    }
                    System.out.println("등록된 도서입니다.");
                    break;
                case "5" :
                    System.out.println("[도서 조회]");
                    for(int i = 0; i < books.length; i++) {
                        System.out.println("index["+ i +"]: " + books[i]);
                    }
                    break;
                case "q" :
                    System.out.println("프로그램을 종료합니다.");
                    isRun = false;
                    break;
                default:
                    System.out.println("잘못된 입력입니다. 다시 입력해 주세요.");
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");































    }
}
