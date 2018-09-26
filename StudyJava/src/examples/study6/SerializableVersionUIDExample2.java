package examples.study6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class SerializableVersionUIDExample2 {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = new FileInputStream("C:/study/temp/Object2.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        ClassC c = (ClassC) ois.readObject();
        System.out.println("field1 : " + c.field1);
    }
}
