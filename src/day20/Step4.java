package day20;

public class Step4 {

    // 1. 매개변수 문자의 길이를 문자수를 알려주는 함수
    public static void printLength(String data){

        // ---------------- 예외가 발생할 것 같은 코드 ------------------- //
        try {


        int result = data.length();                  // .(도트) : 참조객체로 인스턴스멤버 호출
        System.out.println("문자수 : " + result);
    }
        // ------------------- 만약에 try{} 코드 안에서 예외가 발생하면 catch 실행 ----------------//
        catch (NullPointerException e){
            System.out.println(e.getMessage());
            System.out.println(e.toString());
            e.printStackTrace();
        }
        // ----------------- ========================== -------------------- //
        finally {
            System.out.println("[마무리 실행]");
        }
    } // m e
    public static void main(String[] args) {
        // 1. [실행예외 - 컴파일시 예외 검사 안함] NullpointerException
        printLength("ThisIsJAVA");
        printLength("null"); // null 이면 참조가 없으므로(도트)불가능


         // 2. [일반예외 - 컴파일시 예외 검사 진행] ClassNotFoundException
        try{
            Class.forName("java.lang.String");
            Class.forName("java.lang.String2");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("프로그램 종료");

        // 3.
        String[] array = {"100","1oo"};
        for(int i = 0 ; i <= array.length; i++){
            try {
                int value = Integer.parseInt(array[i]); // "1oo"는 정수타입으로 변환 불가능
            }catch (NumberFormatException | NullPointerException e){
                System.out.println(i + "숫자로 변환할 수 없습니다." + e.getMessage());
            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(i + "배열 인덱스가 초과됨" + e.getMessage());
            } // c end
                System.out.println("상위 예외클래스");
        } // f end
    } // m end
}// c end
