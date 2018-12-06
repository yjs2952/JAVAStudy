package algorithmStudy.jongmanbook;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

// 8393
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        int min = 1000000;
        int max = -1000000;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            min = Math.min(min, arr[i]);
        }

        for (int i = 0; i < n; i++) {
            max = Math.max(max, arr[i]);
        }

        System.out.println(min + " " + max);
    }
}

// 1924
/*public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] day = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayOfWeek = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int x = sc.nextInt();
        int y = sc.nextInt();

        int sumOfDays = 0;
        for (int i = 0; i < x - 1; i++) {
            sumOfDays += day[i];
        }
        sumOfDays += y;

        int index = sumOfDays % 7;
        System.out.println(dayOfWeek[index]);
    }
}*/

// 2742
/*public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i > 0; i--) {
            System.out.println(i);
        }
    }
}*/

//2741
/*public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}*/

// 11721
/*public class Main{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        int count = (int) Math.ceil(str.length() / 10.0);

        String tempStr = null;
        for (int i = 0; i < count + 1; i++) {
            if (i == count -1) {
                tempStr = str.substring(10 * i);
                System.out.println(tempStr);
                break;
            }
            tempStr = str.substring(10 * i, 10 * i + 10);

            System.out.println(tempStr);
        }
    }
}*/

// 11720
/*public class Main{
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();
        String num = sc.nextLine();

        String[] split = num.split("");

        int sum = 0;
        for (int i = 0; i < split.length; i++) {
            int eachNum = Integer.parseInt(split[i]);
            sum += eachNum;
        }

        System.out.println(sum);
    }
}*/

// 11718
/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String str = sc.nextLine();

            System.out.println(str);
        }
    }
}*/

//11022
/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Case #" + (i + 1) + ": " + a + " + " + b + " = " + (a + b));
        }
    }
}*/

//11021
/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Case #"+ (i + 1) +": " + (a + b));
        }
    }
}*/

// 10953
/*public class Main {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String str = sc.nextLine();
            String[] split = str.split(",");

            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);

            System.out.println(a + b);
        }
    }
}*/

