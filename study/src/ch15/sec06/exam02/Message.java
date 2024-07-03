package ch15.sec06.exam02;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Message {
    public String command;
    public String to;


//@AllArgsConstructor 와 동일
//    public Message(String command, String to) {
//        this.command = command;
//        this.to = to;
//    }
}
