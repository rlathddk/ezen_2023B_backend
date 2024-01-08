package day05;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // 라이브러리

        // 배열
        int[] students = new int [0];
        // 1. 무한루프
       while(true){
           // 2. 출력
           System.out.println("-----------------------------------------");
           System.out.println("1.학생수|2.점수입력|3.점수리스트|4.분석|5.종료 ");
           System.out.println("-----------------------------------------");
           // 3. 입력
           System.out.print("선택 >");
           String ch = scanner.nextLine();
           // 4. 경우의수
           if(ch.equals("1")){
               System.out.print("학생수>");
               String count = scanner.nextLine();
               // while 밖에서 입력받은 수 만큼 배열 선언 => 다른 if{}에서 사용하기 위해
               // [p.172] 입력받은 (문자-> 정수 변환 ) 만큼 배열길이 만큼 배열길이를 다시 초기화
               students = new int[Integer.parseInt(count)];
           }
           else if(ch.equals("2")){
               // 6. [1]번에서 입력받은 학생수 만큼 점수를 입력받기.
               for(int i = 0; i<students.length; i++){
                   System.out.printf("scores[%d]>", i);
                   // 입력받은 문자열 -> 정수 변환 해서 i번째 인덱스에 저장
                   students[i] = Integer.parseInt(scanner.nextLine());
               }
           }
           else if(ch.equals("3")){
               // 7. 배열내 모든 학생 점수 출력
               for(int i = 0; i<students.length; i++){
                   System.out.printf("scores[%d] : %3d \n",i , students[i]);
               } //f end
           }
           else if(ch.equals("4")){
               int max = 0; // 임의로 최저 점수 넣어놓고 시작
               int sum = 0; // 총합계
               for(int i =0 ; i < students.length; i++){
                   // 만약에 i번째 인덱스의 값이 max보다 크면 대입
                   if(students[i]>=max){max = students[i];}
                    // [평군에서 사용할 총합계]
                   sum += students[i];
               }
               System.out.println("max =" +max);
               double avg = sum/students.length;
               System.out.printf("avg = %.1f \n", avg);
           }
           else if(ch.equals("5")){
               System.out.println("프로그램 종료");
               break;
           }
           else {}
       } // w
    } // m e
} // c e
