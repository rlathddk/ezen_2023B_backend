package day18.view;

import day18.controller.BoardController;
import day18.model.dao.BoardDao;
import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;

import java.util.ArrayList;
import java.util.Scanner;

public class BoardView {
    // 싱글톤
    private BoardView(){}
    private static BoardView BoardView = new BoardView();
    public static BoardView getInstance(){  return BoardView;}
    // 입력객체
    Scanner scanner = MainView.getInstance().scanner;
    public void 글쓰기() {
        //카테고리 출력
        ArrayList<CategoryDto> cArray= BoardDao.getInstance().categoryPrint();
        for(int i=0; i<cArray.size(); i++){
            System.out.printf("%d.%s \t",cArray.get(i).getCno(), cArray.get(i).getCname());
        }
        System.out.print("\n선택>");
        int cno = MainView.getInstance().scanner.nextInt();
        MainView.getInstance().scanner.nextLine();

        //입력
        MainView.getInstance().scanner.nextLine();
        System.out.print("제목 : ");
        String btitle = scanner.next();
        System.out.print("내용 : ");
        String bcontent = scanner.next();

        // 저장
        BoardDto boardDto = new BoardDto();
        boardDto.setBtitle(btitle);
        boardDto.setBcontent(bcontent);
        boardDto.setCno(cno);

        // 결과물 출력
        boolean result = BoardController.getInstance().글쓰기(boardDto);;
        if (result) {
            System.out.println("<안내> 글등록 완료 ");
        } else {
            System.out.println("<안내> 글등록 실패" );
        }


    }
} // c e
