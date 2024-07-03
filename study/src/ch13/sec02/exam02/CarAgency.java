package ch13.sec02.exam02;

// 인터페이스의 P가 Car로 전부 대체됨
public class CarAgency implements Rentable<Car> {
    @Override
    public Car rent(){  // 리턴타입이 반드시 Car여야함
        return new Car();
    }
}
