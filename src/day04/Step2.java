package day04;

public class Step2 {
    public static void main(String[] args) {

        // p.124
        // 1. 1~10까지 출력하는 코드
        System.out.println(1+ "");
        System.out.println(2+ "");
        System.out.println(3+ "");
        System.out.println(4+ "");
        System.out.println(5+ "");
        System.out.println(6+ "");
        System.out.println(7+ "");
        System.out.println(8+ "");
        System.out.println(9+ "");
        System.out.println(10+ "");

        // - for 변환
        for(int i = 1; i<=10; i++){
            System.out.println(i+ "");
        }
        // 2. 1~100까지 합
//        int sum = 0; // for문 밖에 변수쓰는 이유 : 누적합계 구할려고, for안에서도 쓰고 밖에서 쓰고
//        int i = 1;
//        for(int i = 0; i<=100 ; i++){
//            sum += i;
//        }


//        System.out.println("1~" + (i-1) + "합 : " + sum);
        // 3. 구구단 : 중첩 for문 : for2개중(행,열)
//        for(int 단 = 2; 단 <=9; 단++){
//            System.out.println("행/단" + 단);
//                for(int 곱 =1 ; 단<=9; 곱++){
////                    System.out.print("열/곱" + 곱);
////                    System.out.println(단 + "X" + 곱 + "=" + (단+곱));
//                    System.out.printf();
//                } // for end
//        }
        // 4. for - whilte 1~10까지
        int j = 1;
        while (j<=10){
            System.out.println(j + "");
            j++;
        } // w end
        // 5 (2) for => while 1~100까지 누적합계
        int sum2 = 0;
        int m = 1;
        while (m<=100){
            sum2 += m;
            m++;
        }// w end
        System.out.println("1~"+(m-1)+"합 : " + sum2);
    } // main e
} // class e
