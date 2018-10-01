package examples.study3;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("JAVA");
        list.add("JDBC");
        list.add(1, "bbbbb");
        list.add("servlet");
        list.add("aaaaa");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
