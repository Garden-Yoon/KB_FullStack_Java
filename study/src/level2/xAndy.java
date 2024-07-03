package level2;

public class xAndy {
    public static void main(String[] args) {
        //4x+5y=60의 해 (단, x와 y는 10 이하의 자연수)
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                if ((4*x)+ (5*y) == 60) {
                    System.out.println("X: " + x + ", "+ "Y: " + y);
                }
            }
        }
    }
}
