package ch17.sec10;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class OptionalExample {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

//         예외 발생 (java.util.NoSuchElementException)
//        double avt = list.stream()
//                .mapToInt(Integer::intValue)
//                .average()
//                .getAsDouble();

        // 방법 1
        OptionalDouble optional = list.stream()
                .mapToInt(Integer::intValue)
                .average();

        // 방법 2

        // 방법 3
    }
}
