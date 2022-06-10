package Test;

import Ss3_Mang_va_phuong_thuc_trong_java.baitap.QuadraticEquation;
import Ss4_Lop_va_doi_tuong_trong_Java.baitap.StopWatch;

import java.util.Date;

public class test1 {
    public static void main(String[] args) {
        Date newtime = new Date();
        Date stoptime = new Date();
        StopWatch stopWatch = new StopWatch(newtime,stoptime);
        System.out.println(" thoi gian đã qua là :" + stopWatch.getElapsedTime());
    }
}
