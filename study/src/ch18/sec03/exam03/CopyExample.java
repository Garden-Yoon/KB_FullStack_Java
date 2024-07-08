package ch18.sec03.exam03;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class CopyExample {
    public static void main(String[] args) {
        String originalFileName = "C://Temp/test.jpeg";
        String targetFileNAme = "C://Temp/test2.jpeg"; // 복사할 파일

        try(InputStream is = new FileInputStream(originalFileName);
            OutputStream os = new FileOutputStream(targetFileNAme);
            ){
            byte[] data = new byte[1024];

            // 최대 배열의 크기인 1024 바이트 읽기
            while(true){
                int num = is.read(data);
                if(num == -1) break;
                // num만큼 데이터 파일 쓰기
                os.write(data, 0, num);
            }
            // 내부 버퍼 잔류 바이트를 출력하고 버퍼를 비움
            os.flush();
            System.out.println("복사가 잘 되었습니다.");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
