package ch15.sec02.exam01;

import lombok.*;

// 필드 전부를 가지고있는 생성자를 만든다
@AllArgsConstructor
// 기본생성자를 만듬
//@NoArgsConstructor
//@Getter
//@Setter
//@Data는 getter, setter, toString, 기본생성자, hashcode, equals 가 포함되어있다.
@Data
public class Board {
    private String subject;
    private String content;
    private String writer;


}
