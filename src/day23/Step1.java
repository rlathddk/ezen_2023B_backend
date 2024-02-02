package day23;

import java.util.ArrayList;
import java.util.Arrays;

public class Step1 {
    public static void main(String[] args) {
        // 1. 배열타입
            // 객체안에 객체저장 / 객체{객체, 객체, 객체}
        String[] strArray = new String[3]; // String타입 데이터 3개를 저장하는 배열타입
        strArray[0] = "유재석";
        // strArray[1] = 100; // 오류남. 타입이 다르니깐
        strArray[1] = "강호동";
        strArray[2] = "신동엽";
        //strArray[3] = "신동엽"; // ArrayIndexOutOfBoundsException 오류남 인덱스 초과

        System.out.println("리스트 상태 : " + strArray); // 주소값이 나옴 / object클래스 toString()메소드 객체의 주소값 반환
        System.out.println("리스트 요소 호출 : " + Arrays.toString(strArray)); // Arrays.toString(배열타입변수) : 해당 배열 상태 호출
        System.out.println("리스트 길이 : "+ strArray.length); // Arrays.toString(배열타입변수) : 해당 배열 상태 호출
        // 배열이 고정 길이이기 때문에 삭제 불가능



        System.out.println("==================================================");

        // 2. 클래스타입 : 컬렉션프레임워크(수집관련라이브러리 제공)
            // 객체안에 객체저장 / 객체{객체, 객체, 객체}
            // 1. ArrayList : 가변길이 가능하도록 만든 객체
        ArrayList<String> strList = new ArrayList<>();
            // 클래스명<제네릭타입> 변수명 = new 클레스명<>();
        strList.add("유재석");
        // strList.add(100);
        strList.add("강호동");
        strList.add("신동엽");
        strList.add("서장훈");
        System.out.println("리스트 상태 : " + strList); // 주소값x 배열값 출력
        System.out.println("리스트 요소 호출 : " + strList.get(1));
        System.out.println("리스트 길이 : " + strList.size());
        strList.remove(1); // 1번 인덱스 삭제
        System.out.println("1번 인덱스 삭제 후 리스트 상태 " + strList);


        System.out.println("==================================================");

        // 3. 가변길이배열객체 만들기
        // SimpleList {객체, 객체, 객체}
        SimpleList<String> simpleList = new SimpleList<>();
        simpleList.add("유재석");
        simpleList.add("강호동");
        simpleList.add("신동엽");
        simpleList.add("서장훈");
        System.out.println("리스트 상태 : " + simpleList);
        System.out.println("리스트 요소 호출 : " + simpleList.get(1));
        System.out.println("리스트 길이 : " + simpleList.size());
        //simpleList.add(100);
        simpleList.remove(1);
        System.out.println("1번 인덱스 삭제 후 리스트 상태 " + simpleList);



        // JS
            // JS 배열 : [값1, 값2, 값3] => List
            // JS 객체 : {필드 : 값, 필드 : 값, 필드 : 값} => Map



    } // m e
 } // c e
