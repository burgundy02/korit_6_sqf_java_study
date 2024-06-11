package com.study.java_study.ch09_클래스04;

import java.util.Arrays;
import java.util.Scanner;                                 // isEmpty : 띄어쓰기도 문자로 포함할거면

// isBlank : 띄어쓰기 포함 X -> 문자열 객체에만 쓸 수 있다.
public class BookService {

    private Scanner scanner;
    private BookRepository bookRepository;

    public BookService() {                  // 생성될 때 스캐너를 생성
        scanner = new Scanner(System.in);
        bookRepository = new BookRepository();
    }

    private String selectMenu() {
        String[] menus = {"1", "2", "3", "4", "q"};
        String selectedMenu = null;

        while (true) {
            System.out.print("메뉴 선택: ");
            selectedMenu = scanner.nextLine();                          // menus라는 메뉴에서 binatySearch
            if (Arrays.binarySearch(menus, selectedMenu) > -1) {         // -1 보다 크면 break;
                break;
            }
            System.out.println("잘못된 입력입니다. 다시 입력하세요.");
        }
        return selectedMenu;   // 반복 무시하고 리턴 null / 메뉴선택에 입력하면 조건에 따라 입력한 값 리턴 /if가 걸리면 계속 반복
    }

    public boolean run() {

        boolean isRun = true;

        System.out.println("[ 도서 관리 프로그램 ]");
        System.out.println("1. 도서 등록");
        System.out.println("2. 도서 검색");
        System.out.println("3. 도서 수정");
        System.out.println("4. 도서 삭제");
        System.out.println("q. 프로그램 종료");

        String selectedMenu = selectMenu();

        switch (selectedMenu) {
            case "q":
                isRun = false;
                break;
            case "1":
                registerBook(); // 도서등록
                break;
            case "2":
                search();
                break;
            case "3":
                modify();
                break;
            case "4":
                remove();
                break;
            default:
                System.out.println("입력 오류!");
        }
        System.out.println();

        return isRun;   // 리턴 트루라서 계속 트루를 리턴 / q를 누르면 false로 리턴
    }

    private String validateValue(String title) {    // 여기서 도서, 저자라고 입력하면 매개변수
        String value = null;
        while (true) {
            System.out.print(title + "명 입력: ");
            value = scanner.nextLine();
            if (!value.isBlank()) {             // 입력받은 값이 공백이 아니면 브레이크
                break;
            }
            System.out.println(title + "명은 공배일 수 없습니다. 다시입력하세요.");
        }
        return value;           // 정상적인 값 들어오면 리턴
    }

    private String duplicateBookName() {
        String bookName = null;     // 그다음엔 1 , 2, ..하나씩 추가된다
        while (true) {
            bookName = validateValue("도서");     // 여기서 입력
            if (bookRepository.findBookByBookName(bookName) == null) {      // 중복 체크
                break;
            }
            System.out.println("해당 도서명이 이미 존재합니다. 다시입력하세요.");
        }
        return bookName;        // while문이 끝이나면 북네임을 리턴
    }

    private void registerBook() {
        System.out.println("[ 도서 등록 ]");
        int bookId = bookRepository.autoIncrementBookId();
        String bookName = duplicateBookName();          // 북네임 중복체크
        String author = validateValue("저자");
        String publisher = validateValue("출판사");

        BookEntity book = new BookEntity(bookId, bookName, author, publisher);   // 객체 생성 / 생성자를 통해 값 대입
        // 매번 만들 때 마다 아이디는 1씩 증가
        bookRepository.saveBook(book); // 도서 등록
        System.out.println("새로운 도서를 등록하였습니다.");
    }

    private void search() {
        System.out.println("[도서 검색]");
        System.out.println("1. 통합검색");
        System.out.println("2. 도서명검색");
        System.out.println("3. 저자명검색");
        System.out.println("4. 출판사검색");
        System.out.print("옵션 선택: ");
        int option = scanner.nextInt();
        scanner.nextLine();             // 엔터(버퍼) 날리기(Line빼고는 다 이렇게)

        System.out.print("검색어 입력: ");
        String searchText = scanner.nextLine();
        BookEntity[] searchBooks = bookRepository.searchBooks(option, searchText);

        System.out.println("[검색 결과]");
        if (searchBooks.length == 0) {
            System.out.println("검색 결과가 없습니다.");
            return;                                     // 밑에 for문안하고 return 해서 search 빠져나감
        }
        for (BookEntity book : searchBooks) {
            System.out.println(book.toString());        // toString찍으면 정보 뜸

        }
    }

    private void remove() {
        System.out.println("[도서 삭제]");
        search();       // 도서 목록이 쭉 나옴
        System.out.print("삭제할 도서 번호 입력: ");
        int removeBookId = scanner.nextInt();
        scanner.nextLine();
        BookEntity book = bookRepository.findBookByBookId(removeBookId);   // 이 아이디로 도서 객체조회 : 없으면 null이 들어있음
        if (book == null) {
            System.out.println("해당 도서번호는 존재하지 않습니다.");
            return;
        }
        bookRepository.deleteBookByBookId(removeBookId); // 있으면 입력한 북아이디를 삭제
    }

    private void modify() {
        System.out.println("[도서 수정]");
        search();     // 도서 정보를 보고 리스트를 보고 수정하기 위해서
        System.out.print("수정할 도서번호 입력: ");
        int modifyBookId = scanner.nextInt();
        scanner.nextLine();
        BookEntity book = bookRepository.findBookByBookId(modifyBookId);//modifyBookId 아이디를 가지고 도서를 찾았을 때 없으면 null
        if (book == null) {
            System.out.println("해당 도서번호는 존재하지 않습니다.");
            return;
        }
        System.out.println("<< 도서 수정 정보 입력>>");
        for (int i = 0; i < 3; i++) {
            String selected = null;

            switch (i) {
                case 0:
                    System.out.print("도서명을 수정하시겠습니까? (y/n)");
                    selected = scanner.nextLine();
                    if (selected.equalsIgnoreCase("y")) {  //equalsIgnoreCase : 대소문자 구분없이 y가 대분자도 되거 소문자도 됌
                        String bookName = duplicateBookName();
                        book.setBookName(bookName);
                        break;
                    }
                    break;
                case 1:
                    System.out.print("저자명을 수정하시겠습니까? (y/n)");
                    selected = scanner.nextLine();
                    if (selected.equalsIgnoreCase("y")) {  //equalsIgnoreCase : 대소문자 구분없이 y가 대분자도 되거 소문자도 됌
                        String author = validateValue("저자");
                        book.setAuthor(author);
                        break;
                    }
                    break;
                case 2:
                    System.out.print("출판사명을 수정하시겠습니까? (y/n)");
                    selected = scanner.nextLine();
                    if (selected.equalsIgnoreCase("y")) {  //equalsIgnoreCase : 대소문자 구분없이 y가 대분자도 되거 소문자도 됌
                        String publisher = validateValue("출판사");
                        book.setPublisher(publisher);
                        break;
                    }
            }
        }
    }
}