package ch04.sec02;

public class IfExample {
    public static void main(String[] args) {
        int score=93;

//        if-if문은 위의 if문과 상관 없이 아래 if문도 체크한다
        if(score>=90){
            System.out.println("90점보다 높음");
            System.out.println("A등급 ㅊㅋ");
        }

//        중괄호로 묶어주지 않는 경우 한줄까지만 if문 내에 있는 문장으로 인식
        if(score<90) {
            System.out.println("90점 미만임");
        }
            System.out.println("B등급임");
    }
}
