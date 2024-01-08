package 팀과제;

import java.util.Random;
import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {


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
    }// m end
} // c end
