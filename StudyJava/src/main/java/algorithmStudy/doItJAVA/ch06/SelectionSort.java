package algorithmStudy.doItJAVA.ch06;

public class SelectionSort {
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    // 아직 정렬되지 않은 가장 첫번째 인덱스의 값과 가장 작은 값을 가진 인덱스를 찾아 그 값과 교환
    static void selectionSort(int[] a, int n) {
        for (int i = 0; i < n - 1; i++) {
            int min = i;
            for (int j = i + 1; j < n ; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            swap(a, min, i);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 7, 6, 1};
        selectionSort(arr, arr.length);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
