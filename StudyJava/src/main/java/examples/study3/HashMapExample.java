package examples.study3;

import java.util.*;

public class HashMapExample {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("신용권", 85);
        map.put("홍길동", 90);
        map.put("동장군", 80);
        map.put("홍길동", 95);

        System.out.println("총 Entry 수 : " + map.size());

        System.out.println("\t홍길동 : " + map.get("홍길동"));
        System.out.println();

        Set<String> keySet = map.keySet();
        Iterator<String> keyItr = keySet.iterator();

        while (keyItr.hasNext()) {
            String str = keyItr.next();
            Integer val = map.get(str);
            System.out.println("\t" + str + " : " + val);
        }
        System.out.println();

        map.remove("홍길동");
        System.out.println("총 Entry 수 : " + map.size());

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();

        while (entryIterator.hasNext()) {

            Map.Entry<String, Integer> entry = entryIterator.next();

            String key = entry.getKey();
            int value = entry.getValue();

            System.out.println(key + " : " + value);
        }
        System.out.println();

        System.out.println("총 entry 수 : " + map.size());
    }
}
