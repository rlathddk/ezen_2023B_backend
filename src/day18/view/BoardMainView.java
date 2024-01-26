package day18.view;

import day18.controller.BoardController;
import day18.controller.MemberController;
import day18.model.dto.BoardDto;
import day18.model.dto.MemberDto;

import java.util.Scanner;

public class BoardMainView {
    // 싱글톤
    private BoardMainView(){};
    private static BoardMainView BoardMainView = new BoardMainView();
    public static BoardMainView getInstance(){return BoardMainView;}

    // 입력객체
    Scanner scanner = MainView.getInstance().scanner;


    public void 글쓰기(){
        // 1. 입력받기
        System.out.println("제목 :"); String 제목 = scanner.next();
        System.out.println("내용 :"); String 내용 = scanner.next();
        // 2. 객체화
        BoardDto BoardDto = new BoardDto(제목, 내용);

        // 3. 컨트롤러에게 전달 후 결과
        boolean result = BoardController.getInstance().글쓰기(BoardDto);

        // 4. 결과 출력
        if(result){
            System.out.println("글작성 완료");
            // 게시판 화면으로 이동할 예정 <페이지 전환>
//            BoardView.getInstance().run();
        }else{
            System.out.println("글작성 실패");
        }

    } // 글쓰기e
}// c e
