package com.study.java_study.ch10_추상화01;

public class AnimailMain {
    public static void main(String[] args) {
        Dog dog = new Dog("콩이", 11, "말티즈");     // ()안의 값을 포함하고 있는 Dog주소가 dog에 담김
        Animal tiger = new Tiger("옹이", 11, 50);     // 업캐스팅 -> 출력하면 다시 동물이움직입니다  / Tiger에만 있던 것만 비활성화(재정의 제외)

        System.out.println(dog.toString());        // 그냥 toString만 만들어서 breed만 나옴
        System.out.println(tiger.toString());      // power나오고 Animal에 있는 것도 나옴

        dog.move();
        tiger.move();
        ((Tiger) tiger).hunt(); // 업캐스팅된 걸 다운캐스팅으로 // 다운캐스팅 괄호로 묶기
        dog.bark();

        System.out.println();

        Animal[] animals = new Animal[3];
        animals[0] = new Animal("이름없는 동물", 10);
        animals[1] = new Dog("콩이", 11, "말티즈");
        animals[2] = new Tiger("옹이", 5, 100);

        for(Animal animal : animals) {
            animal.move();
        }

        System.out.println();

        for(Animal animal : animals) {

            if(animal instanceof Tiger) {       // 반복에서 꺼냈을 때 원래 자료형이 Tiger인지 (Tiger가 업캐스팅된적 있는지)
                Tiger t = (Tiger) animal;
                t.hunt();
            } else if (animal instanceof Dog) {
                Dog d = (Dog) animal;
                d.bark();
            }
        }


        for(Animal animal : animals) {
                                                      // instanceof 대체
            if(animal.getClass() == Tiger.class) {   // .getClass() : 어느 클래스의 인스턴스인지 Tiger.class : 타이거클래스자체를 들고옴
                Tiger t = (Tiger) animal;
                t.hunt();
            } else if (animal.getClass() == Dog.class) {
                Dog d = (Dog) animal;
                d.bark();
            }
        }



        /*
        추상화 쓰는 이유 :
        Animal[] animal = new Animal[3];        // animal은 Tiger 타입에 또 넣을 수 없다.
        animal[0] = new Animal();
        animal[1] = new Tiger();              이런식으로 업캐스팅 가능
        animal[2] = new Dog();
         */

        /*
        객체의 형변환과 리터럴의 형변환은 차이가 있음

            Tiger t = new Tiger();

            // 업캐스팅
            Animal a2 = new Tiger();   // Tiger(자식)은 하위개념이고 Animal(부모)은 상위개념이라서 이 경우 업캐스팅(묵시적형변환)
            이 경유 Tiger안에만 있는 power는 a2에서 쓸 수 없다.(타입이 Animal이라서) - new Tiger의 주소는 그대로 유지하고 Tiger에만있는 메모리는 비활성화

            ex) 업캐스팅 예): doubled dNum = 10; 하위개념인 int가 상위개념인 double에 들어간다.

            // 다운캐스팅
            Tiger t2 = (Tiger)a2


            업캐스팅이 된 적 없는걸 다운캐스팅할 수는 없다.
            업캐스팅 된 적 있는 것만 다운캐스팅 할 수 있다.

            // 안됨
            Animal a = new Animal();
            Tiger t = (Tiger) a;        //

                                        // 잠시 비활성화될 뿐이지 dog로 만든걸 animal로 바꾼다해서 이걸 tiger에 넣어서 바꿀 수는 없다.
         */
    }
}
