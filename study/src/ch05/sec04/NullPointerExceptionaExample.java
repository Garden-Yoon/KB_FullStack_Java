package ch05.sec04;

public class NullPointerExceptionaExample {
    public static void main(String[] args) {
        int[] intArray = null;
        // null을 참조하는 배열의 0번째 값을 할당했기 때문에 NullPointerException 발생
//        intArray[0] = 10;

        String str = null;
        // null로 초기화된 문자열의 길이를 출력했기 때문에 NullPointerException 발생
        System.out.println("총 문자수 : " + str.length());
    }
}
