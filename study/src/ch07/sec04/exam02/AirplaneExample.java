package ch07.sec04.exam02;

public class AirplaneExample {
    public static void main(String[] args) {
        SupersonicAirplane sa = new SupersonicAirplane();
        // Airplane의 takeoff 메소드 실행
        sa.takeOff();
        // flyMode의 초기값이 normal이라 super.fly가 실행됨
        sa.fly();
        // static값은 클래스명으로 접근
        // flyMode를 SUPERSONIC으로 변경해줌
        sa.flyMode = SupersonicAirplane.SUPERSONIC;
        // flyMode가 SUPERSONIC으로 변경되었으므로 if문을 통해 자식의 코드 출력
        sa.fly();
        sa.flyMode = SupersonicAirplane.NORMAL;
        // 다시 Normal로 변경됐으므로 Airplane의 fly 호출
        sa.fly();
        sa.land();

    }
}
