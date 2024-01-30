package day21;

import day14.KumhoTire;

public class Car {
    //
    private Tire tire1 = new Tire();
    // 익명 자식 객체
        // 상속하거나 인터페이스 구현 일 경우
        // 자식 객체 : private Tire tire2 = new KumhoTire();
        // 익명 자식 객체 : private Tire tire2 = new Tire(){재정의};
            // 클래스를 안 만들어도 객체를 만들 수 있지만 재사용이 불가능 (설계도가 없으니깐)
            // 단일 객체
    private Tire tire2 = new Tire(){
        @Override
        public void roll() {
            System.out.println("금호타이어가 굴러 갑니다.");
        }
    };

    public void run1(){
        tire1.roll();
        tire2.roll();
    }
    public void run2(){
        Tire tire = new Tire(){

            @Override
            public void roll() {
                System.out.println("한국타이어가 굴러 갑니다.");
            }
        };
    }

    // 3. 매개변수에 익명자식객체 대입
    public void run3 (Tire tire){
        tire.roll();
    }
} // ce
