package day16;

// 클래스 : 일반 클래스가 인터페이스의 추상메소드를 구현했으면 구현클래스로 한다
public class Television implements RemoteControl{

    private int volume;
    // - implemets 재정의한 메소드가 있어요 !! 뜻
    // - 무조건 오버라이딩/메소드재정의 한다

    @Override
    public void turnOn() {
        System.out.println("Tv를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv를 끕니다.");

    }

    @Override
    public void setVolume(int volume) {
        if(this.volume > RemoteControl.MAX_VOLUME){
            this.volume =RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume =RemoteControl.MAX_VOLUME;
        } else {
            this.volume = volume;
        }
        System.out.println("this.volume = " + this.volume);
    }
}
/*
    오버로딩 : 생성자/메소드에서 매개변ㅇ수의 타입/개수/순서에 따라 여러개 선언
    오버라이딩 : 메소드에서 extends/implements 한 메소드를 재정의
*/
