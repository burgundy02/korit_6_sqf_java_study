package com.study.java_study.ch06_배열;

public class ArrayUtils {

    int findIndexByName(String[] names, String name) {
        for(int i = 0; i < names.length; i++) {
            if(names[i].equals(name)) {
                return i;
            }
        }
        return -1;          // -1이 리턴되면 못찾았다는 뜻 / 포문 밖에 있기때문에 위에서 한 번이라도 걸리면 이까지 안내려오고
    }                       // 한 번도 안걸리면 이까지 내려온다. (포문이 다 돌아야 내려온다. 포문 밖에 있기때문에)

}
