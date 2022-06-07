package Ss1_Introduction_to_java.baitap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd ;
        Scanner sc = new Scanner(System.in);
        System.out.println("moi ban nhap vao so tien usd");
        usd = sc.nextDouble();
        double quyDoi = usd*vnd;
        System.out.println(" gia tri VND : "+ quyDoi );
    }
}
