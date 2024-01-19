package 개인과제.과제6;
import java.util.Scanner;

public class MemberSys { // class s
	static Scanner sc = new Scanner(System.in);
	static Member[] members = new Member[100];
	static void 회원가입(){

		System.out.print("아이디 : ");
		String 아이디 = sc.nextLine();
		System.out.print("비밀번호 : ");
		String 비밀번호 = sc.nextLine();
		System.out.print("이름 : ");
		String 이름 = sc.nextLine();
		System.out.print("전화번호 : ");
		String 전화번호 = sc.nextLine();
		System.out.print("나이 : ");
		String 나이 = sc.nextLine();

		Member 회원가입목록 = new Member(아이디, 비밀번호, 이름, 전화번호, 나이);

		for(int i = 0; i<members.length; i++){
			if(members[i]==null){
				members[i] = 회원가입목록;
				break;
			}
		}// for e
	} // 회원가입 e
	static void 로그인(){
		sc.nextLine();
		System.out.print("아이디 : ");
		String 아이디 = sc.nextLine();
		System.out.print("비밀번호 : ");
		String 비밀번호 = sc.nextLine();
		for(int i = 0; i < members.length; i++){
			if(members[i].get아이디().equals(아이디) && members[i].get비밀번호().equals(비밀번호)){
				System.out.println("로그인 성공");
				break;
			}else {
				System.out.println("로그인 실패");
				break;
			} // if e
		} // for e
	}// 로그인e
	static void 아이디찾기(){
		sc.nextLine();
		System.out.print("이름 : ");
		String 이름 = sc.nextLine();
		System.out.print("전화번호 : ");
		String 전화번호 = sc.nextLine();
		for(int i = 0; i < members.length; i++){
			if(members[i].get이름().equals(이름) && members[i].get전화번호().equals(전화번호)){
				System.out.println(members[i].get아이디());
				break;
			}else {
				System.out.println("아이디가 존재하지 않음");
				break;
			} // if e
		} // for e
	}// 아이디찾기e
	static void 비밀번호찾기(){
		sc.nextLine();
		System.out.print("아이디 : ");
		String 아이디 = sc.nextLine();
		System.out.print("전화번호 : ");
		String 전화번호 = sc.nextLine();
		for(int i = 0; i < members.length; i++){
			if(members[i].get아이디().equals(아이디) && members[i].get전화번호().equals(전화번호)){
				System.out.println(members[i].get비밀번호());
				break;
			}else {
				System.out.println("비밀번호를 찾을 수 없음");
				break;
			} // if e
		} // for e
	}// 비밀번호찾기e
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while(true) {

			System.out.println("\n\n--------- 회원 시스템 ---------");
			System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기   선택> ");
			int ch = sc.nextInt();

			if( ch == 1 ) {
				회원가입();
			}
			else if( ch == 2 ) {
				로그인();
			}
			else if( ch == 3 ) {
				아이디찾기();
			}
			else if( ch == 4 ) {
				비밀번호찾기();
			}

		} // w e
	} // m e
} // class e
/*
	주제 : 회원제 시스템 part2
	 	- Member , MemberSys 클래스를 이용하여 아래 조건에 따라. 코드를 완성하시오.
 		- Member , MemberSys 클래스 외 새로운 클래스를 생성 하지 마시오.
 		- main() 메소드 외 기능별 함수를 4개 생성하시오.

		[ Member 클래스 ]
 		0. 아래 필드를 가지는 클래스를 설계 하시오.
 			필드 : 아이디 , 비밀번호 , 이름 , 전화번호 , 나이
		1. 생성자 사용하시오.
		2. getter , setter 메소드를 사용하시오.

		[ MemberSys 클래스 ]
		0. 배열
			Member[] 객체배열 = new Member[100];

		1. 초기 메뉴
			1. 회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기

		2. 조건 기능
			1. 회원가입 메소드
				1. 아이디 , 비밀번호 , 이름 , 전화번호 , 나이  각 입력받아 저장
				2. Member 객체화
				3. 객체를 배열 저장

			2. 로그인 메소드
				1. 아이디 , 비밀번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 로그인 성공
					- 아니면 실패

			3. 아이디찾기 메소드
				1. 이름 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 찾은 아이디 출력
					- 아니면 없다.

			4. 비밀번호찾기 메소드
				1. 아이디 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 찾은 비밀번호 출력
					- 아니면 없다.


*/














