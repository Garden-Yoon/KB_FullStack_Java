package ch16.sec05.exam01;

public class Person {
    // calc 함수는 매개변수가 2개고 return 값이 double인 함수
    public void action(Calcuable calcuable){
        double result = calcuable.calc(10, 4);
        System.out.println("결과 : " + result);
    }
}
