package day10;

//
public class Account { // 객체 설계 클레스 : Data 모델 : 기능에 대한 함수x
    // 클래스멤버
    // 1. 필드 : 정적vs인스턴스
    String 계좌번호; // 객체마다 계좌번호가 필요하니까
    String 계좌주;
    int 입금액;
    // 2. 생성자
        // 1. 기본생성자
    Account(){} // 관례적으로 기본생성자랑 객체값 있는 거 하나 // 뭘쓸지 모르니깐
        // 2. 모든 필드를 받는 생성자
    Account(String 계좌번호, String 계좌주, int 입금액){
        this.계좌번호 = 계좌번호;
        this.계좌주 = 계좌주;
        this.입금액 = 입금액;
    }
    // 3. 메소드
        // *내 계좌의 입금액 반환.
}
