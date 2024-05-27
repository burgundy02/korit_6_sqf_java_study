package com.study.java_study.ch06_배열;

public class PracticeUtils {

    int findIndexByMusic(String[] musics, String music) {
        for(int i = 0; i < musics.length; i++) {
            if(musics[i].equals(music)) {
            return i;
            }
        }
        return -1;
    }
}
