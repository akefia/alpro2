package com.mycompany.dupnum;

public class DupNum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 5, 6, 7};
        sort(arr);

        int duplikat = dupNum(arr);
        if (duplikat == -1) {
            System.out.println("Tidak ada angka yang sama");
        } else {
            System.out.println("Nomor yang sama adalah " + duplikat);
        }
    }

    private static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
    private static int dupNum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                return arr[i];
            }
        }
        return -1;
    }
}
