package algorithmStudy.doItJAVA.ch07;

public class IntSetTester {
    public static void main(String[] args) {
        IntSet s1 = new IntSet(20);
        IntSet s2 = new IntSet(20);
        IntSet s3 = new IntSet(20);

        s1.add(10);
        s1.add(15);
        s1.add(20);
        s1.add(25);

        s1.copyTo(s2);
        s2.add(12);
        s2.remove(25);

        s3.copyFrom(s2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(s1.contains(15) ? "포함 된다능" : "포함 안된다능");
        System.out.println(s2.contains(25) ? "포함 된다능" : "포함 안된다능");
        System.out.println(s1.equalTo(s2) ? "같다능" : "같지 않다능");
        System.out.println(s2.equalTo(s3) ? "같다능" : "같지 않다능");
        s3.unionOf(s1, s2);

        System.out.println("집합 s1과 s2의 합집합은 " + s3 + "입니다.");
    }
}
