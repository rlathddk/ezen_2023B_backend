package day20;

public class Step1 {
    public static void main(String[] args) {
        // 1. 인터페이스 변수 선언
            //RemoteControl rc = new Audio();
        // 2. 구현객체 생성한다
            //new Audio();
        // 3. 구현객체의 참조/주소 값을 인터페이스 변수에 대입한다
            // * 객체를 참조하는 인터페이스 타이의 변수
            // 타입이 다른데 가능한 이유 : 다형성(implements)
        RemoteControl rc = new Audio(); // 위에꺼 합쳐서
        rc.setVolume(5);
        rc.setMute(true);
        rc.setMute(false);

        // 4. 인터페이스의 정적 메소드 호출
        RemoteControl.changeBattery();

        // rc.turnOff2(); // priavate라서 안됨
        // RemoteControl.turnOff3(); // private라서 안됨

    }
}

// 두 객체 연결
