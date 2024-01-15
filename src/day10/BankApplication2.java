package day10;

import java.util.Scanner;




public class BankApplication2 {

    static Account2[] accounts = new Account2[100]; // 배열선언
    static Scanner scanner = new Scanner(System.in); // stactic 안넣으면 오류남
    static void 계좌생성(){
        scanner.nextLine();
        System.out.print("계좌번호 : ");
        String 계좌번호 = scanner.nextLine();
        System.out.print("계좌주 : ");
        String 계좌주 = scanner.nextLine();
        System.out.print("초기입금액 : ");
        int 초기입금액 = scanner.nextInt();

        // 객체생성
        Account2 account = new Account2(계좌번호, 계좌주, 초기입금액);

        // 배열 넣고
        for(int i = 0; i<accounts.length; i++){
            if(accounts[i]==null){ // 비어있지 않으면이 아니고 비어있으면!!
                accounts[i] = account;
                break;                                                      //브레이크 위치
            } // if e
        } // for e
    } // 계좌생성 e

    static void 계좌목록(){
        for(int i = 0; i < accounts.length; i++){
            if(accounts[i]!=null){ // 직관적
                System.out.printf("%13s \t %5s \t %10d \n", accounts[i].계좌번호, accounts[i].계좌주, accounts[i].입금액);
            }
        }
    } // 계좌목록 e
    static void 예금(){
        scanner.nextLine();
        System.out.print("계좌번호 : ");
        String 계좌번호 = scanner.nextLine();
        System.out.print("예금액 : ");
        int 예금액 = scanner.nextInt();
        for(int i =0; i<accounts.length; i++){
            if(accounts[i]==null){break;}
            else if (accounts[i].계좌번호.equals(계좌번호)) {
                    accounts[i].입금액 += 예금액;
            }
        }
    } // 예금 e
    static void 출금(){
        scanner.nextLine();
        System.out.print("계좌번호 : ");
        String 계좌번호 = scanner.nextLine();
        System.out.print("출금액 : ");
        int 출금액 = scanner.nextInt();
        for(int i =0; i<accounts.length; i++){
            if(accounts[i]==null){break;}
            else if (accounts[i].계좌번호.equals(계좌번호)) {
                accounts[i].입금액 -= 출금액;
            }
        }
    } // 예금 e

    public static void main(String[] args) {
        while (true){
            System.out.println("---------------------------------------------");
            System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
            System.out.println("---------------------------------------------");
            System.out.print("선택 >");
            int ch = scanner.nextInt();
            if(ch==1){계좌생성();}
            else if(ch==2){계좌목록();}
            else if(ch==3){예금();}
            else if(ch==4){출금();}
            else if(ch==5){
                System.out.println("프로그램 종료");
                break;
            }
        } // w e
    } // m e
} // c e
