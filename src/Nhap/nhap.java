package Nhap;

import java.util.Arrays;

public class nhap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int index = Arrays.binarySearch(arr,5);
        System.out.println("ket qua " + index);
    }
}
