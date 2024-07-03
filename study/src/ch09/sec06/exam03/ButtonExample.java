package ch09.sec06.exam03;

public class ButtonExample {
    public static void main(String[] args) {
        // OK 버튼 객체 생성
        Button btnOk = new Button();

        // OK 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스 (로컬 클래스)
        // main()이라는 메소드 안에 있어서 로컬 클래스
        class OkListener implements Button.ClickListener {
            // Ctrl + O
            // ClickListner의 onClick 메소드를 오버라이딩
            @Override
            public void onClick(){
                System.out.println("OK 버튼을 클릭했습니다");
            }
        }

        // OK 버튼 객체에 ClickListener 구현 객체 주입
        // OkListener는 ClickListner를 상속받았기 때문에 ClickListner 타입으로 주입 가능(upcasting)
        btnOk.setClickListener(new OkListener());

        // Ok 버튼 클릭하기
        // 오버라이딩한 메소드를 호출하므로 OkListner의 onClick 호출
        btnOk.click();


        // Cancel 버튼 객체 생성
        Button btnCancel = new Button();

        // Cancel 버튼 클릭 이벤트를 처리할 ClickListener 구현 클래스 (로컬 클래스)
        class CancelListener implements Button.ClickListener {
            @Override
            public void onClick(){
                System.out.println("Cancel 버튼을 클릭했습니다.");
            }
        }

        // Cancel 버튼 객체에 ClickListner 구현 객체 주입
        btnCancel.setClickListener(new CancelListener());

        // Cancel 버튼 클릭하기
        btnCancel.click();
    }
}
