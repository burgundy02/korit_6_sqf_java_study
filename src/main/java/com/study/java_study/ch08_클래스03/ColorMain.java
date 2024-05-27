package com.study.java_study.ch08_클래스03;

import java.util.concurrent.Callable;

public class ColorMain {
    public static void main(String[] args) {
        /*
        문제.
        Color 객체 5개를 담을 수 있는 배열을 생성하여
        #CA848A, Brandied Apricot
        #FFBE98, Peach Fuzz
        #964F4C, Marsala
        #A78C78, Almondine
        #D8C88D, Almond peach
        생성 데이터를 저장 한 후 for문을 사용하여 배열에 들어있는 모든 색상 정보를 printInfo()로 호출하여 출력한다.
        이후에 모든 code와 name의 값을 null로 바꾸어 다시 출력한다.
        이때 null로 바꿀떄에는 반복문을 사용한다.
         */

        Color[] colors = new Color[5];
        colors[0] = new Color("#CA848A", "Brandied Apricot");       // 이런식 비추
        colors[1] = new Color("#FFBE98", "Peach Fuzz");
        colors[2] = new Color("#964F4C", "Marsala");
        colors[3] = new Color("#A78C78", "Almondine");
        colors[4] = new Color("#D8C88D", "Almond peach");

        Color[] colors2 = new Color[]{                     // 공간을 만들어놓고 넣는게 아니고 만들어 질 때 넣는다.
                new Color("CA848A", "Brandied Apricot"),
                new Color("FFBE98", "Peach Fuzz"),
                new Color("964F4C", "Marsala"),
                new Color("A78C78", "Almondine"),
                new Color("D8C88D", "Almond peach"),
        };

        for(Color color : colors) {           // for each문 사용필요 : 인덱스가 필요없는 경우, 처음 부터 끝까지 반복할 때
            color.printInfo();
        }

        for(Color color : colors2) {
            color.setCode(null);
            color.setName(null);
        }

        for(int i = 0; i < colors.length; i++) {
            colors2[i].printInfo();
        }

        for(Color color : colors2) {
            color.printInfo();
        }





    }
}
