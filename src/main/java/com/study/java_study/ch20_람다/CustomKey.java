package com.study.java_study.ch20_람다;

@FunctionalInterface                // 메소드가 2개 이상은 안된다.
public interface CustomKey {
    void onKeyPress();
}
