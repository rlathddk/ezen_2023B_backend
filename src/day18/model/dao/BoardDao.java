package day18.model.dao;

import day18.model.dto.BoardDto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardDao {
    // 1. 필드
    // DB 연동 관련 인터페이스 준비물
    protected Connection conn; // 여러 메소드에서 사용할라고 1. DB연동객체
    protected PreparedStatement ps ; // 2. 작성된 SQL 가지고 있고, 매개변수 , SQL실행 담당.
    protected ResultSet rs;        // 3. sql 실행 결과

    private BoardDao(){; // 생성자 : 객체 생성시 초기화 담당
        try{
            // 1. MYSQL 회사의 JDBC관련된 (Driver)객체를 JVM에 로딩한다. 불러오기.
            Class.forName("com.mysql.cj.jdbc.Driver");
            // 2. 연동된 결과의 (구현체)객체를 Connection인터페이스에 대입한다.
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java",
                    "root", "1234"
            );
            System.out.println("<DB연동 성공>");
        }catch ( Exception e ){  System.out.println("<DB연동실패>" + e); }
    };
    private static MemberDao MemberDao = new MemberDao();
    public static MemberDao getInstance(){return MemberDao;}

    public boolean 글쓰기(BoardDto BoardDto){
        try {
            // 1. SQL 작성 [ 변수가 들어갈 자리에는 ? 대체한다. ]
            String sql = "insert into board( mid , mpw , mphone ) " +
                    " values( ? , ? , ? ) ";
            // 2. SQL 기재
            ps = conn.prepareStatement(sql);
            // ? 매개변수 대입
            ps.setString(1, BoardDto.getBtitle());      // 기재된 SQL내 첫번째 ? 에 값 대입
            ps.setString(2, BoardDto.bcontent());     // 기재된 SQL내 두번째 ? 에 값 대입
            ps.setString(3, BoardDto.getBno());  // 기재된 SQL내 세번째 ? 에 값 대입
            ps.setString(3, BoardDto.get());  // 기재된 SQL내 세번째 ? 에 값 대입
            ps.setInt(5, 0 );
            // 3. SQL 실행  // 4. SQL 결과
            int count = ps.executeUpdate(); // executeUpdate() 기재된 sql 실행하고 insert된 레코드 개수 반환.
            if (count == 1) {   return 0; } // 만약에 insert처리된 레코드가 1개이면 회원가입 성공
        }catch ( Exception e ){    System.out.println(e);    }

        // 5. 함수 종료
        return 1; // 실패
    }
} // c e
