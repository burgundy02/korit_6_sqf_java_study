package com.study.java_study.ch15_Static;

public class StudentRepository {
    private String[] names;

    private static StudentRepository instance;      // 최초의 값은 null;  /자기자신을 담을 수 있는 instance 변수가있어야 한다.

    private StudentRepository() {
        names = new String[5];
    }

                                                      // 스튜던트리포지토리를 리턴하는 메소드
    public static StudentRepository getInstance() {  // 한 번 더 돌려고 오면 instance가 null이 아니라 100이 들어있어서 밑에 포문 실행 안되고 바로 100번 리턴
        if(instance == null) {
            instance = new StudentRepository();     // 이때 instance에 주소가 생겨서(예시 100번)
        }
        return instance;                        // 리턴한다. 100번주소 리턴  이 주소를 instance에 리턴(넣는다)
    }

    public void add(String name) {
        for(int i = 0; i < names.length; i++){
            if(names[i] == null) {
                names[i] = name;
                break;
            }
        }
    }

    public String[] getNames() {
        return names;
    }






}
