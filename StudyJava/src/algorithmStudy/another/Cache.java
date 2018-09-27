package algorithmStudy.another;

import java.util.HashMap;
import java.util.Map;

public class Cache {
    public static void result(int cacheSize, String[] cities) {
        String target = null;
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < cities.length; i++) {
            target = cities[i].toUpperCase();

            if (map.get(i).equals(cities[i])) {
                
            }


        }
    }

    public static void main(String[] args) {

    }
}
