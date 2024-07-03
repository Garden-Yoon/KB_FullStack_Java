package ch05.sec05;

public class CharAtExample {
    public static void main(String[] args) {
        String ssn = "9506241230123";
        // charAt으로 ssn에서 index[6]에 위치한 글자를 뽑아냄
        char gender = ssn.charAt(6);

        switch (gender){
            // gender가 1이나 3인 경우
            // Case'1'에 break문이 없으므로 아래 조건에 같이 포함된다
            case '1':
            case'3':
                System.out.println("남성");
                break;
//          아래와 같은 표현식으로도 쓸 수 있다
//          case '1', '3' -> {
//              실행문;
//            }

            case '2':
            case '4':
                System.out.println("여성");
                break;
        }
    }
}
