package algorithmStudy.programmers.jobfair;

// 내가 쓴 방법
public class P1_1 {
    public static void main(String[] args) {

        System.out.println(solution(33));
    }

    public static int solution(int n) {
        int answer = 0;

        for (int i = 2; i <= n; i = nextPrime(i)) {
            for (int j = nextPrime(i); i + j <= n; j = nextPrime(j)) {
                for (int k = nextPrime(j); i + j + k <= n; k = nextPrime(k)) {
                    if (i + j + k == n) answer++;
                }
            }
        }

        return answer;
    }

    private static int nextPrime(int n) {
        n++;
        while (!isPrime(n)) {
            n++;
        }
        return n;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}