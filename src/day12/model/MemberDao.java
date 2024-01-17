package day12.model;

// DAO : 데이터베이스 접근 객체
// 데이터를 담는 틀 ?

import java.util.ArrayList;

public class MemberDao {
    // 싱글톤
    private MemberDao(){};
    private static MemberDao memberDao = new MemberDao();
    public static MemberDao getInstance(){return memberDao;}

    // DB 대신에 배열0
        // 배열 사용시 불편하점 : 고정길이
        // 고정길이 배열을 가변길이 배열로 구현 => 제공하는 라이브러리// 컬렉션(수집)프레임워크(라이브러리집합)
        // 컬렉션 프레임워크 : ArrayList 가변길이 배열을 지원하는 클래스
    //ArrayList<여러개저장할객체의타입> 변수명 = new ArrayList<>()
    // MemberDto[] memberDtos = new MemberDto[100];
    ArrayList<MemberDto> memberDtos = new ArrayList<>();
    // 제공하는 함수
            //          가변길이                            고정길이
            //      ArrayList<타입>변수명        vs       타입[]변수명
            // 저장 : js[.push()] vs java [.add(저장할 데이터)]     [인덱스] = 저장할 데이터
                // 회원가입
            // 개수 : .size()                             배열명.length
            // 호출 : .get(인덱스)                         배열명[인덱스]
                // 로그인
                // 아이디찾기 / 비밀번호찾기
            // 삭제 : .remove(인덱스)                      배열명[인덱스] = null
    // 1. 회원가입 메소드
    public boolean signup(MemberDto memberDto){
        System.out.println("MemberDao.signup");
        memberDtos.add(memberDto);
        return true; // 회원가입 성공
    }
    // 2. 로그인 메소드
    public boolean login(MemberDto memberDto){
        System.out.println("[3] Memberdao.login");
        // 로그인 처리 : 전체(배열/arrayList 회원객체 중에 입력받은
        for(int i = 0; i<memberDtos.size(); i++){
            // i는 0부터 리스트내 요소 개수까지 1씩 증가
            if(memberDtos.get(i).getId().equals(memberDto.getId())){
                // 리스트내 i번째 객체의 아이디와 입력받은아이디(매개변수)
                if(memberDtos.get(i).getPw().equals(memberDto.getPw())){
                    //리스트내 i번째 객체의 비밀번호와 입력받은비밀번호(매개변수)같으면
                    return true; // 로그인 성공
                }
            }
        }
        return false;
    }
}
