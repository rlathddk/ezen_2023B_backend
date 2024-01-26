package day18.view;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainView {


    public Scanner scanner = new Scanner(System.in);

    // 싱글톤
    private MainView(){}
    private static MainView mainView = new MainView();
    public static MainView getInstance(){
        return mainView;
    }

    public void run(){
        while (true){
            System.out.println("======================= 메인 페이지 ======================");
            System.out.println("1.회원가입 2.로그인");
            try{ // 만약에 try{} 안에서 예외가 발생하면 catch 이동
                System.out.println("선택>"); int ch = scanner.nextInt();
                if(ch == 1){MemberView.getInstance().signup();}
                else if(ch ==2){
                    MemberView.getInstance().login();
                }
                else{
                    System.out.println("알 수 없는 번호입니다.");
                }
                // catch 다중이 가능하다
            } catch (InputMismatchException e){ // input 타입 오류
                System.out.println("알 수 없는 형식입니다" + e);
                scanner = new Scanner(System.in);  // 입력객체내 입력받은 필드/바이트 초기화
            } catch (Exception e){ // 그외 : 테스트 하면서 확인 후 추후에 업데이트할 예정
                System.out.println(e);
            }
        } // w e
    }
} // c e
