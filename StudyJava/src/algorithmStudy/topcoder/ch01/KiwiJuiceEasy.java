package algorithmStudy.topcoder.ch01;

public class KiwiJuiceEasy {

    /* case 1 */
    /*public int[] toPouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {

        int sum = 0;    // 주스를 더한 값
        int temp = 0;   // 주스를 주고 남은 양 (formId)

        for (int i = 0; i < fromId.length; i++) {

            sum = bottles[fromId[i]] + bottles[toId[i]];

            if (sum > capacities[toId[i]]) {
                temp = capacities[toId[i]] - bottles[toId[i]];
                bottles[fromId[i]] -= temp;
                bottles[toId[i]] += temp;
            }else{
                bottles[fromId[i]] = 0;
                bottles[toId[i]] = sum;
            }
        }

        return bottles;
    }*/

    /* case 2 */
    /*public int[] toPouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {

        //int sum = 0;  // 주스를 더한 값
        int temp = 0;   // 넣을 수 있는 주스 양

        for (int i = 0; i < fromId.length; i++) {

            temp = Math.min(bottles[fromId[i]], capacities[toId[i]] - bottles[toId[i]]);

            bottles[fromId[i]] -= temp;
            bottles[toId[i]] += temp;
        }

        return bottles;
    }*/

    /* case 3 */
    public int[] toPouring(int[] capacities, int[] bottles, int[] fromId, int[] toId) {

        int sum = 0;    // 주스를 더한 값
        int temp = 0;   // 주스를 주고 남은 양 (formId)

        for (int i = 0; i < fromId.length; i++) {

            sum = bottles[fromId[i]] + bottles[toId[i]];

            bottles[toId[i]] = Math.min(sum, capacities[toId[i]]);
            bottles[fromId[i]] = sum - bottles[toId[i]];
        }

        return bottles;
    }
}
