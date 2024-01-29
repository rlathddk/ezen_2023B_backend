package day18.controller;

import day18.model.dao.BoardDao;
import day18.model.dto.BoardDto;
import day18.view.BoardMainView;
import day18.view.MainView;
import day18.view.MemberView;

import java.util.Scanner;

public class BoardController {
    // 싱글톤
    private BoardController(){}
    private static BoardController BoardController = new BoardController();
    public static BoardController getInstance(){  return BoardController;}

    public boolean 글쓰기(BoardDto boardDto){
        // 1. dao에게 login 처리 요청하고 결과 받기.
        boolean result = BoardDao.getInstance().글쓰기(boardDto);
        return result;
    }
} // c e