package algorithmStudy.topcoder.ch05;

public class CrazyBoy {
    static boolean[][] grid = new boolean[100][100];
    static int[] vx = {1, -1, 0, 0};
    static int[] vy = {0, 0, -1, 1};

    static double[] prob = new double[4];

    static double getProbability(int n, int east, int west, int south, int north) {
        prob[0] = east / 100.0;
        prob[1] = west / 100.0;
        prob[2] = south / 100.0;
        prob[3] = north / 100.0;

        return dfs(n, 50, 50);
    }

    static double dfs(int n, int x, int y) {
        if (grid[x][y]) return 0;
        if (n == 0) return 1;

        grid[x][y] = true;
        double ret = 0;

        for (int i = 0; i < 4; i++) {
            ret += dfs(n - 1, x + vx[i], y + vy[i]) * prob[i];
        }

        grid[x][y] = false;

        return ret;
    }

    public static void main(String[] args) {
        System.out.println(getProbability(1, 25, 25, 25, 25));
        System.out.println(getProbability(2, 25, 25, 25, 25));
        System.out.println(getProbability(7, 50, 0, 0, 50));
        System.out.println(getProbability(14, 50, 50, 0, 0));
        System.out.println(getProbability(14, 25, 25, 25, 25));
    }
}
