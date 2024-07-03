package level2;

public class Child extends Parent {
    public int studentNo;
    public Child(String name, int studentNo) {
        super(name); // 생략 시 오류
        this.name = name;
        this.studentNo = studentNo;
    }
}
