package day21;

public class Step3 {
    public static void main(String[] args) {
        Car car = new Car();

        //*
        car.run3(new Tire(){
            @Override
            public void roll() {
                System.out.println("기아타이어가 굴러갑니다.");
            }
        });
        //
        Tire tire = new Tire(){
            // ============ Tire 클래스로부터 자동 상속 받은 객체 정의 ============= //
            // class 자식클래스명 extend Tire{} 이게 빠짐
            // !!!! : 자식객체
            // 필드 생성 가능
            int a = 10;

            // 생성자 x
            public void method1(){
                System.out.println("ddd");
            }
            @Override
            public void roll() {
                System.out.println("기아타이어가 굴러갑니다.2");
            }
            // ============ Tire 클래스로부터 자동 상속 받은 객체 정의 ============= //
        };
        // 2.
        car.run3(tire);
    }
} // c e
