package algorithmStudy.company.tmon;

public class P2 {

    public static int countBits(int number) {
        int count = 0;
        while (number > 0) {
            if (number % 2 == 1)
                count++;
            number /= 2;
        }

        return count;
    }

    public static void main(String[] args) {
        System.out.println(countBits(7));
    }
}
