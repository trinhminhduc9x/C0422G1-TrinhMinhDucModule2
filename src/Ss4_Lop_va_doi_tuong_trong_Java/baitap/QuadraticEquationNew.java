package Ss4_Lop_va_doi_tuong_trong_Java.baitap;

import Ss3_Mang_va_phuong_thuc_trong_java.baitap.QuadraticEquation;

import java.util.Scanner;

public class QuadraticEquationNew {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation = new QuadraticEquation();
        Scanner scanner = new Scanner(System.in);
        System.out.println(" nhap phan tu a la : ");
        double a = scanner.nextDouble();
        System.out.println(" nhap phan tu b la : ");
        double b = scanner.nextDouble();
        System.out.println(" nhap phan tu c la : ");
        double c = scanner.nextDouble();
        quadraticEquation.setA(a);
        quadraticEquation.setB(b);
        quadraticEquation.setC(c);
        System.out.println(" ket qua la: " + quadraticEquation.getDiscriminant());
        if (quadraticEquation.getDiscriminant() >= 0) {
            System.out.println("ket nghiem 1 qua la: " + quadraticEquation.getRoot1() + "\n ket qua nghiem 2 la : " + quadraticEquation.getRoot2());
        } else if (quadraticEquation.getDiscriminant() == 0) {
            System.out.println("ket nghiem 1 qua la: " + quadraticEquation.getRoot1() + "\n ket qua nghiem 2 la : " + quadraticEquation.getRoot2());
        } else {
            System.out.println(" phuong trinh vo nghiem");
        }
    }
}
