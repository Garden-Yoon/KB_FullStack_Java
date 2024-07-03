package ch11.sec03.exam01;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        String[] array = {"100", "1oo"};

//        i는 0, 1, 2 범위를 돌면서 대입된다
        for (int i = 0; i <= array.length; i++) {
            try {
//                배열의 요소를 차례대로 꺼내서 int로 변경해준다
                int value = Integer.parseInt(array[i]);
                System.out.println("array[" + i + "] = " + value);
            } catch (ArrayIndexOutOfBoundsException e){
//                배열의 요소는 0, 1까지밖에 없으므로,i가 2인 경우에 해당 예외 발생
                System.out.println("배열 인덱스가 초과됨 : " +  e.getMessage());
            } catch (NumberFormatException e){
//                i가 1인 경우, 배열의 1번째 요소는 "1oo"이므로 int로 변환 불가, 해당 예외 발생
                System.out.println("숫자로 변환 불가 : " +  e.getMessage());
            }
        }
    }
}
