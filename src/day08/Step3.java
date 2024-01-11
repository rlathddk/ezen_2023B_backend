package day08;

public class Step3 {
    public static void main(String[] args) {


        // 0. 기본생성자로 객채생성
        // 1. 기본생성자로 객체 생성 x -> 정의한 생성자가 있음

        // 1. 정의된생성자로 객체 생성
        Korean k3 = new Korean();
        k3.name = "이자바"; // 기본생성자에 추가
        k3.ssn = "800423-1234567"; // 기본생성자에 추가
        System.out.println(k3);

        // 2. 정의한생성자
        Korean k1 = new Korean("박자바","011224-1234567");
        System.out.println(k1);

        Korean k2 = new Korean("김자바", "930525-0654321");
        System.out.println(k2);
    } // m e
} // c e
