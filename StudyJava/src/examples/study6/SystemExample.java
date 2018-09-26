package examples.study6;

import java.io.IOException;
import java.io.InputStream;

public class SystemExample {
    public static void main(String[] args) throws IOException {
        InputStream is = System.in;

        byte[] datas = new byte[100];

        System.out.print("이름 : ");
        int nameBytes = is.read(datas);
        System.out.println(nameBytes);
        String name = new String(datas, 0, nameBytes-1);

        System.out.print("하고픈 말 : ");
        int commentBytes = is.read(datas);
        String comment = new String(datas, 0, commentBytes-1);

        System.out.println("입력한 이름 : " + name);
        System.out.println("입력하고 싶은 말 : " + comment);
    }
}
