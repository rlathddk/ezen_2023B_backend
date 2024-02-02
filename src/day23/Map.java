package day23;

import java.util.HashMap;


public class Map<K, V> {

    // 필드
    private Object[] keyArray;
    private Object[] valueArray;
    private int size;


    // 생성자


    // 메소드
        // 1. 추가 메소드
    public boolean add(K key, V value){
        try{
            // key 배열 추가
            // 1. 배열의 사이즈 증가
            this.size++;

            // 2. 배열 길이의 마지막 인덱스의 매개변수 저장
            Object[] newArray = new Object[size];

            // 2. 배열 복사 : 기존 배열이 있던 객체들을 새로운 배열에 저장
            for(int i = 0 ; i < this.keyArray.length; i++){
                newArray[i] = keyArray[i];
            }
            // 3. 기존배열필드에 새로운배열 대입
            keyArray = newArray;
            // 4. 마지막인덱스의 매개변수 대입
            keyArray[size-1] = key;

            // value 배열 추가
            this.size++;
            // 2. 배열 길이의 마지막 인덱스의 매개변수 저장

            // 1. 현재 size만큼 배열 선언
            // 2. 배열 복사 : 기존 배열이 있던 객체들을 새로운 배열에 저장
            for(int i = 0 ; i < this.valueArray.length; i++){
                newArray[i] = valueArray[i];
            }
            // 3. 기존배열필드에 새로운배열 대입
            valueArray = newArray;
            // 4. 마지막인덱스의 매개변수 대입
            valueArray[size-1] = value;
            return true;
        }catch (Exception e){
            System.out.println(e);; // 빨간색으로 뜸
            return false;
        }
    } // add e
    public int size(){return this.size;}
    // 5. toString 메소드
    @Override // 재정의
    public  String toString(){
        String str = "[";
        for (int i = 0; i < this.keyArray.length; i++){

            // 각 인덱스의 값을 srt 대입
            str += keyArray[i].toString();
            // 마지막 인덱스가 아니면 뒤에 , 추가
            str += i != this.keyArray.length-1 ?  "," : "";
        }
        return str+"]";
    }
} // c e


