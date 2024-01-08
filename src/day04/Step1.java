package day04;

import java.util.Random;

public class Step1 {
    public static void main(String[] args) {
        // p.110
            // 제어문 : 1.조건문 2.반복문
            // 흐름제어 : 조건문 ({} 이후 정상흐름)
            //           반복문({} 이후 제어문으로 되돌아감) - 루핑
        // if문
            // if(조건식) {실행문; 실행문;}
            // if(조건식) 실행문;
            // if(조건식) {실행문} else
        // p.111
        int score = 93; // 1. 변수 초기화

        if(score >= 90){
            System.out.println("점수가 90보다 큽니다.");
            System.out.println("등급은 A입니다");
        }
        if(score < 90)
            System.out.println("점수가 90보다 작습니다");
            System.out.println("등급은 B등급입니다."); // IF 조건식에 관련없이 무조건 실행

        // p.113
        if(score >=90) {
            System.out.println("점수가 90보다 큽니다");
            System.out.println("등급은 A입니다");
        }else{
            System.out.println("점수가 90보다 적습니다.");
            System.out.println("등급은 B입니다");
        }
        // p.114
        if(score >=90){
            System.out.println("점수가 100~90입니다");
            System.out.println("등급은 A등급 입니다");
        } else if (score >= 80) {
            System.out.println("점수가 80~89입니다");
            System.out.println("등급은 B등급 입니다");
        } else if (score>=70) {
            System.out.println("점수가 70~79입니다");
            System.out.println("등급은  C등급 입니다");
        }else{
            System.out.println("점수가 70미만입니다");
            System.out.println("등급은 D등급 입니다");
        }
        // p.115 난수 만들기 : Math.random(), Random 클래스
            //1. Math.random() : 난수 함수
        System.out.println("0~1미만 난수/랜덤 생성 : " + Math.random());
            // 2.
        System.out.println( new Random());
        System.out.println( new Random().nextInt());

        // 주사위 난수 : 1~6 사이의 난수 생성
//        int num = Math.random(); // 0~1
//        int num = Math.random()*6; // 0~1 * 6   => 0~6
//        int num = Math.random()*6+1; // 0~1 * 6+1   => 0~7미만
        int num = (int)(Math.random()*6+1); // (ing) 0.xx~1.xx * 6+1   => 0~7미만

        // 2.
        Random random = new Random();
        // 클래스명 변수명 = new 클래스명(); // 클래스에 해당하는 객체 생성(객체 만드는 이유 : 라이브러리(미리 만들어놓)쓸려고
//        int num2 = random.nextInt(bound:6); // int 허용범위내 난수 생성 0~6미만
//        int num2 = random.nextInt(bound:6)+1; // int 허용범위내 난수 생성 1~7미만
//
//        if (num2 == 1) {
//            System.out.println("주사위 1입니다.");
//        }
//        else if (num2 == 2) {
//            System.out.println("주사위 2입니다.");
//        }
//        else if (num2 == 3) {
//            System.out.println("주사위 3입니다.");
//        }
//        else if (num2 == 4) {
//            System.out.println("주사위 4입니다.");
//        }
//        else if (num2 == 5) {
//            System.out.println("주사위 5입니다.");
//        }else {
//            System.out.println("주사위 6입니다.");
//
//        }
    } // main e
} // class e
