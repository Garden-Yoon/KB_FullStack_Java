package ch16.sec04;

public class LamdaExample {
    public static void main(String[] args) {
        Person person = new Person();

        // 실행문이 두 개 이상일 경우
        person.action((x,y)-> {
            double result = x + y;
            return result;
        });

        // 리턴 문이 하나만 있을 경우 (연산식) -> 리턴 생략 가능
        person.action((x,y)->(x+y));

        // 리턴문이 하나만 있을 경우 (메소드 호출) -> 리턴 생략 가능
//        위의 람다 식을 sum이라는 함수로 정의한 것과 같다
        person.action((x,y) -> sum(x,y));
    }

    public static double sum(double x, double y) {
        return (x + y);
    }
}
