import java.util.Arrays;

public class SortColors {
    public static void main(String[] args) {
        int[] arr = { 2, 0, 2, 1, 1, 0 };
        System.out.println(Arrays.toString(sortColors1(arr)));
    }

    static int[] sortColors(int[] arr) {
        int zeros = 0, ones = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                zeros++;
            else if (arr[i] == 1)
                ones++;
        }
        for (int i = 0; i < arr.length; i++) {
            if (zeros > 0) {
                arr[i] = 0;
                zeros--;
            } else if (ones > 0) {
                arr[i] = 1;
                ones--;
            } else {
                arr[i] = 2;
            }
        }
        return arr;
    }

    static int[] sortColors1(int[] array) {
        int m = 0, l = 0;
        int h = array.length - 1;
        while (m <= h) {
            if (array[m] == 0) {
                swap(array, m, l);
                l++;
                m++;
            } else if (array[m] == 1) {
                m++;
            } else {
                swap(array, m, h);
                h--;
            }
        }
        return array;
    }

    static void swap(int[] arr, int m, int h) {
        int tem = arr[m];
        arr[m] = arr[h];
        arr[h] = tem;
    }
}
