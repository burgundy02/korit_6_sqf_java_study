package com.study.java_study.ch12_추상화03;

public abstract class AbstractAuthority implements Authority{       // 인터페이스를 가지고 추상 클래스를 만들었고
    private String role;                                            // 추상클래스는 생성할 수는 없지만 생성자를 정의할 수 있다.

    public AbstractAuthority() {
        role = DEFAULT_ROLE;
    }

    public AbstractAuthority(String role) {
        this.role = role;
    }

    @Override
    public String getAuthority() {
        return role;
    }



}
