package 팀과제;

import java.util.Random;
import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random(); // 난수 라이브러리 생성

        int 플레이어승리수 = 0 ;
        int 컴퓨터승리수 = 0;
        int playNum = 0;  // 컴퓨터 유저 변환 변수 담을 곳
        int comNum = random.nextInt(3); // 1부터 3 숫자 생성
        boolean rsp = true;

        while(rsp){ // w s

            // 유저 가위바위보 입력
            System.out.print("가위바위보를 입력하세요 : ");
            String 플레이어 = scanner.nextLine();

            // 유저 변환
            if (플레이어.equals("x")){
                System.out.println("가위바위보 종료");
                플레이어승리수 = 0;
                컴퓨터승리수 = 0;
                break;
            }else if (플레이어.equals("가위")) {
                playNum = 0;
            }else if (플레이어.equals("바위")) {
                playNum = 1;
            }else if (플레이어.equals("보")) {
                playNum = 2;
            } else {
                System.out.println("잘못된 값을 입력하셨습니다.");
                return;
            }

            // 컴퓨터 변환
            if (comNum == 0){
                System.out.println("가위");
            } else if (comNum == 1) {
                System.out.println("바위");
            } else if (comNum == 2) {
                System.out.println("보");
            }

            // 가위바위보 시작
            if(playNum==comNum){
                System.out.println("무승부입니다.");
            }else if ((comNum+1)%3==playNum){
                System.out.println("플레이어 승리");
                플레이어승리수++;
                System.out.printf("현재플레이어승리수 : %d\t현재컴퓨터승리수 : %d \n",플레이어승리수,컴퓨터승리수);
            }else if (comNum==(playNum+1)%3){
                System.out.println("플레이어 패배");
                컴퓨터승리수++;
                System.out.printf("현재플레이어승리수 : %d\t현재컴퓨터승리수 : %d \n",플레이어승리수,컴퓨터승리수);
            }

        } // w end

    } // m end
} // c end
