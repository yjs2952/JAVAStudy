package java3rd.ch16;

import java3rd.ch14.Student2;

import java.util.Arrays;
import java.util.List;

public class MaleStudentExample {
    public static void main(String[] args) {
        List<Student2> totalList = Arrays.asList(
                new Student2("홍길동", 10, Student2.Sex.MALE),
                new Student2("김수애", 6, Student2.Sex.FEMALE),
                new Student2("신용권", 9, Student2.Sex.MALE),
                new Student2("박수미", 8, Student2.Sex.FEMALE)
        );

        MaleStudent maleStudent = totalList.stream()
                .filter(s -> s.getSex() == Student2.Sex.MALE)
                .collect(MaleStudent::new, MaleStudent::accumulate, MaleStudent::comine);

        maleStudent.getList().stream()
                .forEach(s -> System.out.println(s.getName()));
    }
}
