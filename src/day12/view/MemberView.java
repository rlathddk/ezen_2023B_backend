package day12.view;

import day12.controller.MemberController;
import day12.model.MemberDto;

import java.util.Scanner;

// VIEW : 화면구현(입출력)

public class MemberView {
    private MemberView(){};
    private static MemberView MemberView = new MemberView();
    public static MemberView getInstance(){return MemberView;}
    // 1. 회원가입 메소드
    public void signup(){
        System.out.println("MemberView.signup");
        // MainView.getInstance() : 싱클톤(미리 만들어진 단 하나의 객체) 호출
        Scanner scanner = MainView.getInstance().scanner;
        // 1. 입력받는다
        System.out.println("아이디 : "); String id = scanner.next();
        System.out.println("비밀번호 : "); String pw = scanner.next();
        System.out.println("이름 : "); String name = scanner.next();
        System.out.println("전화번호 : "); String phone = scanner.next();
        // 2. 객체화
        MemberDto memberDto =new MemberDto(0, id, pw, name, phone);
        // 3. 객체를 컨트롤 전달(매개변수/회원가입 필요한 정보.객체)후
            // 처리 결과(리턴/회원가입 처리 결과(t성공/f실패) . boolean)를 받기
        boolean result =
        MemberController.getInstance().signup(memberDto);
        // 4. 결과에 따른 출력문 만들기
        if(result){
            System.out.println("안내] 회원가입 성공");
        }else{
            System.out.println("안내] 회원가입 실패");
        }// f e

    }
    // 2. 로그인 메소드
    public void login(){
        System.out.println("[1]Memberview.login");
        // 1. 입력받기
        Scanner scanner = MainView.getInstance().scanner;
        System.out.println("아이디 : ");
        String id = scanner.next();
        System.out.println("비밀번호 : ");
        String pw = scanner.next();

        // 2. 객체 vs 2개 문자열
        MemberDto memberDto = new MemberDto();
        memberDto.setId(id);
        memberDto.setPw(pw);

        // 3. 컨트롤에게(로그인에 필요한 정보) 전달하고 결과(boolean) 받기
        boolean result = MemberController.getInstance().login(memberDto);
        MemberController.getInstance().login(memberDto);

        // 4. 결과에 따른  처리
        if(result){
            System.out.println("안내] 로그인 성공");
            // 로그인 성공시 사용할 서비스의 view로 이동
        }else {
            System.out.println("안내] 로그인 실패");
        }

    }
}

