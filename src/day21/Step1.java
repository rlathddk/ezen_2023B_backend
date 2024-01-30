package day21;

public class Step1 {
    public static void main(String[] args) { // try catch의 모든 예외처리를 메인에서 진행 (요즘 프레임워크는 이런식으로 진행)
        try{
            findClass();
        }catch (ClassNotFoundException e){
            System.out.println("e = " + e);
        }
        System.out.println("args = " + args);
    } // m e
    public static void findClass() throws ClassNotFoundException {
        // *예외발생
            // 1. try{}catch(){} : 해당 코드 직접 예외처리
            // 2. throws         : 예외 떠넘기기

        // 1.
        try{Class.forName("java.lang.String");}
        catch (ClassNotFoundException e){}

        // 2. 해당 메소드 선언부 옆에
        Class.forName("java.lang.String2");
    }
}
