package day07;

// ========== 클래스 용도 : 2. 실행클래스 ==============/
public class Step2 { // cs
    public static void main(String[] args) { //ms

        // p.215
        // 1. 객체 생성
            // 1. new
        //new
            // 2. 생성자/클래스명
        //new 생성자/클래스명();
            // 3. 변수 선언
        //Car car;
            // +
        Car car = new Car();


        // .접근연산자 : 변수가 가지고 있는 주소로 이동
        System.out.println("모델명 : " + car.model);
        System.out.println("시동여부 : " + car.start);
        System.out.println("현재속도 : " + car.speed);
    } // me
} // ce
