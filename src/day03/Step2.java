package day03;

import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {

        // 예제1 : 작성자, 내용 , 날짜 3가지를 문자로 입력받아 출력.
            // 객체 사용이유 : 미리설계 된 속성/메소드를 쓸려고
            Scanner scanner = new Scanner(System.in); //Scanner 클래스란 화면으로부터 데이터를 입력받는 기능을 제공하는 클래스

            // 1. 입력
          /*  System.out.println("작성자 : ");
            String 작성자 = scanner.next();
            System.out.println("내용 : ");
            String 내용 = scanner.next();
            System.out.println("날짜 : ");
            String 날짜 = scanner.next();

            // 2. 입력받은 데이터를 출력
            System.out.printf("=================방문록====================");
            System.out.printf("%4s %10s %220s %10s \n", "번호", "작성자", "내용", "날짜");
            System.out.printf("%4s %10s %220s %10s \n", "1", "작성자", "내용", "날짜");
            //

            System.out.println("=================방문록====================");
            System.out.println("번호 | 작성자 \t\t| 내용 \t\t | 날짜");
            System.out.println(01+"|" + 작성자 + "\t\t|"+내용+"\t\t|"+날짜);
        */

            // 예제2 : 기본급과 수당 정수로 입력받아 실수령액 계산해서 출력
                // 실수령액 : 기본급 + 수당 - 세금[기본급10%]
                // 1. 입력
            System.out.print("기본급 : "); int 기본급 = scanner.nextInt();
            System.out.print("수당 : "); int 수당 = scanner.nextInt();

                // 2. 처리
            int 실수령액 = 기본급 + 수당 - (int) (기본급*0.1); // % : 나머지 연산자
                // 오류 나는 이유 : int = int + int - int * double => double
                    // 0.1 double형 이므로 int*double의 결과는 double
                    // 그래서 double을 int에 대입할 수 없다 -> 강제 캐스팅

                // 3. 출력
            System.out.println("실수령액 = " + 실수령액);






    } // m end
} // c end
