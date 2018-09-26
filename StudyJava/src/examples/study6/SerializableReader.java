package examples.study6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class SerializableReader {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:/study/temp/Object.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        ClassA v = (ClassA) ois.readObject();

        System.out.println("field1 : " + v.field1);
        System.out.println("field2.field1 : " + v.field2.field1);
        System.out.println("field3 : " + v.field3);
        System.out.println("field4 : " + v.field4);
    }
}
