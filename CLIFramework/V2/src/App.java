import java.util.Scanner;

public class App {
    boolean run = true ;
    // 여러 메소드에서 사용할 변수는 위로 정리
    int studentNum = 0;
    // scores는 정수 배열
    int[] scores = null;

    Scanner scanner = new Scanner(System.in);

    Menu menu;

    // 생성자에서 Menu로 객체 생성해서 초기화
    public App() {
        menu = new Menu();
    }

    // 3. 점수 분석 메소드 (4번 메뉴)
    public void analize(){
        int max = 0;
        int sum = 0;
        double avg = 0;
        for(int i = 0; i < scores.length; i++){
            // max와 scores[i] 둘 중 큰 수를 max에 할당
            max = (max<scores[i]) ? scores[i] : max;
            // sum에 scores[i]를 더해서 다시 넣어준다
            sum += scores[i];
        }
        // 전체 합계를 학생 수로 나눠서 평균 값을 구해준다
        avg = (double) sum / studentNum;
        System.out.println("최고 점수 : " + max);
        System.out.println("평균 점수 : " + avg);

    }

    // 4. 학생 수 입력받는 메소드 (1번 메뉴)
    public void getStudentNum() {
        System.out.print("학생수 > ");
        studentNum = Integer.parseInt(scanner.nextLine());
        // 입력받은 학생 수만큼 배열의 크기를 정해줌
        scores = new int[studentNum];
    }

    // 5. 점수 입력받는 메소드 (2번 메뉴)
    public void getScores(){
        for(int i = 0; i < scores.length; i++) {
            // 비어있는 배열 요소에 사용자한테 입력받은 점수 할당
            System.out.print("scroes[" + i + "] > ");
            scores[i] = Integer.parseInt(scanner.nextLine());
        }
    }

    // 6. 점수 출력 메소드 (3번 메뉴)
    public void printScore() {
        for (int i = 0; i < scores.length; i++) {
            // scores 배열을 돌면서 아이템들을 하나씩 출력
            System.out.println("scores[" + i + "] = " + scores[i]);
        }
    }

    // 7. 종료 메소드 (5번 메뉴)
    public void exit(){
        // while문을 false로 만들어주면서 무한루프가 종료된다
        run = false;
    }

    // 8. 실행 메소드 : 만들어둔 메소드들을 사용자의 입력값에 따라 if문으로 호출
    public void executeCommand(int selectNo){
        if(selectNo == 1){
            getStudentNum();
        } else if(selectNo == 2){
            getScores();
        } else if(selectNo == 3){
            printScore();
        } else if(selectNo == 4){
            analize();
        } else if(selectNo == 5){
            exit();
        }
    }

    public void run() {
        while(true){ // 흐름 제어
            menu.printMenu();
            // getSelect는 int를 반환하는 메소드이기때문에 바로 받아와서 처리
            int selectNo = menu.getSelect();
            executeCommand(selectNo);
        }
//        System.out.println("프로그램 종료");
    }


    public static void main(String[] args) {
        App app = new App();
        app.run();
    }
}
