package day18.model.dao;

import day18.controller.BoardController;
import day18.model.dto.BoardDto;
import day18.model.dto.CategoryDto;

import java.util.ArrayList;

public class BoardDao extends Dao {
    private BoardDao(){}
    private static BoardDao BoardDao = new BoardDao();
    public static BoardDao getInstance(){  return BoardDao;}

    public boolean 글쓰기(BoardDto boardDto){
        try {
            String sql = "insert into board(btitle,bcontent,cno,mno,bcount)values(?,?,?,?,?)";
            ps = conn.prepareStatement(sql);
            ps.setString(1, boardDto.getBtitle());
            ps.setString(2, boardDto.getBcontent());
            ps.setInt(3, boardDto.getCno());
            ps.setInt(4, boardDto.getMno());
            ps.setInt(5, 0 );

            ps.executeUpdate();
            return true;
        }catch (Exception e ){
            System.out.print(e);
        }
        return false;
    }

    public ArrayList<CategoryDto> categoryPrint() {
        try{
            String sql ="select * from category";

            ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();


            ArrayList<CategoryDto> categoryDtos = new ArrayList<>();

            while( rs.next() ){

                CategoryDto categoryDto = new CategoryDto();
                categoryDto.setCno(  rs.getInt( "cno") );
                categoryDto.setCname( rs.getString("cname") );

                categoryDtos.add( categoryDto );
            } //
            return categoryDtos;

        }catch (Exception e ){

        }
        return null;
    }
} // c e
