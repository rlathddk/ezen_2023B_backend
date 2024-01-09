package day06;

import java.util.Scanner;

public class Step6 {
    public static void main(String[] args) {

        // 3. step6 전화번호부 만들기 [ 완성되면 카톡방 코드 제출 ]
/*
    [1.조건]
        - 하나의 문자열만 이용하여 여러명의 이름과 전호번호를 관리하시오.
        String 전화번호부 = "";

    [2.기능구현]
        1.전화번호 등록
            - 이름 과 전화번호 를 입력받아 저장.
        2.전화번호 삭제
            - 출력된 전화번호 목록을 보고 순번을 입력받아 해당 순번의 전화번호 삭제
        3.전화번호 출력
            - String 전화번호부 에 저장된 데이터를 아래 그림과 같이 출력

    [3.실행화면]
        ============= 전화번호부 =============
        순번     이름      전화번호
        1       김현수     010-3913-2072
        2       유재석     010-1234-1234
        3       강호동     010-7777-7777

        1.전화번호등록 2.전화번호삭제
        선택>
*/

        Scanner scanner = new Scanner(System.in);

        // 3. 전화번호부 만들기
        String 전화번호부 = "";
        // 무한루프
        while (true){

        // 출력
            System.out.println("=============== 전화번호부 ==============");
            System.out.printf("순번\t\t 이름 \t\t 전화번호 \t\t");

            // 입력
            System.out.print("선택 > ");
            String ch = scanner.nextLine();

            if(ch.equals("1")){ // 작성
                int no = scanner.nextInt();

                System.out.print("이름을 입력해주세요 : ");
                String name = scanner.nextLine();
                전화번호부 += name + ",";
                System.out.print("전화번호를 입력해주세요 : ");
                String phonNum = scanner.next();
                전화번호부 += phonNum + ",";

            }
            else if (ch.equals("2")){ // 삭제
                System.out.println("삭제할 번호를 입력하세요 :");

            }
            else if (ch.equals("3")){

            }
            else {
                System.out.println("알수없는 입력입니다.");
            }


        } // w e


    } //m e
} // c e
