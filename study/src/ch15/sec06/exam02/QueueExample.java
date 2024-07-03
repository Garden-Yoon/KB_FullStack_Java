package ch15.sec06.exam02;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        //Queue 컬렉션 생성
//        Queue는 인터페이스기 때문에 객체 생성 불가
//        LinkedList는 Queue의 하위 요소기 때문에 Upcasting 가능
        Queue<Message> messageQueue = new LinkedList<Message>();

        //메시지 넣기
        messageQueue.offer(new Message("sendMail", "홍길동"));
        messageQueue.offer(new Message("sendSMS", "신용권"));
        messageQueue.offer(new Message("sendKakaotalk", "감자바"));

        // Queue가 비어있지 않을 때까지 메세지를 하나씩 꺼내어 처리
        while (!messageQueue.isEmpty()) {
//            poll : 큐에서 요소 하나씩 꺼내기
//            FIFO(First In First Out)이므로 가장 먼저 넣은 홍길동이 꺼내진다
            Message message = messageQueue.poll();
            switch (message.command){
                case "sendMail":
                    System.out.println(message.to + "님에게 메일을 보냅니다.");
                    break;
                case "sendSMS":
                    System.out.println(message.to + "님에게 SMS 보냅니다.");
                    break;
                case "sendKakaotalk":
                    System.out.println(message.to + "님에게 카카오톡을 보냅니다.");
                    break;
            }
        }
    }
}
