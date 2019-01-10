package java3rd.ch16;

import java.util.Arrays;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        List<Student> studentList = Arrays.asList(
                new Student("수퍼맨", 10),
                new Student("배트맨", 20),
                new Student("아이언맨", 30)
        );

        studentList.stream()
                .mapToInt(Student::getScore)
                .forEach(score -> System.out.println(score));
    }
}
