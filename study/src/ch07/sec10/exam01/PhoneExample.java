package ch07.sec10.exam01;

public class PhoneExample {
    public static void main(String[] args) {
//        Phone phone = new Phone(); // Phone이 추상객체라서 객체생성 불가함

        SmartPhone smartPhone = new SmartPhone("홍길동");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
