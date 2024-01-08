package day05; // 패키지 : 클래스가 위치한 폴더 경로

import java.util.Scanner;

public class Step1 { // 클래스 : 모든 자바 코드는 클래스 안에서 작성
    public static void main(String[] args) { // 메인함수 : 자바 코드 진입점(스레드 포함)

        // 3-1 입력객체 생성 [Scanner객체가 필요한 이유 ??/? 입력받을려고]
        Scanner scanner = new Scanner(System.in); // 라이브러리


        while (true) {
            // 1. 출력
            System.out.println("========== 방문록 ===========");
            System.out.println("1.방문록 작성 2. 방문록 삭제 3.종료 ");
            // 3-2 입력객체 이요한 키보드로부터 입력값 호출 하고 변수에 저장
            System.out.print("선택 : ");
            int ch = scanner.nextInt();
        } // w e
    } // main e
} // class e

/*
    비회원제 방문록 프로그램[JAVA]
        1. 방문록 작성 / 삭제 기능 / 종료 기능 구현
            [초기메뉴]
            1. 초기메뉴가 반복적으로 실행되어야 한다.
                - 특정 조건에 따라 종료.
            2. 초기메뉴에 대해 선택(입력) 받는다.
 */