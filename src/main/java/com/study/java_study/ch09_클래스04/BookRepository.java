package com.study.java_study.ch09_클래스04;

// 저장소 -> CRUD
public class BookRepository {               // 도서 저장소
    // private String name; == 밑

    private int bookId;
    private BookEntity[] books;         // 배열 타입이 BookEntity클래스타입 // 여러 개의 도서 엔티티를 관리하기 위해서 배열에 넣음

    public BookRepository() {               // 생성자에 넣는 이유 : BookRepository가 생성될 때 배열을 생성한다.
        books = new BookEntity[0];
    }

    public int autoIncrementBookId() {
        return ++bookId;     // 매번 만들 때 마다 아이디는 1씩 증가
    }

    private void extendBooks() {                // 이 배열의 확장은 이 클래스안에서만 쓰기때문에(외부에 호출 하지도 않고) private설정
        // 기존 배열보다 크기가 하나 더 큰 배열을 생성한다.                 // saveBooks 할 때마다 방이 하나 더 많은 배열을 생성
        BookEntity[] newBooks = new BookEntity[books.length + 1];
        // 기존 배열의 정보를 새로운 배열로 모두 옮긴다. 이 때 마지막 인덱스의 값은 빈값이다.
        for (int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }
        // 기존의 배열의 주소가 들어있는 books 변수에 새로운 배열의 주소를 대입한다.
        books = newBooks;               // books배열에 방이 하나 더 생김
    }

    private int getLastIndex() {
        return books.length - 1;
    }

    public void saveBook(BookEntity book) {                 // saveBook을 사용하게되면 안에 들어있는 기능들도 사용하게 된다.
        // 배열 확장  : 배열확장은 방 추가만 하는게 아니라 추가한 방에 옮기는 것까지가 확장
        extendBooks();  // 배열하나 추가

        // 새로운 배열의 비어있는 마지막 인덱스에 매개변수로 받아온 book 객체를 대입한다.
        books[getLastIndex()] = book;  // 매개변수 book을 넣음           // 마지막인덱스를 가져오고 거기에 book을 넣는다.
    }

    // 참고 :선형탐색은 처음부터 끝까지 다 탐색 ( 배열은 왠만해서는 선형탐색으로 한다.)
    // 참고 :기준을 둬서 그 것보다 작은 쪽은 안봐서 시간이 줄어 든다.( 뒤에 있는 데이터를 찾을 때는 점점 느려진다..)

    // 단건조회 (한 개만 조회한다) : contains를 쓰게 되면 여러 개가 조회돼서 배열을 써야함
    public BookEntity findBookByBookId(int bookId) {        // 도서의 아이디값으로 책을 찾을 것이다.(아이디값이 있는지 없는지는 여기서는 보지않음) / books배열에서 찾아서
        // 매개변수에서 받은 값이
        BookEntity findBook = null;         // 책을 찾을 때 null인지 아닌지로 책을 찾을 수 있다.

        // 선형탐색                                        // books의 객체에 들어있는지 확인한다.
        for (BookEntity book : books) {                          // BookEntity의 객체 book에 books의 객체들이 차럐로 들어간다.
            if (book.getBookId() == bookId) {
                findBook = book;        // 도서 객체 자체를 넣는다.
                break;
            }                                           // books안에는 book객체가 들어있고, books와 BookEntity 이 같기 때문에
        }                                               // book에 books의 객체가 차례로 들어간다.
        return findBook;        // findBook에 null;
    }
    // 이름으로 책 찾기. 단건조회(하나만 찾기)
    public BookEntity findBookByBookName(String bookName) {
        BookEntity findBook = null;

        // 선형탐색(순차탐색)
        for(BookEntity book : books) {
            if(book.getBookName().equals(bookName)) {
                findBook = book;
                break;
            }
        }
        return findBook;        // 없으면 null
    }

    // 통합검색. 찾은 만큼 배열 늘리기
    private int getNewArraySize(int option, String searchText) {
        int newArraySize = 0;

        switch (option) {
            case 1: // option이 1번이면 통합검색
                for(BookEntity book : books) {        // 우리가 입력해서 서치텍스트할 문자가 포함된 단어가 하나라도 있으면 1 true
                    if(book.getBookName().contains(searchText)
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 2: // 도서명검색
                for(BookEntity book : books) {
                    if(book.getBookName().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 3: // 저자명검색
                for(BookEntity book : books) {
                    if(book.getAuthor().contains(searchText)) {
                        newArraySize++;
                    }
                }
                break;
            case 4: // 출판사명검색
                for(BookEntity book : books) {
                    if(book.getPublisher().contains(searchText)) {
                        newArraySize++;
                    }
                }
        }
        return newArraySize;
    }

    // 통합검색. 찾은 만큼 배열에 넣기. 다건조회(여러 개 찾기) -> 배열 사용
    public BookEntity[] searchBooks(int option, String searchText) {        // 리턴해야할 자료형이 배열 / '우리'
        // 찾은 만큼 늘린 배열의 사이즈
        int newArraySize = getNewArraySize(option, searchText);

        BookEntity[] searchBooks = new BookEntity[newArraySize];    // 사이드를 정해야 배열을 만들 수 있다

        int i = 0;
        switch (option) {
//          int i = 0;: 이렇게 하면 case를 바로 찾아가서 선언이 되지 않기 때문에 switch문 밖에서 선언한다.
            case 1: // 통합검색
                for (BookEntity book : books) {
                    if (book.getBookName().contains(searchText)
                            || book.getAuthor().contains(searchText)
                            || book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;  // 첫 번째 책꼿이에 넣고 다음 책을 다음 책꼿이에 넣어야 해서 i++
                    }           // 밑에서 값 리턴
                }
                break;
            case 2: // 도서명검색
                for (BookEntity book : books) {
                    if (book.getBookName().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 3: // 저자명검색
                for (BookEntity book : books) {
                    if (book.getAuthor().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
                break;
            case 4: // 출판사명검색
                for (BookEntity book : books) {
                    if (book.getPublisher().contains(searchText)) {
                        searchBooks[i] = book;
                        i++;
                    }
                }
        }
        return searchBooks;
    }

    public int indexOfBookId(int bookId) {
        int findIndex = -1;

        for(int i = 0; i < books.length; i++) {          // 전체반복해서 내가 찾고자하는 아이디가 북스의 i번째 아이디와 같은지
            if(books[i].getBookId() == bookId) {
                findIndex = i;
                break;
            }
        }
        return findIndex;                          // 찾은 아이디를 리턴(찾은 아이디를 줘야하기 떄문에)
    }

    public void deleteBookByBookId(int bookId){    // 방 하나 작은 배열을 새로만들고 삭제하는 작업
        int findIndex = indexOfBookId(bookId);

        BookEntity[] newBooks = new BookEntity[books.length - 1];

        for(int i = 0; i < newBooks.length; i++) {
            if(i < findIndex) {
                newBooks[i] = books[i];         // 삭제하고자 하는 인덱스보다 작으면 그냥 새배열에 옮기기
                continue;
            }
            newBooks[i] = books[i + 1];         // 삭제하고자 하는 인덱스보다 같거나 크면 그 자리에 그 다음번호부터 넣어서 삭제하는 식
        }
        books = newBooks;                       // 주소 바꾸기
    }
}