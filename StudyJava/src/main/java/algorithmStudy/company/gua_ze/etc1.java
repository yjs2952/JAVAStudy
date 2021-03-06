package algorithmStudy.company.gua_ze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class etc1 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String line = br.readLine();
        String[] lines = line.split(" ");
        int strLength = lines.length;

        Point[] points = new Point[strLength - 1];

        for (int i = 0; i < strLength - 1; i++) {
            int x = lines[i].charAt(1) - '0';
            int y = lines[i].charAt(3) - '0';
            points[i] = new Point(x, y);
        }

        // points[pivot-1] 이 기준점. 점의 개수는 strLength - 1.
        int pivot = Integer.parseInt(lines[4]) - 1;


        for (int i = 0; i < strLength - 1; i++) {
            if (i == pivot) {
                continue;
            }
            double length = twoPointLength(points[i], points[pivot]);
            points[i].setLength(length);
        }

        Arrays.sort(points);

        for (Point p : points) {
            System.out.print(p.toString() + " ");
        }


    }

    public static double twoPointLength(Point p1, Point p2) {
        double length = Math.sqrt(Math.pow((p1.getX() - p2.getX()), 2) + Math.pow((p1.getY() - p2.getY()), 2));

        return length;
    }

}

class Point implements Comparable<Point> {
    int x;
    int y;

    double length;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


    public int getX() {
        return x;
    }


    public int getY() {
        return y;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public int compareTo(Point o) {
        if (this.getLength() > o.getLength()) {
            return 1;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}