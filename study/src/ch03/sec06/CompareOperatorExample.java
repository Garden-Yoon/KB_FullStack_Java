package ch03.sec06;

public class CompareOperatorExample {
    public static void main(String[] args) {
        int num1=10;
        int num2=10;
        boolean result1 = (num1==num2); // num1과 num2가 같니?
        boolean result2 = (num1!=num2); // num1과 num2가 다르니?
        boolean result3 = (num1<=num2); // num2가 num1보다 크거나 같니?
        System.out.println("result1="+result1);
        System.out.println("result2="+result2);
        System.out.println("result3="+result3);

        char char1='A';
        char char2='B';
        boolean result4 = (char1<char2);    // 아스키코드값으로 비교 : char2(66)가 char1(65)보다 크니?
        System.out.println("result4="+result4);

        int num3=1;
        double num4=1.0;
        boolean result5 = (num3==num4); // double로 변경돼서 둘 다 같다고 나옴
        System.out.println("result5="+result5);

        float num5=0.1f;
        double num6=0.1;
        boolean result6 = (num5==num6); // double과 float는 자동 형변환 비교되지 않음
        boolean result7 = (num5==(float) num6); // 강제 형 변환이 필요하다
        System.out.println("result6="+result6);
        System.out.println("result7="+result7);

        String str1 = "자바";
        String str2="JAVA";
        boolean result8 = (str1.equals(str2));  // String끼리 비교 시에는 equals 사용
        boolean result9 = (!str1.equals(str2)); // !는 나온 결과 값을 반대로 뒤집어줌
        System.out.println("result8="+result8);
        System.out.println("result9="+result9);
    }
}
