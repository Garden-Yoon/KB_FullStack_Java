package ch11.sec03.exam02;

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
            } catch (Exception e){
//                Exception은 모든 예외의 부모 클래스로, 위에서 해당하지않은 예외들이 들어올 경우 처리해줌
//                그 외의 모든 예외 처리 (Exception이 예외의 부모)
//                if 문에서의 else와 같은 역할
                System.out.println("실행에 문제 발생");
            }
        }
    }
}
