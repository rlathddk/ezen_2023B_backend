package day08;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {
        // 선언
        Scanner scanner = new Scanner(System.in);
        Phone[] phoneBooks = new Phone[100];
        // 선택
        while (true){
            System.out.println("=========== 전화번호부 ===========");
            System.out.println("순번 \t\t 이름 \t\t 전화번호");
            for(int i = 0; i<phoneBooks.length; i++){
                if(phoneBooks[i]!=null){
                    System.out.println(i+1+"\t\t"+phoneBooks[i].name+"\t\t"+phoneBooks[i].number);
                }else{
                    break;
                }
            }
            // 1. 이름 전화번호 입력받기
            System.out.println("1.등록 2.삭제"); int ch = scanner.nextInt();
            if(ch==1) {
                scanner.nextLine();
                System.out.print("이름 : ");
                String 이름 = scanner.nextLine();
                System.out.print("전화번호 : ");
                String 번호 = scanner.nextLine();

                // 2.정의생성자 사용 (객체 생성)
                Phone newPhone = new Phone(이름, 번호);
                // 3. phoneBook배열내 빈공간을 찾아서 해당 인덱스에 객체 넣기
                for(int i =0; i<phoneBooks.length; i++){
                    if(phoneBooks[i]==null){
                        phoneBooks[i]=newPhone;
                        break;
                    } // if e
                }// for e

            } // 1 if e
            else if(ch==2){
                System.out.println("삭제할 번호 :");
                int delNum = scanner.nextInt();

                phoneBooks[delNum-1] = null; // 인덱스는 0부터 시작
                for(int i = delNum-1; i < phoneBooks.length-1; i++){

                    phoneBooks[i] = phoneBooks[i+1];
                }
            }//else if e
        }//w e
    } // m e
} // c e
