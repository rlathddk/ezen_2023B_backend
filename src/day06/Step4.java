package day06;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {

        // 1. 문자열로 받은 금액을 천단위 쉼표를 넣어주는 코드
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력(숫자형식으로 입력받기) : ");
        String money = scanner.nextLine();
            // 입력받은 문자열타입의 금액을 천단위 쉼표 변환
        String result = "";
        for(int i = 0; i<money.length(); i++){
//            System.out.println(i);
            System.out.println(money.charAt(i)+""); // 입력받은 문자열들을 for문 이용한 한 문자씩 추출.

            // 천단위쉼표 : 천단위마다 , 추가 , 패턴 : 3자리마다
            if(i > 0 && (money.length()- i) %3 == 0){ // i가 0보다 크면서 i3가 3배수이면
                result += ",";
            }
            result += money.charAt(i);
        } // for e
        System.out.println("\n result = " + result);



    } // m e
} // c e
