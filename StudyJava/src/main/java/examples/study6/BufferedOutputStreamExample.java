package examples.study6;

import java.io.*;

public class BufferedOutputStreamExample {
    public static void main(String[] args) throws Exception {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        int data = 0;
        long start = 0;
        long end = 0;


        fis = new FileInputStream("C:/study/space.jpg");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("C:/study/temp/space1.jpg");

        start = System.currentTimeMillis();

        while ((data = bis.read()) != -1) {
            fos.write(data);
        }

        fos.flush();

        end = System.currentTimeMillis();

        fos.close();
        bis.close();
        fis.close();

        System.out.println("사용하지 않을 때 : " + (end - start) + "ms");

        fis = new FileInputStream("C:/study/space.jpg");
        bis = new BufferedInputStream(fis);
        fos = new FileOutputStream("C:/study/temp/space2.jpg");
        bos = new BufferedOutputStream(fos);

        start = System.currentTimeMillis();

        while ((data = bis.read()) != -1) {
            bos.write(data);
        }

        bos.flush();

        end = System.currentTimeMillis();

        bos.close();
        fos.close();
        bis.close();
        fis.close();

        System.out.println("사용했을 때 : " + (end - start) + "ms");


    }
}
