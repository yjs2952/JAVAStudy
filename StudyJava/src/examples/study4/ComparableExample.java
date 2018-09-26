package examples.study4;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExample {
    public static void main(String[] args) {
        TreeSet<Person> treeSet = new TreeSet<>();

        treeSet.add(new Person("홍길동", 45));
        treeSet.add(new Person("감자바", 25));
        treeSet.add(new Person("박지원", 31));

        Iterator<Person> itr = treeSet.iterator();
        while (itr.hasNext()) {
            Person p = itr.next();
            System.out.println(p.name + " : " + p.age );
        }
    }
}
