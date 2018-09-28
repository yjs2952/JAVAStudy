package algorithmStudy.doItJAVA.ch05;

public class Q6 {
    public static void move(int n, char from, char middle, char to) {
        if (n > 1) {
            move(n-1, from, to, middle);
        }

        System.out.println("원반[" + n + "]을 " + from + " 기둥에서 " + to + " 기둥으로 옮김");

        if (n > 1) {
            move(n-1, middle, from, to);
        }
    }

    public static void main(String[] args) {
        move(4, 'A', 'B', 'C');
    }
}
