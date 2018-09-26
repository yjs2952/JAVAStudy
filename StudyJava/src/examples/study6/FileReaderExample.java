package examples.study6;

import java.io.FileReader;

public class FileReaderExample {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("C:\\study\\intelliJ_projects\\StudyJava\\src\\examples\\study6\\FileReaderExample.java");

        int readCharNo = 0;
        char[] buffer = new char[100];
        String data = null;
        while ((readCharNo = fr.read(buffer)) != -1) {
            data = new String(buffer, 0, readCharNo);
            System.out.println(data);
        }
        fr.close();
    }
}
