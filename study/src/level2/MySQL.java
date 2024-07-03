package level2;

public class MySQL {
    String db="MySQL";

    void Connect(){
        System.out.println("MySQL에 연결합니다");
    }

    void Disconnect(){
        System.out.println("MySQL을 닫습니다");
    }

}


//    // 호출 시 두 정수 값을 전달받고
//    //호출한 곳으로 결과값 int를 리턴하는 메소드 선언
//    int plus(int x, int y){
//        int result = x+y;
//        return result;  //리턴값 지정
//    }
//
//    // 호출 시 두 정수 값을 전달받고
//    // 호출한 곳으로 결과값 double을 리턴하는 메소드 선언
//    double divide(int x, int y){
//        double result = (double) x / (double) y;
//        return result;
//    }
//}
