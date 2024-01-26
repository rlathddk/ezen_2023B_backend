package day18.controller;

import day18.model.dao.BoardDao;
import day18.model.dao.MemberDao;
import day18.model.dto.BoardDto;

public class BoardController {
    // 싱글톤
    private BoardController(){};
    private static BoardController BoardController = new BoardController();
    public static BoardController getInstance(){return BoardController;}


    // 글쓰기
    public boolean 글쓰기(BoardDto BoardDto){
        boolean result= BoardDao.getInstance().글쓰기(BoardDto);
        // 2. 반환
        return  result;
    }
} // c e
