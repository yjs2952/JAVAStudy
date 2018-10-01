package examples.study2;

import java.util.HashMap;

public class KeyExample {
    public static void main(String[] args) {

        HashMap<Key, String> hp = new HashMap<>();
        hp.put(new Key(1), "홍킬통");

        String value = hp.get(new Key(1));
        System.out.println(value);
    }
}
