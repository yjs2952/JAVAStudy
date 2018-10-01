package examples.study5;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamExample {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("C:\\STUDY\\intelliJ_workspace\\StudyJava\\src\\examples\\study5\\FileInputStreamExample.java");
            int data = 0;
            while ((data = fis.read()) != -1) {
                System.out.write(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
