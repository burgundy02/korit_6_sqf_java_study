package com.study.java_study.ch20_람다;

public class ModificationMain {
    public static void main(String[] args) {

        Modification<String> m1 = new Modification<String>() {
            @Override
            public String modify(String oldData, String newData) {
                System.out.println("기존데이터: " + oldData);
                System.out.println("새로운데이터: " + newData);
                return newData;
            }
        };

        Modification<String> m2 = new Modification<String>() {
            @Override
            public String modify(String oldData, String newData) {
                return newData;
            }
        };

        // 무조건 추상 메소드는 1개만 존재해야한다.
        Modification<String> m3 = (oldName, newName) -> {
            System.out.println("기존데이터: " + oldName);
            System.out.println("새로운데이터: " + newName);
            return newName;
        };

        String name = "김지현";
        String newName = m1.modify(name, "김지현1");
        System.out.println(newName);

        String newName2 = m2.modify(name, "김지현2");
        System.out.println(newName2);

        String newName3 = m3.modify(name, "김지현3");
        System.out.println(newName3);


    }
}
