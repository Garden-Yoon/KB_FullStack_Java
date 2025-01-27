package ch18.sec04.exam02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadExample {
    public static void main(String[] args) {
        try {
            Reader reader = null;

            // 1문자씩 읽기
            reader = new FileReader("C:/Temp/test.txt");
            while (true) {
                int data = reader.read();
                if(data == -1) break;
                System.out.print((char)data);
            }
            // reader를 다 사용하고 나서는 close 시켜준다
            reader.close();
            System.out.println();

            // 문자 배열로 읽기
            reader = new FileReader("C:/Temp/test.txt");
            char[] data = new char[100];
            while (true) {
                // read()는 실제 읽은 문자의 수를 리턴
                int num = reader.read(data);
                if(num == -1) break;
                for (int i = 0; i < num; i++) {
                    System.out.print(data[i]);
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
