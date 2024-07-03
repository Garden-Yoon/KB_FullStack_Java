package ch07.sec08.exam02;

public class Bus extends Vehicle {
    // 메소드 재정의 (override)
    @Override
    public void run(){
        System.out.println("버스 달림");
    }
}
