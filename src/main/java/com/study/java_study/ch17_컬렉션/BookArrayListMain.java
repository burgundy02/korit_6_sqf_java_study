package com.study.java_study.ch17_컬렉션;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookArrayListMain {
    public static void main(String[] args) {

        // 프로그램시작
        // 도서명: 도서1                  for문
        // 저자명: 저자1
        // new Book("도서1", "저자1")
        // BookList에 추가

        // 도서명: 도서2  for문
        // 저자명: 저자2
        // new Book("도서1", "저자1")
        // BookList에 추가

        // 도서명: 도서3  for문
        // 저자명: 저자3
        // new Book("도서1", "저자1")
        // BookList에 추가

        // 도서 전체 조회
        // 도서명 >> 도서1       toString 쓰지말기
        // 저자명 >> 저자1

        // 삭제 할 도서명: 도서2

        // 도서 전체 조회
        // 도서명 >> 도서1, 3
        // 저자명 >> 저자 1, 3



//        System.out.println("[프로그램 시작]");
//
//        for(int i = 0; i < 3; i++) {
//            if(i < (i + 1)) {
//                Book book = new Book("도서 " + (i + 1), "저자 " + (i + 1));
//            }
//            break;
//        }
//        ArrayList<String> strList = new ArrayList<>();


        Scanner scanner = new Scanner(System.in);

        List<Book> bookList = new ArrayList<>();

        for(int i = 0; i < 3; i++) {
            String bookName;
            String author;
            System.out.println("도서명: ");
            bookName = scanner.nextLine();
            System.out.println("저자명: ");
            author = scanner.nextLine();

            bookList.add(new Book(bookName, author));
        }

        for(Book book : bookList) {
            System.out.println("도서명: " + book.getBookName());
            System.out.println("저자명: " + book.getAuthor());
        }

        System.out.println("삭제 할 도서명: ");
        String removeBookName = scanner.nextLine();
        for(Book book : bookList) {
            if(book.getBookName().equals(removeBookName)) {
                bookList.remove(book);
                break;                      // 지우고 나면 무조건 브레이크
            }
        }

        for(int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getBookName().equals(removeBookName)) {
                Book removeBook = bookList.remove(i);
                System.out.println("삭제된 도서 정보: " + removeBook);
                break;
            }
        }

        for(int i = 0; i < bookList.size(); i++) {
            System.out.println("도서명: " + bookList.get(i).getBookName());        // get해서 값을 꺼내쓴다.
            System.out.println("저자명: " + bookList.get(i).getAuthor());
        }

    }
}
