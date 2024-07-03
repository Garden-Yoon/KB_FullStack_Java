package ch11.sec03.exam03;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo", null, "200"};

//        i는 0, 1, 2, 3, 4 범위를 돌면서 대입된다
        for (int i = 0; i <= array.length; i++) {
            try {
//                배열의 요소를 차례대로 꺼내서 int로 변경해준다
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "] = " + value);
            } catch (ArrayIndexOutOfBoundsException e){
                System.out.println("배열 인덱스가 초과됨 : " +  e.getMessage());
            } catch (NullPointerException | NumberFormatException e){
//                2가지 중에 어떤 예외가 들어오더라도 동일하게 처리
                System.out.println("실행에 문제 발생 : " + e.getMessage());
            }
        }
    }
}
