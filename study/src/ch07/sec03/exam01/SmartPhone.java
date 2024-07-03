package ch07.sec03.exam01;

// phone 클래스의 자식 클래스
public class SmartPhone extends Phone {
    // 자식 생성자 선언
    public SmartPhone(String model, String color) {
//        super 키워드로 부모의 기본 생성자를 호출
//        해당 코드는 없어도 기본적으로 동작함
        super();
//        부모 클래스에서 model, color 필드를 상속받음
        this.model = model;
        this.color = color;
        System.out.println("와이파이 상태를 변경하였습니다.");
    }
}
