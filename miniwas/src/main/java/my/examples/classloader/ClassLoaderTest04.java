package my.examples.classloader;

import java.io.File;
import java.net.URL;
import java.util.Enumeration;

public class ClassLoaderTest04 {
    private static String baseDir = "C:\\STUDY\\IntelliJ_Projects\\JAVAStudy\\miniwas\\target\\classes";

    public static void main(String[] args) throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        Enumeration<URL> resources = classLoader.getResources("");

        while (resources.hasMoreElements()) {
            URL url = resources.nextElement();
            File root = new File(url.getPath());

            if (root.isDirectory()) {
                printDirectory(root);
            } else {
                printFile(root);
            }
        }
    }

    public static void printDirectory(File file) {
        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                printDirectory(f);
            } else {
                printFile(f);
            }
        }
    }

    public static void printFile(File file) {
        printClassname(file.getPath());
    }

    public static void printClassname(String path) {
        path = path.substring(baseDir.length());
        path = path.replace('\\', '.');

        int lastIndex = path.lastIndexOf('.');
        path = path.substring(0, lastIndex);
        System.out.println(path);
    }
}
