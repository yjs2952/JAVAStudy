package algorithmStudy.doItJAVA.ch01;

import java.util.Scanner;

public class PhysicalExamination {
    static final int VMAX = 21;

    static class PhyscData{
        String name;
        int height;
        double vision;

        public PhyscData(String name, int height, double vision) {
            this.name = name;
            this.height = height;
            this.vision = vision;
        }
    }

    static double aveHeight(PhyscData[] data) {
        double sum = 0;

        for (int i = 0; i < data.length; i++) {
            sum+=data[i].height;
        }

        return sum / data.length;
    }

    // 시력 분포
    static void distVision(PhyscData[] data, String[] dist) {
        int i = 0;

        for (i = 0; i < data.length; i++) {
            if (data[i].vision >= 0.0 && data[i].vision <= VMAX / 10.0) {
                dist[(int) (data[i].vision * 10)] += "*";
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        PhyscData[] x = {
                new PhyscData("박현규", 162, 0.3),
                new PhyscData("박현규", 172, 0.7),
                new PhyscData("박현규", 161, 2.0),
                new PhyscData("박현규", 192, 1.5),
                new PhyscData("박현규", 152, 1.3),
                new PhyscData("박현규", 158, 0.9),
                new PhyscData("박현규", 187, 0.8),
        };

        String[] vdist = new String [VMAX];

        System.out.println(" 신체검사 리스트 ");
        System.out.println("이름       키    시력");
        System.out.println("------------------------");

        for (int i = 0; i < x.length; i++) {
            System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
        }

        System.out.printf("\n 평균키 : %5.1fcm\n", aveHeight(x));

        distVision(x, vdist);

        System.out.println("\n시력 분포");

        for (int i = 0; i < VMAX; i++) {
            System.out.printf("%3.1f~ : %-s\n", i / 10.0, vdist[i]);
        }
    }
}
