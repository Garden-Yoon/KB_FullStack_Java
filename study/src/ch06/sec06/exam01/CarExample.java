package ch06.sec06.exam01;

public class CarExample {
    public static void main(String[] args) {
        // 객체 생성
        Car myCar = new Car();

        // 객체의 필드값 읽기
        // 필드에 접근할때는 기본적으로 객체명으로 접근
        System.out.println("모델명 : " + myCar.model); //null
        System.out.println("제작회사 : " + myCar.start);    //false
        System.out.println("색깔 : " + myCar.speed);  //0


    }
}
