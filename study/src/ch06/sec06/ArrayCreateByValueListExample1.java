package ch06.sec06;

public class ArrayCreateByValueListExample1 {
    public static void main(String[] args) {
        // 배열 변수 선언과 배열 생성
        String[] season = {"Spring", "Summer", "Autumn", "Winter"};

        // 배열의 항목 값 읽기
        System.out.println("season[0] : " + season[0] );
        System.out.println("season[1] : " + season[1] );
        System.out.println("season[2] : " + season[2] );
        System.out.println("season[3] : " + season[3] );

        // 인덱스 1번 항목의 값 변경
        season[1] = "여름";
        System.out.println("season[1] : " + season[1] );
        System.out.println();

        // 배열 변수 선언과 배열 생성
        int[] scores = {83, 90, 87};

        // 총합과 평균 구하기
        int sum = 0;
        // 배열의 길이가 변할 수 있으므로, 3대신 scores.length가 더 좋은 코드이다
        for (int i = 0; i < scores.length; i++) {
            sum +=scores[i];
        }

        System.out.println("총합 : " + sum);
        // 배열의 길이가 변할 수 있으므로, 3대신 scores.length가 더 좋은 코드이다
        double avg = (double) sum / scores.length;
        System.out.println("평균 : " + avg);
    }
}
