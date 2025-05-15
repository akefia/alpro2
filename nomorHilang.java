/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.studycase;

/**
 *
 * @author localheart
 */
public class Studycase {

public static void main(String[] args) {

        int [] arr = {1,2,3,4,6,7,8};
        int hilang =nomorHilang(arr);
        if (hilang == -1){
        System.out.println("Tidak ada angka yang hilang");
    }else{
        System.out.println("Nomor yang hilang adalah" + hilang);
        }
        System.out.println(nomorHilang(arr));
    }

    public static int nomorHilang(int[] arr) {
        int n = arr.length;
        int [] b = new int[arr[n-1] + 1];
        for (int i = 0; i < n; i++) {
            b[arr[i]] = 1;
        }
        for (int i = arr[0]; i <= arr[n-1]; i++) {
            if (b[i] == 0) {
                return i;
            }
        }
        return -1;
    }
}

