package ch08.sec12;

public class InstanceofExample {
    public static void main(String[] args) {
        // 구현 객체 생성
        Taxi taxi = new Taxi();
        Bus bus = new Bus();

        // ride() 메소드 호출 시 구현 객체를 매개값으로 전달
        ride(taxi);
        System.out.println();
        ride(bus);
    }

        //인터페이스 매개변수를 갖는 메소드
        public static void ride(Vehicle vehicle){
        // 방법 1
//            if(vehicle instanceof Bus){
//                Bus bus = (Bus) vehicle;
//                bus.checkFare();
//            }
        // 방법 2 ( 위의 코드와 같은 동작)
            // instance of : 해당 객체의 타입을 체크해준다. 형 변환 시 에러 발생 방지
            if (vehicle instanceof Bus bus){
                bus.checkFare();
            }
            vehicle.run();
        }
}
