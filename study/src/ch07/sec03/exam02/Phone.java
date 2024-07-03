package ch07.sec03.exam02;

public class Phone {
    // 필드 선언
    public String model;
    public String color;

    // 매개변수를 갖는 생성자 선언
    public Phone(String model, String color) {
//        부모의 필드를 초기화하는 코드이기 때문에 부모 클래스에 넣어주는 것이 좋다
        this.model = model;
        this.color = color;
        System.out.println("Phone(String model, String color) 생성자 실행");
    }

}
