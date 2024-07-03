package ch04.sec02;

public class IfElseExample {
    public static void main(String[] args) {
        int score=93;

//        if-else문은 위의 if문이 true일 경우, 아래 조건은 체크 안함
        if(score>=90){
            System.out.println("90점보다 높음");
            System.out.println("A등급 ㅊㅋ");
        }
        else {
            System.out.println("90점 미만임");
        }
            System.out.println("B등급임");
    }
}
