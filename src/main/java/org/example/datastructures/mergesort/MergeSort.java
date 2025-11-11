package org.example.datastructures.mergesort;

public class MergeSort {
    public static void main(String args[]) {
        mergesort(new int[] {7,8,3,9,4,1,5,2,6} , 0,9);
    }

    public static int[] mergesort(int[] arr, int s, int e) {
        if (s < e) {
            int m = s + e / 2;
            mergesort(arr, s, m);
            mergesort(arr, m + 1, e);
            merge(arr, s, m, e);
        }
        return arr;
    }

    public static void merge(int[] arr, int s, int m, int e) {
        int length1 = m - s + 1;
        int length2 = e - m;

        int[] L = new int[length1];
        int[] R = new int[length2];

        for (int i = 0; i < length1; i++) {
            L[i] = arr[s + i];
        }

        for (int j = 0; j < length2; j++) {
            R[j] = arr[m + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = s;

        while (i < length1 && j < length2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        while (i < length1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        while (j < length2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }


    /**
     * 7,8,3,9,4,1,5,2,6
     * 7,8,3,9,4       1,5,2,6
     */
}
