package algorithmStudy.company.estsoft;

public class P3 {

    /*private static int solution(String[] B){

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
    }*/
}

class CheckGame {
    private char[][] board;
    private int locationOfWhiteX;
    private int locationOfWhiteY;
    private int maxBeatCount;
    private final char BLACK_PAWN = 'X';
    private final char EMPTY = '.';
    private final char WHITE_PAWN = 'O';

    public CheckGame(String[] B) {
        maxBeatCount = 0;
        setBoard(B);
    }

    private void setBoard(String[] B) {
        board = new char[B.length][B.length];
        for (int i = 0; i < B.length; i++) {
            for (int j = 0; j < B[i].toCharArray().length; j++) {
                board[i][j] = B[i].charAt(j);
                if (board[i][j] == WHITE_PAWN) {
                    locationOfWhiteY = i;
                    locationOfWhiteX = j;
                }
            }
        }
    }

    void findMaxBeatCount() {
        //현재기준 좌상
        moveUpLeft(locationOfWhiteY - 1, locationOfWhiteX - 1, 0);
        //현재기준 우상
        moveUpLeft(locationOfWhiteY - 1, locationOfWhiteX + 1, 0);
    }

    void moveUpLeft(int y, int x, int beatCount) {
        if (!isPossible(y, x, BLACK_PAWN)) {
            this.maxBeatCount = Math.max(maxBeatCount, beatCount);
            return;
        }
        if (!isPossible(y - 1, x - 1, EMPTY)) {
            this.maxBeatCount = Math.max(maxBeatCount, beatCount);
            return;
        }
        y -= 1;
        x -= 1;
        moveUpLeft(y - 1, x - 1, beatCount + 1);
        moveUpRight(y - 1, x + 1, beatCount + 1);
    }

    void moveUpRight(int y, int x, int beatCount) {
        if (!isPossible(y, x, BLACK_PAWN)) {
            this.maxBeatCount = Math.max(maxBeatCount, beatCount);
            return;
        }
        if (!isPossible(y - 1, x + 1, EMPTY)) {
            this.maxBeatCount = Math.max(maxBeatCount, beatCount);
            return;
        }
        y -= 1;
        x += 1;
        moveUpLeft(y - 1, x - 1, beatCount + 1);
        moveUpRight(y - 1, x + 1, beatCount + 1);
    }

    boolean isPossible(int y, int x, char c) {
        char field;
        try {
            field = board[y][x];
        } catch (ArrayIndexOutOfBoundsException e) {
            return false;
        }
        return field == c;
    }

    public int getMaxBeatCount() {
        return maxBeatCount;
    }
}

class Solution {
    public int solution(String[] B) {
        CheckGame checkGame = new CheckGame(B);
        checkGame.findMaxBeatCount();
        return checkGame.getMaxBeatCount();
    }
}
