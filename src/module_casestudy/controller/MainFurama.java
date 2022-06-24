package module_casestudy.controller;

import java.util.Scanner;

public class MainFurama {
    public static void displayMainMenu() {
        boolean flag = true;
        do {
            System.out.println("Chức năng của hệ thống " +
                    "\n 1.Add" +
                    "\n 2.Edit" +
                    "\n 3.Delete" +
                    "\n 4.Display" +
                    "\n 5.SearchName" +
                    "\n 6.SortCost" +
                    "\n 7. Exit");
            Scanner scanner = new Scanner(System.in);
            System.out.println("Chọn chức năng");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("chức năng thêm sản phẩm");

                    break;
                case 2:
                    System.out.println("Chức năng sửa thông tin sản phẩm theo id");

                    break;
                case 3:
                    System.out.println("Chức năng xoá sản phẩm theo id");


                    break;
                case 4:
                    System.out.println("chức năng hiển thị danh sách sản phẩm");

                    break;
                case 5:
                    System.out.println("chức năng tìm kiếm sản phẩm theo tên");


                    break;
                case 6:
                    System.out.println("chức năng sắp xếp sản phẩm tăng dần, giảm dần theo giá");

                    break;
                default:
                    flag = false;
            }
        } while (flag);

    }
}
