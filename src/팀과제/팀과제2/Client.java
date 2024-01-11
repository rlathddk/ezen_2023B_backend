package 팀과제.팀과제2;

public class Client {//class start

    String id;
    String pw;
    int 구독기간;
    String 서비스형태;

    Client(String id, String pw){};
    Client(String id , String pw , int 구독기간 , String 서비스형태){
        this.id = id;
        this.pw = pw;
        this.구독기간 = 구독기간;
        this.서비스형태 = 서비스형태;
    }

}//class end
