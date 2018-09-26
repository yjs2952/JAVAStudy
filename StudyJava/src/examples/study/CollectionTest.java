package examples.study;


import java.util.*;

public class CollectionTest {
    public static void main(String[] args){

        Collection<String> col1 = new HashSet<>();

        col1.add("kim");
        col1.add("wow");
        col1.add("meow");

        Iterator<String> itr = col1.iterator();

        while(itr.hasNext()){

            String str = itr.next();
            System.out.println(str);
        }

    }
}
