package examples.study3;

import java.util.*;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();

        set.add(new Member("홍길동", 20));
        set.add(new Member("홍길동", 20));

        System.out.println("객체수 : " + set.size());
    }
}
