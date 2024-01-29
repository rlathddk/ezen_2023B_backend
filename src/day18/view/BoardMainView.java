package day18.view;

import day18.controller.MemberController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BoardMainView {
    // 싱글톤
    private BoardMainView(){}
    private static BoardMainView BoardMainView = new BoardMainView();
    public static BoardMainView getInstance(){  return BoardMainView;}
    //입력객체
    Scanner scanner = MainView.getInstance().scanner;

    // 0.로그인 성공시 출력되는 화면.
    public void run(){
        while (true){
            System.out.println("=========== ezen 게시판 ===========");
            // 추후에 현재 게시물 출력 메소드 가 들어갈 자리
            System.out.println("1.글쓰기 2.글보기 3.로그아웃");

            try { // 만약에 tyr{ } 안에서 예외 가 발생하면 catch 이동

                System.out.print("선택> "); int ch = scanner.nextInt();

                if( ch == 1 ){
                    BoardView.getInstance().글쓰기();
                }
                else if( ch == 2 ){

                }
                else if( ch == 3 ){
                    System.out.println("로그아웃 되었습니다.");
                }
                else {
                    System.out.println("<안내> 알수 없는 기능 번호 입니다.");
                }

                //catch 다중이 가능하다.
            }catch ( InputMismatchException e  ){ // input 타입 오류
                System.out.println("<안내> 입력 할수 없는 형식 입니다." + e); // !!!! :
                scanner = new Scanner(System.in); // 입력객체내 입력받은 필드/바이트 초기화

            }catch ( Exception e ){ // 그외 : 테스트 하면서 오류 확인후 추후에 업데이트할 예정
                System.out.println( e );
            } // end
        } // w end
    } // m end
} // c end