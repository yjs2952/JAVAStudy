package algorithmStudy.company.gua_ze;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class problem2 {

    static final int X = 10;    // 최대 x 길이
    static final int Y = 10;    // 최대 y 길이

    static int[][] pos = new int[X][Y];
    static boolean[][] isVisited = new boolean[X][Y];   // 해당 좌표 방문 여부

    static final int[] DX = {1, -1, 0, 0};  // x좌표 이동
    static final int[] DY = {0, 0, -1, 1};  // y좌표 이동

    static void bfs(int x, int y) {
        Queue<Node> que = new LinkedList<>();
        que.add(new Node(x, y));
        System.out.print("(" + x + ", " + y + ")"); // 첫번째 자리 출력

        while (!que.isEmpty()) {
            Node n = que.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = n.x + DX[i];    // x좌표 이동
                int nextY = n.y + DY[i];    // y좌표 이동

                // 최대 좌표 범위를 넘었는지 확인
                if (nextX < 0 || nextY < 0 || nextX >= X || nextY >= Y) {
                    continue;
                }

                // 방문한 좌표인지 확인
                if (isVisited[nextX][nextY]) {
                    continue;
                }

                // 다음에 방문할 좌표를 큐에 넣는다.
                que.add(new Node(nextX, nextY));

                // 입력한 좌표가 나올 시 출력
                if (pos[nextX][nextY] == 1) {
                    System.out.print(" (" + nextX + ", " + nextY + ")");
                }

                // 다음 좌표는 방문했음으로 표시
                isVisited[nextX][nextY] = true;
            }
        }
    }

    static void setPos(String input) {
        String[] strArr = input.split(" ");
        int start = Integer.parseInt(strArr[strArr.length - 1]);

        int startX = 0;
        int startY = 0;

        for (int i = 0; i < strArr.length - 1; i++) {
            strArr[i] = strArr[i].substring(1, strArr[i].length() - 1);
            String[] strNumbers = strArr[i].split(",");

            int x = Integer.parseInt(strNumbers[0]);
            int y = Integer.parseInt(strNumbers[1]);

            if (i == start - 1) {
                startX = x;
                startY = y;
                pos[startX][startY] = 2;
                continue;
            }

            pos[x][y] = 1;
        }

        isVisited[startX][startY] = true;
        bfs(startX, startY);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        setPos(input);
    }
}

class Node {
    int x;
    int y;

    Node(int x, int y) {
        this.x = x;
        this.y = y;
    }
}