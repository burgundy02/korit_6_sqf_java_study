package com.study.java_study.ch09_클래스04;

public class BookEntity {                   // 어떤 정보의 집합체 : entity는 게터 세터 필수
                                            // entity : 정보를 담는 클래스
    private int bookId;                     // service : 기능을 담는 클래스
    private String bookName;
    private String author;
    private String publisher;

    public BookEntity() {
    }

    public BookEntity(int bookId, String bookName, String author, String publisher) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.publisher = publisher;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {

        this.bookId = bookId;
    }

    public String getBookName() {

        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {                          // entity 정보를 출력해서 볼 수 있는
        return "BookEntity{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                '}';
    }
}
