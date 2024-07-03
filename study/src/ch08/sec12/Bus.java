package ch08.sec12;

public class Bus implements Vehicle {
    @Override
    public void run(){
        System.out.println("버스 부르릉");
    }
    
    public void checkFare(){
        System.out.println("승차요금 체크");
    }
}
