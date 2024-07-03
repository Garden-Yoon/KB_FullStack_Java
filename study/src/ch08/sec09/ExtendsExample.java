package ch08.sec09;

public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceCImpl impl = new InterfaceCImpl();

        InterfaceA ia = impl;
        ia.methodA();
//        인터페이스 A에는 메소드B가 없기때문에 사용 불가
//        ia.methodB();
        System.out.println();

        InterfaceB ib = impl;

//        인터페이스 B에는 메소드A가 없기때문에 사용 불가
//        ib.methodA();
        ib.methodB();
        System.out.println();

//        인터페이스 C는 인터페이스 A와 B를 상속받았으므로 메소드 A, B, C 모두 사용 가능
        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
