package ch16.sec02.exam02;

public class Button {
    // 정적 중첩 함수형 인터페이스
    @FunctionalInterface
    public static interface ClickLister{
        // 추상 메소드
        void onClick();
    }

    // 필드
    private ClickLister clickLister;

    // 메소드
    public void setClickLister(ClickLister clickLister) {
        this.clickLister = clickLister;
    }

    public void click(){
        this.clickLister.onClick();
    }
}
