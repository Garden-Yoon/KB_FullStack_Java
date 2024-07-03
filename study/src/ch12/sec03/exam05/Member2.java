package ch12.sec03.exam05;

//안쓰는 import는 ctrl + alt 'O'

import lombok.Data;
import lombok.NonNull;

@Data

public class Member2 {
    private String id;
    //@NoneNull : Null이면 안되는 필수항목
//    따라서 @RequiredArgsConstructor에 의해 해당 필드를 포함하는 생성자가 만들어진다
    @NonNull
    private String name;
    private int age;
}
