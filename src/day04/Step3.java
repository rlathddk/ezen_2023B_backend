package day04;


import java.util.Scanner;

// p.131 무한루프 활용
public class Step3 {
    public static void main(String[] args) {
        // 입력객체 생성 : inport
        Scanner scanner = new Scanner((System.in));
        int speed = 0; // 현재 속도를 저장하고 있는 변수 [1입력하면 1증가, 2입력하면 2중가]
        //무한루프의 상태를 저장하고 있는 변수 [on/off]
        boolean run = true;
        while(true){
            System.out.println("---------------------------------------------");
            System.out.println("1. 중속(speed증가) | 2. 감속(speed감소) | 3. 중지(무한루프종료)");
            System.out.println("---------------------------------------------");
            System.out.println("선택 : ");
            // =========================무한 반복 입력 =========================//
            String strNum = scanner.nextLine(); // 엔터를 입력할때까지 'console 이 대기' 상태로 됨
            // ===============================================================//

            // =========================입력값에 따른 경의우수 판단 =========================//
            if(strNum.equals("1")){ // 만약에 입력받은 값(문자열) 문자 1이면[문자 비교시에는 equals()]
                speed++;
                System.out.println("speed =" + speed);
            }else if(strNum.equals("2")){// 만약에 입력받은 값이 2이면
                speed--;
                System.out.println("speed =" + speed);
            } else if (strNum.equals("3")) { // 만약에 입력받은 값이 3이면
                // 1. while 다시 이동해서 false 이므로 반복문 종료
                run = false;
                // 2. 가장 가꾸운 반복문{}나가기 -> 38번줄 이동
//                break; // 가장 가까운 반복문 탈출 키워드 /
//                // 3. 함수{}나가기 -> 40번줄 이동
//                return; // 현재 함수 종료 // 함수밖으로 나감
            } // if end
        } // 무한루프 끝
    } // main e
} // class e

/*
    무한루프 = 무한반복
        - 주의할점 : 무한루프 종료하는 장치 필수.
        1.
            while(true){}
        2.
            boolean run = true;
            while(run) {}
* */