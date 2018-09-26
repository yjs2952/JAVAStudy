package examples.study6;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class InputStreamReaderExample {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;
        Reader reader = new InputStreamReader(is);

        int readCharNo = 0;
        char[] cbuffer = new char[100];
        while ((readCharNo = reader.read(cbuffer)) != 0) {
            String data = new String(cbuffer, 0, readCharNo);
            System.out.println(data);
        }

        reader.close();
    }
}
