package com.study.java_study.ch22_예외;

import java.util.ArrayList;
import java.util.List;

public class NullExceptionMain {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("김지현");
        names.add("김지현1");
        names.add("김지현2");
        names.add("김김김");             // 여기가 null이 아니라도 다음으로 인덱스오브어쩌고 오류 뜸

        System.out.println(names);

        try {
            // 마지막은 null.toString이 들어와서 NullPointerException 오류뜸
//            names.forEach(name -> System.out.println(name.toString()));
            for(int i = 0; i < 5; i++) {
                System.out.println(names.get(i).toString());
            }
            System.out.println("트라이 마지막 부분");

            // (클래스타입, 매개변수)
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();
            // 어떤 예외든지 상위인 Exception으로 업캐스팅 예외 처리 될 수 있다 /
            // 어떤 예외가 뜰지 모르겠다면 RuntimeException, Exception, Throwable 타입 사용
        } catch (Exception e) {
            e.printStackTrace();
            // 더 상위인 Throwable
        } catch (Throwable e) {
            e.printStackTrace();
            // catch하면 예외이든 아니든 실행 출력, 프로그램 종료 출력
        } finally {
            System.out.println("예외이든 아니든 실행");
        }

        System.out.println("프로그램 종료");

    }
}
