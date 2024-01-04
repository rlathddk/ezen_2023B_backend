package 과제.과제2.Level1.ex7;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level1_7 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_7 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		
		String output = "";
		
		/* 문제풀이 위치 */
		System.out.print("회원명 String : ");
	    output = scanner.next();
		System.out.println("상태 boolean : ");
		boolean bool = scanner.nextBoolean();
		System.out.println("회원번호 byte : ");
		byte by = scanner.nextByte();
		System.out.println("성별 : char");
		char ch = scanner.next().charAt(0);
		System.out.println("나이 short :");
		short sh = scanner.nextShort();
		System.out.println("포인트 int : ");
		int i = scanner.nextInt();
		System.out.println("예금액 long : ");
		long lo = scanner.nextLong();
		System.out.println("키 float : ");
		float fl = scanner.nextFloat();
		System.out.println("몸무게 double : ");
		double dou = scanner.nextDouble();

		System.out.println("============== 회원 개인정보 =================");
		System.out.println("|\t\t\t 회원명: " + output + "\t\t\t\t\t\t|");
		System.out.println("|\t\t\t 상태: " + bool + "\t\t\t\t\t\t|");
		System.out.println("|\t\t\t 회원번호: " + by + "\t\t\t\t\t\t|");
		System.out.println("|\t\t\t 성별: " + ch + "\t\t\t|");
		System.out.println("|\t\t\t 나이: " + sh + "\t\t\t\t\t\t|");
		System.out.println("|\t\t\t 포인트: " + i + "\t\t\t\t\t\t|");
		System.out.println("|\t\t\t 예금액: " + lo + "\t\t\t\t\t\t|");
		System.out.println("|\t\t\t 평균: " + fl + "\t\t\t\t\t\t|");
		System.out.println("|\t\t\t 평균: " + dou + "\t\t\t\t\t\t|");
		System.out.println("============================================");


		/* ----------- */
	}
}
/* 
	[문제조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.
		2. 기본 자료형8개 + 문자열클래스 변수 1개 를 이용한 9개변수를 입력 받습니다.
		3. 입력받은 9개 변수를 그림과 같이 출력합니다.
		4. 기존에 미리 작성된 변수를 최대한 활용합니다.
		
*/
