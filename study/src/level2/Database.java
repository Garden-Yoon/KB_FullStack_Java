package level2;

public class Database {
    // 1. private 접근 권한을 갖는 생성자를 선언한다
    private Database(){}
    private String connection = "MySQL";


    // 2. private 접근 권한을 갖는 정적 필드 선언과 초기화 (static 멤버 정의)
    private static Database database = new Database();


    // 3. public 접근 권한을 갖는 정적 메소드를 선언한다
    public static Database getInstance(){
        return database;
    }

    public String getConnection(){
        return connection;
    }

    public String connect() {
        System.out.println(connection + "에 연결합니다.");
        return connection;
    }

    public void close() {
        System.out.println(connection + "을 닫습니다.");
    }




    }
