package examples.study6;

import java.io.*;

public class BufferedInputStreamExample {
    public static void main(String[] args) throws Exception {
        long start = 0;
        long end = 0;

        File fileIN = new File("C:/study/space.jpg");
        File fileOUT1 = new File("C:/study/temp/space1.jpg");
        File fileOUT2 = new File("C:/study/temp/space2.jpg");

        FileInputStream fis1 = new FileInputStream(fileIN);
        FileOutputStream fos1 = new FileOutputStream(fileOUT1);

        start = System.currentTimeMillis();

        int readData = 0;
        byte[] buffer = new byte[100];

        while ((readData = fis1.read(buffer)) != -1) {
            fos1.write(buffer);
        }

        end = System.currentTimeMillis();
        System.out.println("사용하지 않을 때 : " + (end - start) + "ms");

        fos1.flush();

        fis1.close();
        fos1.close();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(fileIN));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(fileOUT2));
        start = System.currentTimeMillis();

        while ((readData = bis.read(buffer)) != -1) {
            bos.write(buffer);
        }

        end = System.currentTimeMillis();

        System.out.println("사용했을 때 : " + (end - start) + "ms");
        bos.flush();

        bis.close();
        bos.close();
    }
}
