package algorithmStudy.another;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cache {
    public static void result(int cacheSize, String[] cities) {
        int returnTime = 0;
        String target = null;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < cities.length; i++) {
            target = cities[i].toUpperCase();

            if (list.get(i).contains(cities[i])) {

            }


        }
    }

    public static void main(String[] args) {

    }
}
