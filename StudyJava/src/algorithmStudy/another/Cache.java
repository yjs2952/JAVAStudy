package algorithmStudy.another;

import java.util.*;

public class Cache {
    public static void result(int cacheSize, String[] cities) {
        int runTime = 0;
        String target = null;
        Queue<String> queue = new ArrayDeque<>();
        for (int i = 0; i < cities.length; i++) {
            target = cities[i].toUpperCase();

            if (queue.size() != 0 && queue.contains(target)) {
                runTime++;
            } else {
                runTime += 5;
                if (cacheSize != 0) {

                    if (queue.size() >= cacheSize) {
                        queue.remove();
                        queue.add(target);
                    } else {
                        queue.add(target);
                    }
                }
            }
        }
        System.out.println(runTime);
    }

    public static void main(String[] args) {
        result(3, new String[]{"Jeju", "Seoul", "Seoul", "NewYork", "LA", "Jeju", "Pangyo", "Seoul", "NewYork", "LA"});
        result(3, new String[]{"Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul", "Jeju", "Pangyo", "Seoul"});
        result(2, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"});
        result(5, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA", "SanFrancisco", "Seoul", "Rome", "Paris", "Jeju", "NewYork", "Rome"});
        result(2, new String[]{"Jeju", "Pangyo", "NewYork", "newyork"});
        result(0, new String[]{"Jeju", "Pangyo", "Seoul", "NewYork", "LA"});

    }
}
