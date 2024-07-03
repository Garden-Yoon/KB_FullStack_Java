package ch02.sec09;

public class StringConcatExample {
    public static void main(String[] args) {
        // 숫자 연산
        int result1= 10+2+8;
        System.out.println("result1 = " + result1); // 숫자들의 합인 20이 출력됨

        // 결합 연산
        String result2= 10+2+"8";
        System.out.println("result2 = " + result2); // 10+2 먼저 연산하여 12 -> 문자열 8과 합쳐져서 128 출력

        String result3= 10+"2"+8;
        System.out.println("result3 = " + result3); // 10과 문자열2 결합 (문자열 102) -> 숫자 8 결합되어 1028 출력

        String result4= "10"+2+8;
        System.out.println("result4 = " + result4); // 문자열10과 2가 결합 (문자열 102) -> 숫자 8 결합되어 1028 출력

        String result5= "10"+(2+8);
        System.out.println("result5 = " + result5); // 괄호 안의 2+8=10이 먼저 연산됨, 그 후 앞에 문자열 10 결합 -> 1010 출력
    }
}
