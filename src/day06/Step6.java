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

        while (true) {

            // 입력
            System.out.println("선택 > 1.등록 2.삭제 3.출력");
            String ch = scanner.nextLine();
            int no = 0;

            if (ch.equals("1")) { // 1.작성
                // 전화번호부 입력
                System.out.print("이름 : ");
                String name = scanner.nextLine();
                System.out.print("전화번호 : ");
                String num = scanner.nextLine();
                String 명단 =name+"\t\t"+num ; // 명단을 ,를 구분
                전화번호부 += 명단  + "/";
                // 이름 전화번호 구분(상태구분)필요

                System.out.println("=============== 전화번호부 ==============");
                System.out.println("순번\t\t 이름 \t\t 전화번호 \t\t");
                String[] numsp = 전화번호부.split("/"); // 전화번호부의 "/' 회원목록 짜르기



                for(int i = 0; i< numsp.length;i++){ // 전화번호부의 길이만큼 i번째 반복
                    // 출력
                    no ++;
                    System.out.println(no + "\t\t" + numsp[i]);

                }// f e

            } // if e
            else if (ch.equals("2")) { // 2.삭제
                System.out.println("삭제할 번호를 입력하세요 : ");
                int del = scanner.nextInt(); // 삭제할 번호 입력 받아서
                String 전화번호부2 = ""; // 새로운 전화번호부 생성
                for(int i = 0; i < 전화번호부.length(); i++){ // 삭제할 위치 찾기
                    if(i !=del){ // i번째와 입력한 숫자와 같지 않다면
                        전화번호부2+= 전화번호부;
                        System.out.println(전화번호부);
                    }// if e
                } // f e
            } // else e
        }// w e
    } //m e
} // c e
