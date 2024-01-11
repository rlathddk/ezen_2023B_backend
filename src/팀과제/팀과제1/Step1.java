package 팀과제.팀과제1;

import java.util.Random;
import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random(); // 난수 라이브러리 생성
//
//        int 플레이어승리수 = 0 ;
//        int 컴퓨터승리수 = 0;
//        int playNum = 0;  // 컴퓨터 유저 변환 변수 담을 곳
//        int comNum = random.nextInt(3); // 1부터 3 숫자 생성
//        boolean rsp = true;
//
//        while(rsp){ // w s
//
//            // 유저 가위바위보 입력
//            System.out.print("가위바위보를 입력하세요 : ");
//            String 플레이어 = scanner.nextLine();
//
//            // 유저 변환
//            if (플레이어.equals("x")){
//                System.out.println("가위바위보 종료");
//                플레이어승리수 = 0;
//                컴퓨터승리수 = 0;
//                break;
//            }else if (플레이어.equals("가위")) {
//                playNum = 0;
//            }else if (플레이어.equals("바위")) {
//                playNum = 1;
//            }else if (플레이어.equals("보")) {
//                playNum = 2;
//            } else {
//                System.out.println("잘못된 값을 입력하셨습니다.");
//                return;
//            }
//
//            // 컴퓨터 변환
//            if (comNum == 0){
//                System.out.println("가위");
//            } else if (comNum == 1) {
//                System.out.println("바위");
//            } else if (comNum == 2) {
//                System.out.println("보");
//            }
//
//            // 가위바위보 시작
//            if(playNum==comNum){
//                System.out.println("무승부입니다.");
//            }else if ((comNum+1)%3==playNum){
//                System.out.println("플레이어 승리");
//                플레이어승리수++;
//                System.out.printf("현재플레이어승리수 : %d\t현재컴퓨터승리수 : %d \n",플레이어승리수,컴퓨터승리수);
//            }else if (comNum==(playNum+1)%3){
//                System.out.println("플레이어 패배");
//                컴퓨터승리수++;
//                System.out.printf("현재플레이어승리수 : %d\t현재컴퓨터승리수 : %d \n",플레이어승리수,컴퓨터승리수);
//            }
//
//        } // w end
        Scanner scanner=new Scanner(System.in);
        Random random=new Random();

        // 배열
        String[] 플레이어 = new String[2]; // 플레이어[0] 컴퓨터[1]
        int[] 승리수 = new int[2]; // 플레이어승리수[0] 컴퓨터승리수[1]

        //반복문
        while (true){// while start
            System.out.print("가위바위보 혹은 X를 입력해 주세요");
            플레이어[0] = scanner.next();
            플레이어[1] = String.valueOf(random.nextInt(3));
            int comNum =0; int playerNum= 0;// 가위바위보를 계산을 위한 대체숫자

            if (플레이어[0].equals("x") || 플레이어[0].equals("X")) { //if start
                System.out.println("플레이어 승리수: "+ 승리수[0]);
                System.out.println("컴퓨터 승리수: "+ 승리수[1]);
                승리수[0]=0; 승리수[1]=0; // 초기화



            }else if(플레이어[0].equals("가위")||플레이어[0].equals("바위")||플레이어[0].equals("보")){
                //문자를 숫자로 변환 (가위바위보 계산을 위해서)
                if (플레이어[0].equals("가위")){
                    playerNum=0;
                }else if(플레이어[0].equals("바위")){
                    playerNum=1;
                }else if(플레이어[0].equals("보")){
                    playerNum=2;
                }
                // 플레이어 승리수 배열에 대입


                //System.out.println(playerNum);
                if (플레이어[1].equals("0")){
                    comNum=0; 플레이어[1]="가위";
                }else if(플레이어[1].equals("1")){
                    comNum=1; 플레이어[1]="바위";
                }else if(플레이어[1].equals("2")){
                    comNum=2; 플레이어[1]="보";
                }

                //System.out.println(comNum);
                if(playerNum==(comNum+1)%3){
                    System.out.printf("플레이어:%s\n컴퓨터:%s\n",플레이어[0],플레이어[1]);
                    승리수[0]++;
                }else if(playerNum==comNum){
                    System.out.printf("플레이어:%s\n컴퓨터:%s\n",플레이어[0],플레이어[1]);
                    System.out.println("무승부");
                }else{
                    System.out.printf("플레이어:%s\n컴퓨터:%s\n",플레이어[0],플레이어[1]);
                    승리수[1]++;
                }
                System.out.printf("플레이어 승리수 = %d  컴퓨터 승리수 = %d \n" ,승리수[0],승리수[1]);
            } else {
                System.out.println("가위 바위 보 중에서 입력해주세요");
            }
        }// while end
    } // m end
} // c end
