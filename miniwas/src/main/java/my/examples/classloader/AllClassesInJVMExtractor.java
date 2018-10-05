package my.examples.classloader;

import com.google.common.reflect.ClassPath;

import java.io.*;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.Set;

import static java.lang.Thread.*;

class AllClassesInJVMExtractor {
    public void findClasses() throws IOException {
        ClassLoader cl = getClass().getClassLoader();

        Set<ClassPath.ClassInfo> classesInPackage = ClassPath.from(cl).getTopLevelClassesRecursive("my");

        for (ClassPath.ClassInfo classInfo : classesInPackage) {
            System.out.println(classInfo.getName());
        }
    }

    public static void main(String[] args) {
        AllClassesInJVMExtractor a = new AllClassesInJVMExtractor();
        try {
            a.findClasses();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class test{

}

