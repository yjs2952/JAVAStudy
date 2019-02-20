package algorithmStudy.company.zoom;

public class P2 {

    public static int[][] board;

    public static String solution(int U, int L, int[] C) {

        int sum = 0;

        for (int c : C) {
            sum += c;
        }

        board = new int[2][C.length];

        if (U + L != sum) {
            return "IMPOSSIBLE";
        }



        return "";
    }

    public static void dfs(int i, int[] C) {

        int sum1 = 0;
        int sum2 = 0;

        for (int j = 0; j < C.length; j++) {
            sum1 += board[0][j];
            sum2 += board[1][j];
        }

        //if (sum1 == )

    }

    /*public static void recursive(int index, int[] C){
        if (index == board.length) {
            return;
        }

        for (int i = index; i < board.length; i++) {
            for (int j = 0; j < 2; j++) {
                 board[i][j] = 1;

                 if ()
            }
        }
    }*/

    public static void main(String[] args) {
        System.out.println(solution(3, 2, new int[]{2,1,1,0,1}));
    }
}
