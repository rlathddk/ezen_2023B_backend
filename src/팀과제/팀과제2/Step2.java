package 팀과제.팀과제2;

import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        서비스형태 Basic = new 서비스형태("Basic","1TB", "2",10000);
        서비스형태 Standard = new 서비스형태("Standard","2TB", "2",11000);
        서비스형태 Premium = new 서비스형태("Premium","3TB", "2",12000);
        서비스형태[] 서비스형태배열 = new 서비스형태[]{Basic,Standard,Premium};
        Client[] ClientArray = new Client[100];
        while(true){
            System.out.println("1.회원가입 2.로그인");
            int ch = scanner.nextInt();
            if(ch==1){ // 회원가입
                scanner.nextLine();
                System.out.print("아이디 : ");
                String id = scanner.nextLine();
                System.out.print("비밀번호 : ");
                String pw = scanner.nextLine();
                // 객체생성
                Client 회원가입 = new Client(id, pw); // 객체생성이 뭐지
                // 배열담기
                for(int i = 0; i<ClientArray.length; i++){
                   if(ClientArray[i]!=null){
                       if(ClientArray[i].id.equals(id)){
                           System.out.println("중복된 아이디가 존재합니다.");
                           break;
                       }
                   }
                   else {
                       ClientArray[i] = 회원가입;
                   }
                } // f e
            } // 1 if e
            else if(ch==2){ // 로그인
                System.out.println("아이디 : ");
                String id = scanner.nextLine();
                System.out.println("비밀번호 : ");
                String pw = scanner.nextLine();
                Client 로그인 = new Client(id, pw);

                for(int i =0; i<ClientArray.length; i++){
                    if(ClientArray[i] != null){
                        if(ClientArray[i].id.equals(id) && ClientArray[i].pw.equals(pw)){
                            ClientArray[i] = 로그인;
                            break;
                        }
                    }
                }
            };
        } // w e
    } // m e
} // c e
