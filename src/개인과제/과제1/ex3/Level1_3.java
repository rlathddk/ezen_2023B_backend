package 개인과제.과제1.ex3;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level1_3 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_3 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		/* 문제풀이 위치 */
		System.out.println("input boolean : " ) ;
		boolean bool = scanner.nextBoolean();
		System.out.println("input byte : " ) ;
		byte b = scanner.nextByte();
		System.out.println("input short : " ) ;
		short s = scanner.nextShort();
		System.out.println("input int : " ) ;
		int i = scanner.nextInt();
		System.out.println("input long : " ) ;
		long l = scanner.nextLong();
		System.out.println("input float : " ) ;
		float f = scanner.nextFloat();
		System.out.println("input double : " ) ;
		double d = scanner.nextDouble();

//		byte c = scanner.next();

		System.out.println("input boolean : " + bool + "\n") ;
		System.out.println("input byte :" + b + "\n") ;
		System.out.println("input short :" + s + "\n") ;
		System.out.println("input int :" + i + "\n") ;
		System.out.println("input long :" + l + "\n") ;
		System.out.println("input float :" + f + "\n") ;
		System.out.println("input double :" + d + "\n") ;


		/* ----------- */
	}
}
/*
	[문제] 그림과 같이 기본자료형을 이용하여 변수 8개를 출력하시오.
	[조건] 
		1. 모든 기본자료형 8개 사용
		2. print() 메소드 사용
		3. scanner 객체 사용하여 입력받기
*/
