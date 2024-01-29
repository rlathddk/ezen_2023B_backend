package day20;

public class SmarTelevision implements RemoteControl2, Searchable {
    // 자식

    // 다중 구현 가능

    // 부모것 보다 자식의 오버라이드 우선
    @Override
    public void turnOn() {
        System.out.println("TV룰 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV룰 끕니다");
    }

    @Override
    public void search(String url) {
        System.out.println(url+"을 검색합니다");
    }
}
