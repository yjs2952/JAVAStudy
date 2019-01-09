package java3rd.ch14;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample {
    private static List<Student1> list = Arrays.asList(
           new Student1("홍길동", "남자", 90),
           new Student1("김순대", "여자", 90),
           new Student1("장피자", "남자", 95),
           new Student1("양장피", "여자", 92)
    );

    public static double avg(Predicate<Student1> predicate) {
        int count = 0, sum = 0;

        for (Student1 student : list) {
            if (predicate.test(student)) {
                count++;
                sum += student.getScore();
            }
        }
        return (double) sum / count;
    }

    public static void main(String[] args) {
        double maleAvg = avg(t -> t.getSex().equals("남자"));
        System.out.println("남자 평균 점수 : " + maleAvg);

        double femaleAvg = avg(t -> t.getSex().equals("여자"));
        System.out.println("여자 평균 점수 : " + femaleAvg);
    }
}
