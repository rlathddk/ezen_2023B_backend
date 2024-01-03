//package day02;
//
//import java.sql.SQLOutput;
//
//public class Step2 {
//    public static void main(String[] args) {
//        // p.63 연결연산자
//        int result1 = 10 + 2 +8;        // 숫자일경우에는 연산
//        System.out.println(result1+"10");   // 문자일경우에는 연결
//
//        // p.64 문자열을 기본타입으로 변환
//            // - JAVA외 애플리케이션 통신할 때 [메모장, HTTP, 네트워크]
//            // - 문자열 -> 기본타입[타입클래스명,parse~~()]
//        int value1 = Integer.parseInt("10"); // "10" -> 10
//        double value2 = Double.parseDouble("3.14");
//        boolean value3 = Boolean.parseBoolean("true");
//            // JS에서는 데이터만 비교가 가능하지만 자바는 불가능
//        String str = "10";  int value = 10;
//        boolean result = str == value ? true:false;
//
//            // - 기본타입을 문자열 변환
//            // 1. String.valueOf(기본타입값);
//        String str1 = String.valueOf(10);
//            // 2. 기본타입에 의미없는 "" 문자열 리터럴 연결
//        String str2 = 10+"";
//
//        // p.66 변수 사용 범위
//            // - 선언된 변수는 해당 중괄호{}블록 내에서만 사용 가능하고 밖에서 사용할 수 없다.
//
//        }
//
//        }
//        // p.67 콘솔로 변수값 출력
//        System.out.println();
//                // System클래스 : 시스템 관련된 클래스[다양한 메소드와 속성(필드) 제공]
//                    // out : 출력 vs in : 입력
//                    // System.out vs System.in
//                        // 1. printIn() : 콘솔 출력 후 줄바꿈
//                        // 2. print()   : 콘솔 출력
//                        // 3. printf()  : 콘솔 형식에 맞추어 출력
//        // 1.print
//
//} // m end
//    // main()밖에서 lovalValue 호출 할수 없다.
//}
