package algorithmStudy.baekjoon.inputoutput;

import java.util.Scanner;

// 10992
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            System.out.print("*");

            if (i != n - 1) {
                for (int j = 0; j < 2 * i - 1; j++) {
                    System.out.print(" ");
                }
                if (i != 0) {
                    System.out.print("*");
                }
            } else {
                for (int j = 1; j < 2 * n - 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

// 10991
/*public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = n - i; j < n; j++) {
                System.out.print("*");
                if (j < n - 1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}*/

// 2446
/*
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0, j = 0, k = 0;

        for (i = 1; i < 2 * n; i++) {
            for (j = n - 1; j > Math.abs(n - i); j--) System.out.print(" ");
            for (k = 1; k < 2 * j + 2 ; k++) System.out.print("*");
            System.out.println();
        }
    }
}
*/

// 2522
/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = 0, j = 0, k = 0;

        for (i = 1; i < 2 * n; i++) {
            for (j = 0; j < Math.abs(n - i); j++) System.out.print(" ");
            for (k = 0; k < n - j; k++) System.out.print("*");
            System.out.println();
        }
    }
}*/

// 2445
/*public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int flag = 1;

        for (int i = 1; i <= 2 * n - 1; i++) {
            if (i < n) {
                for (int j = n; j > n - i; j--) {
                    System.out.print("*");
                }

                for (int j = 0; j < 2 * (n - i); j++) {
                    System.out.print(" ");
                }

                for (int j = n; j > n - i; j--) {
                    System.out.print("*");
                }
                //if (i == (2 * n - 1) / 2) continue;
                System.out.println();
            } else {
                for (int j = i - n; j < n; j++) {
                    System.out.print("*");
                }

                for (int j = 0; j < 2 * (i - n); j++) {
                    System.out.print(" ");
                }

                for (int j = i - n; j < n; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}*/

// 2442
/*public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/

//2441
/*public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            *//*if (i == 0) break;*//*
            System.out.println();
        }
    }
}*/

//2440
/*public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }

            if (i == n) break;
            System.out.println();
        }
    }
}*/

//2439
/*public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            if (i == n) break;
            System.out.println();
        }
    }
}*/

// 8393
/*public class Main{
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
}*/

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

