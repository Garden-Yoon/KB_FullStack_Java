package level2;

public class DatabaseExample {
    public static void main(String[] args) {
        // Database 생성자가 private이라 오류 발생
//        Database db = new Database();


        // 정적 메소드를 호출해서 Database 객체를 얻음
        Database db1 = Database.getInstance();
        db1.connect();
        System.out.println("데이터베이스 : " + db1.getConnection());
        db1.close();


    }
}
