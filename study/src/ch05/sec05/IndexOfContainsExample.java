package ch05.sec05;

public class IndexOfContainsExample {
    public static void main(String[] args) {
        String subject = "자바 프로그래밍";

        // String.indexOf(word): 해당 단어가 있는 index를 리턴
        int location = subject.indexOf("프로그래밍");
        System.out.println(location);
        // 해당 index부터 끝까지 subject에서 잘라냄
        String substring = subject.substring(location);
        System.out.println(substring);

        // "자바"라는 글자가 subject애 없으면 location에 -1을 반환
        // location이 -1과 같지 않다는 것은 "자바"라는 글자가 어딘가에 포함되어있다는 뜻
        location = subject.indexOf("자바");
        if(location != -1){
            System.out.println("자바와 관련된 책이네");
        } else {
            System.out.println("자바와 관련없는 책이네");
        }

        // String.contains(word) : 해당 단어가 문자열에 포함되어있는지 여부를 boolean 값으로 반환
        boolean result = subject.contains("자바");
        if(result){ // "자바"라는 글자가 포함되어 있다면
            System.out.println("자바와 관련된 책이네");
        } else {
            System.out.println("자바와 관련없는 책이네");
        }
        
    }
}
