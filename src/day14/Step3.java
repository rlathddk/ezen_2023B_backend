package day14;

public class Step3 {

    public static void main(String[] args) {
        // 1. 객체 생성
        Car myCar = new Car();
            // myCar.tire = null
        myCar.tire = new Tire();
            // myCar.tire= Tire 객체잠조
        myCar.run();

        // -------- 필드 다형성 : 필드가 가지고 있는 객체참조---------//
        //myCar.tire = new HankookTire();
        myCar.run();
    }
}
