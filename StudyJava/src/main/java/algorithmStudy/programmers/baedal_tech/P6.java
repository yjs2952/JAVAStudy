package algorithmStudy.programmers.baedal_tech;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;

public class P6 {

    public static String[] solution(int totalTicket, String[] logs) {

        String[][] arr = new String[logs.length][3];

        for (int i = 0; i < logs.length; i++) {
            arr[i] = logs[i].split(" ");
        }

        Arrays.sort(arr, Comparator.comparing(a -> a[2]));

        for (int i = 0; i < arr.length - 1; i++) {
            LocalTime lt1 = LocalTime.parse(arr[i][2]);
            LocalTime lt2 = LocalTime.parse(arr[i+1][2]);

            if (lt2.toSecondOfDay() - lt1.toSecondOfDay() >= 60) {

            }

            //int seconds1 = lt1.getMinute() * 60 + lt1.

            //if ()
            //System.out.println(lt2.toSecondOfDay() - lt1.toSecondOfDay());
        }

        //System.out.println(LocalTime.parse(arr[0][2]));

        //System.out.println(Arrays.deepToString(arr));

        return null;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2000, new String[]{
                "woni request 09:12:29",
                "brown leave 09:23:44",
                "brown request 09:23:11",
                "jason request 09:33:51",
                "jun request 09:33:56",
                "cu request 09:34:02"})));
    }

}
