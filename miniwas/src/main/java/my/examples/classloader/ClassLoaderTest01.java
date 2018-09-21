package my.examples.classloader;

import java.lang.reflect.Method;

public class ClassLoaderTest01 {
    public static void main(String[] args) throws Exception {
        Sample s1 = new Sample();
        s1.print();
        s1.print("world");

        // Class 라는 타입은 클래스 정보를 가지는 객체
        // JVM은 클래스를 어디서 찾을까? classpath에서 찾는다.
        // JVM은 클래스 로더를 이용하여 클래스를 읽어온다.
        Class clazz = Class.forName("my.examples.classloader.Sample");

        // Method는 메소드 정보를 가지는 클래스이다.
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
    }
}
