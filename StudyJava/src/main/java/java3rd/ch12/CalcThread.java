package java3rd.ch12;

public class CalcThread extends ThreadB {
    public CalcThread(String name) {
        setName(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 200000000; i++) {

        }
        System.out.println(getName());
    }
}
