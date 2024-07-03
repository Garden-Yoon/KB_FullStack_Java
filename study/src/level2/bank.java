package level2;

import java.util.Scanner;

public class bank {
    public static void main(String[] args) {
        int balance = 0;
        while (true){

            System.out.println("--------------------");
            System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
            System.out.println("--------------------");

            System.out.print("선택> ");
            Scanner scanner = new Scanner(System.in);
            int choice  = scanner.nextInt();

            if(choice==1){
                System.out.print("예금액> ");
                int deposit = scanner.nextInt();
                balance +=deposit;
                System.out.println(deposit + "원이 예금됨");
            }
            else if(choice==2){
                System.out.print("출금액>");
                int withdraw = scanner.nextInt();
                balance -=withdraw;
                System.out.println(withdraw + "원이 출금됨");

            }
            else if (choice==3){
                System.out.println("잔고> "+balance);
            }

            else if (choice==4){
                System.out.println("프로그램 종료");
                break;
            }
            else {
                System.out.println("1~4의 숫자 중에서 선택해주세요");
            }
        }

    }
}
