package Ss15_su_ly_va_debug.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IllegalTriangleException {
    private static void calculate() {

        Triangle triangle = new Triangle();
        boolean flag;
        do {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Hãy nhập a: ");
            int a = scanner.nextInt();
            System.out.println("Hãy nhập b: ");
            int b = scanner.nextInt();
            System.out.println("Hãy nhập c: ");
            int c = scanner.nextInt();
            triangle.check(a,b,c);
            System.out.println("a b c la canh cua tam giac"+a+b+c);
            flag=true;
            }
         catch (InputMismatchException e) {
            System.err.println("nhap so vao thang ngu");
            flag= false;
        } catch (IllegalTriangleExceptionTest e) {
            e.printStackTrace();
            flag =false;
        }
        }
        while (!flag);
        }
    public static void main(String[] args) {
        calculate();
    }
}
