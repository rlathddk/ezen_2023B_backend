package day08;

import java.util.Scanner;

public class Step4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 1. Phone객체 100개를 저장할 수 있는 phone배열 선언
            // 등록전 : null 100개
        Phone[] phoneBook = new Phone[100];
        while(true){ // w s
            for(int i = 0; i<phoneBook.length; i++){
                if(phoneBook[i] !=null){
                    System.out.printf("3%d \t %5s \t %12s \n",
                            (i+1), phoneBook[i].name, phoneBook[i].number);
                }
            }
            System.out.println("1.등록 2.삭제 선택 >");
            int ch = scanner.nextInt();
            if(ch == 1){
                // 1. 입력받기
                System.out.print("이름 : ");
                String name = scanner.next();
                System.out.print("전화번호 : ");
                String number = scanner.next();
                // 2. 객체 생성 한다. [생성자 선택]
                    // 객체 생성할 때 필드에 값을 넣을꺼야 말꺼야?
                    // 필드/메소드는 객체가 없으면 사용 불가능[클래스는 설계도]

                        // 1. 기본생성자 사용시
    //                Phone newPhone = new Phone();
    //                newPhone.name = name;
    //                newPhone.number = number;
                // 2. 정의생성자 사용시
                Phone newPhone = new Phone(name, number );
                // 3. phoneBook 배열내 빈공간을 찾아서 해당 인덱스에 객체 넣기
                for(int i = 0; i<phoneBook.length; i++){
                    if(phoneBook[i] == null){
                        phoneBook[i] = newPhone;
                        break; // !!! : 빈공간을 찾아서 대입은 1번만! 대입했으면 반복종료
                    }
                }
            }
            if(ch == 2){
                System.out.print("삭제할 순번 : ");
                int dNo = scanner.nextInt();
                phoneBook[dNo-1]=null;
                for(int i = dNo-1; i<phoneBook.length; i++){
                    // 만약에 i가 마지막 인덱스이면 +1를 할 수 없다
                    if(i+1 == phoneBook.length) break;
                    phoneBook[i] = phoneBook[i+1]; // 한칸씩 당기기
                }
            }
        }
    } // m e
} // c e
