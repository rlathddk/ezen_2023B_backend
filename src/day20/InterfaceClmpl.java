package day20;

public class InterfaceClmpl implements InterfaceC {
    // 자식인터페이스를 구현할 때 부모인터페이스도 구현 해야한다.
    // * 추상메소드 또한 상속이 가능하다.
    @Override
    public void methodA() {
        System.out.println("InterfaceCImpl.methodA() 실행");
    }

    @Override
    public void methodB() {
        System.out.println("InterfaceCImpl.methodB() 실행");
    }

    @Override
    public void methodC() {
        System.out.println("InterfaceCImpl.methodC() 실행");
    }
}
