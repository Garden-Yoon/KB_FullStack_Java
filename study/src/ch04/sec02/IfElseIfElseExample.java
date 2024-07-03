package ch04.sec02;

public class IfElseIfElseExample {
    public static void main(String[] args) {
        int score=75;

//        조건이 여러개일 경우 else if는 무한정 추가가능하지만 if와 else는 한개씩 사용
        if(score>=90){
            System.out.println("90~100점 사이");
            System.out.println("A등급");
        } else if(score>=80){
            System.out.println("80~89점 사이");
            System.out.println("B등급");
        } else if(score>=70){
            System.out.println("70~79점 사이");
            System.out.println("C등급");
        } else {
            System.out.println("70점 미만");
            System.out.println("D등급");
        }
    }
}
