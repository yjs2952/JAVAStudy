package examples.study3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("JAVA");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("JAVA");
        set.add("iBatis");

        int size = set.size();
        System.out.println("총 객체 수 : "+size);

        Iterator<String> itr = set.iterator();

        while (itr.hasNext()) {

            String str = itr.next();
            System.out.println("\t" + str);
        }

        set.remove("JDBC");
        set.remove("iBatis");
        set.remove("qqqqq");

        System.out.println("총 객체수 : " + set.size());

        itr = set.iterator();

        while (itr.hasNext()) {

            String str = itr.next();
            System.out.println("\t" + str);
        }

        set.clear();
        if (set.isEmpty()) {
            System.out.println("비어 있음");
        }
    }
}
