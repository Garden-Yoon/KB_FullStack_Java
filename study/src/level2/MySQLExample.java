package level2;

public class MySQLExample {
    public static void main(String[] args) {
        MySQL mysql = new MySQL();
        mysql.Connect();
        System.out.println("데이터베이스 : " + mysql.db);
        mysql.Disconnect();
    }
}
