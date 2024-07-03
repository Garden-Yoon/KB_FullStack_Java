package level2;

public class level2_2 {
    public static void main(String[] args) {
        int x=10;
        int y=5;

        // && 연산자는 앞 뒤 조건이 모두 True여야 true 반환
        System.out.println((x>7) && (y<=5));    // true 반환
        // || 연산자는 앞 뒤 조건 둘 중 하나만 True여도 true 반환
        // x가 3의배수+2이거나, y가2의배수+1이 아니면 True반환
        System.out.println((x%3 == 2) || (y%2 !=1));    // false
    }
}
