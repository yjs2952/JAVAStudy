package java3rd.ch16;

import java3rd.ch14.Student2;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ToListExample {
    public static void main(String[] args) {
        List<Student2> totalList = Arrays.asList(
                new Student2("홍길동", 10, Student2.Sex.MALE),
                new Student2("장보고", 8, Student2.Sex.MALE),
                new Student2("신사임당", 10, Student2.Sex.FEMALE),
                new Student2("니엄프", 10, Student2.Sex.FEMALE)
        );

        // 남학생들만 묶어 리스트 생성
        List<Student2> maleList = totalList.stream()
                .filter(s -> s.getSex() == Student2.Sex.MALE)
                .collect(Collectors.toList());
        maleList.stream()
                .forEach(s -> System.out.println(s.getName()));

        System.out.println();

        // 여학생들만 묶어 해시셋 생성
        Set<Student2> femaleSet = totalList.stream()
                .filter(s -> s.getSex() == Student2.Sex.FEMALE)
                .collect(Collectors.toSet());
        femaleSet.stream()
                .forEach(s -> System.out.println(s.getName()));
    }
}
