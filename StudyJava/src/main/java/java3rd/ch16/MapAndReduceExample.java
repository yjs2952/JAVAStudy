package java3rd.ch16;

import java.util.Arrays;
import java.util.List;

public class MapAndReduceExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("홍길동", 80),
                new Student("배트맨", 90),
                new Student("수퍼맨", 70)
        );

        double avg = studentList.stream()
                // 중간처리
                .mapToInt(Student::getScore)
                // 최종처리
                .average()
                .getAsDouble();

        System.out.println("평균 점수 : " + avg);
    }
}
