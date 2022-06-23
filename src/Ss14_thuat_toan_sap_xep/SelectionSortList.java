package Ss14_thuat_toan_sap_xep;

import java.util.ArrayList;
import java.util.Scanner;

public class SelectionSortList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        System.out.println(" nhap  so cac phan tu trong mang ");
        int number = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < number; i++) {
            System.out.println(" nhap  phan tu trong mang ");
            integerArrayList.add(Integer.parseInt(scanner.nextLine()));
        }
        selectionSort(integerArrayList);
    }

    public static void selectionSort(ArrayList<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int indexMin = i;
            for (int j = i; j < arr.size(); j++) {
                if (arr.get(j) < arr.get(indexMin)) {
                    indexMin = j;
                }
            }
            System.out.println("Min: " + arr.get(indexMin));
            if (indexMin != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(indexMin));
                arr.set(indexMin, temp);
            }
            System.out.println(" doi cho lan : " + i + " : " + arr.get(i));
        }
    }
    // cach 2
//    public static void selectionSort2(int [] arr) {
//        for (int i = 0; i < arr.length; i++) {
//            int indexMin = i;
//            for (int j = i; j < arr.length; j++) {
//                if (arr[j] < arr[indexMin]) {
//                    indexMin = j;
//                }
//            }
//            System.out.println("Min: " + arr[indexMin]);
//            if (indexMin != i) {
//                int temp = arr[i];
//                arr[i]=arr[indexMin];
//                arr[indexMin]= temp;
//            }
//            System.out.println(" doi cho lan : " + i + " : " + arr[i]);
//        }
//    }
}
