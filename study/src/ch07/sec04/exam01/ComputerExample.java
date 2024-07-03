package ch07.sec04.exam01;

public class ComputerExample {
    public static void main(String[] args) {
        int r=10;

        Calculator calc = new Calculator();
        // Calculator 크랠스의 areaCircle 호출
        System.out.println("원 면적 : " + calc.areaCircle(r)); // 부모꺼 호출됨
        System.out.println();

        Computer computer = new Computer();
        // Computer 클래스의 areaCircle 호출
        System.out.println("원 면적 : " + computer.areaCircle(r)); // 자식꺼 호출됨
    }
}
