package 개인과제.과제4.ex2;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level4_2 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level4_2 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);

		String[] students = new String[0];

		while ( true ) {
			/* 문제풀이 위치 */
			System.out.print("배열 길이 : ");
			int num1 = scanner.nextInt(); // 배열크기
			String [] a= new String[num1];
			for(int i = 0; i<a.length; i++){
			System.out.print("\t"+a[i]);
			}// f e
			System.out.println("\n");
			/* ----------- */
		}
	}
}
/* 
	[문제]
		1. String[] students : 길이가 0 인 문자열 배열변수 입니다.
		2. 입력한 수 만큼 배열의 크기를 만드시오.
		3. 배열 상태를 그림과 같이 출력하시오.
*/
