package day20;

public interface RemoteControl2 {
    // 부모
    // 부모는 자식 걸 쓸 수 없지만 오버라이딩 한것은 가능
    // 상속처럼 강제타입 변환 불가

    // 추상 메소드
    void turnOn();
    void turnOff();
}
