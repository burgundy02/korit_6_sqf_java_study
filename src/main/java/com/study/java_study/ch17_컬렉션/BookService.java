package com.study.java_study.ch17_컬렉션;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BookService {
    // 싱글톤   (객체 딱 하나만 생성해서 하나만 쓴다)
    private static BookService instance;

    private BookService() {}  // 생성자를 private으로 바꿔서 밖에서는 생성을 못하게 하고 이 클래스안에서 싱글톤을 할 수 있게 환경을 만들어준다.

    public static BookService getInstance() {
        if(instance == null) {              // 처음에는 instance가 null이지만, 그 다음부터는
            instance = new BookService();   // instance에 이미 동적주소가 할당 돼 있어서 null이 아니다. 그래서 그 동적주소를 그냥 바로
        }                                   // 리턴하기 때문에 처음 할당한(생성한)동적주소가 리턴된다(싱글톤: 하나의 객체만 생성해서 쓴다)
        return instance;                    // static은 정적할당 돼 있어서 new 생성했을 때 영향안받음
    }

    private List<Map<String, Object>> bookDB = List.of(      // 리스트에 맵을 넣는데 String, Object를 넣는 형식을 많이 사용
            Map.of(
                    "bookId", 1,
                    "bookName", "자바의 정석"
            ),
            Map.of(
                    "bookId", 2,
                    "bookName", "파이썬의 정석"
            ),
            Map.of(
                    "bookId", 3,
                    "bookName", "데이터베이스의 정석"
            )
    );

    public void run1() {
        System.out.println("도서 전체 정보를 요청합니다.");
        run2();
    }

    public  void run2() {
        System.out.println("도서 전체 정보 요청을 받았습니다.");
        List<BookEntity> bookEntities = run3();
        BookRequestDto bookRequestDto = new BookRequestDto(200, "조회 완료", bookEntities);
        run4(bookRequestDto);
    }

    public List<BookEntity> run3() {
        System.out.println("데이터 베이스에서 도서 전체 정보를 조회합니다.");

        List<BookEntity> bookEntities = new ArrayList<>();  // bookentity에 새로 담은 애들을 넣을 배열을 만듦

        for(Map<String, Object> bookMap : bookDB) {         // bookDB안에 있는 Map들을
            BookEntity bookEntity = new BookEntity(
                    (int) bookMap.get("bookId"),
             (String) bookMap.get("bookName")
          );
            bookEntities.add(bookEntity);       // 다시 담은 얘들을 arrayList에 넣는다.
        }
        return bookEntities;   //List<BookEntity>, bookEntities, bookEntities.add(bookEntity); 이 리턴 자료형
    }

    public void run4( BookRequestDto bookRequestDto) {      // run4(bookRequestDto);의 매개변수
        System.out.println("데이터 베이스의 정보를 요청한 클라이언트에게 응답합니다.");
        System.out.println("[응답 데이터]");
        System.out.println(bookRequestDto);
    }


}
