package com.study.java_study.ch19_익명클래스;

public class ButtonMain {
    public static void main(String[] args) {

        Button Homebutton = new HomeButton();
        Button loginButton = new Button() {
            @Override
            public void onClick() {
                System.out.println("로그인 하기");
            }
        };

        click(Homebutton);

        click(loginButton);

        //   =

        click(new HomeButton());

        click(new Button() {                    // 객체 정의와 생성을 동시에
            @Override
            public void onClick() {
                System.out.println("로그인 하기");
            }
        });
    }

        // main밖에서 메소드 정의
        public static void click(Button button){
            System.out.println(button.getClass());
            button.onClick();
        }
    }

