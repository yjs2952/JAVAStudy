package algorithmStudy.doItJAVA.ch06;

public class MergeSort {

    static int[] buff; // 작업용 배열

    // a[left] ~ a[right]를 재귀적으로 병합 정렬
    static void __mergeSort(int[] a, int left, int right) {
        if (left < right) {
            int i;
            int center = (left + right) / 2;
            int p = 0;
            int j = 0;
            int k = left;

            __mergeSort(a, left, right);
            __mergeSort(a, center + 1, right);

            for (i = left; i <= center; i++) {
                buff[p++] = a[i];
            }

            while (i <= right && j < p) {
                a[k++] = (buff[j] <= a[i]) ? buff[j++] : a[i++];
            }

            while (j < p) {
                a[k++] = buff[j++];
            }
        }
    }

    // 병합정렬
    static void mergeSort(int[] a, int n) {
        buff = new int[n];

        __mergeSort(a, 0, n - 1);
    }
}
