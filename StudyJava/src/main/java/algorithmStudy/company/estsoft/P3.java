package algorithmStudy.company.estsoft;

public class P3 {

    private static int solution(String[] B){

        int start = 0;
        int len = B.length;
        String[][] board = new String[len][len];


        // 시작점을 찾는다.
        for (int i = 0; i < len; i++) {
            board[i] = B[i].split("");

            if (B[i].contains("O")){
                start = i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        String[] B = {  "X....",
                        ".X...",
                        "..O..",
                        "...X.",
                        "....."};
        System.out.println(solution(B));
    }
}
