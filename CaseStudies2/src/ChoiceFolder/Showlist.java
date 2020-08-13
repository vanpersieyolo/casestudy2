package ChoiceFolder;

import QuanLiNhanVien.ShowfunctionEmployee;

import java.util.Scanner;

public class Showlist {
    public static void showlist(){
        System.out.println("chọn thư mục quản lí: ");
        System.out.println("1. Quản lí nhân viên trong xưởng");
        System.out.println("2. Quản lí dụng cụ trong xưởng");
        System.out.println("0. Đăng xuất ");
    }
    public static void choiceList(){
        int choice;
        Scanner scanner = new Scanner(System.in);
        choice = Integer.parseInt(scanner.nextLine());

        switch (choice){
            case 1:
                ShowfunctionEmployee showfunctionEmployee = new ShowfunctionEmployee();
                showfunctionEmployee.list();
                showfunctionEmployee.list();
            case 2:
                System.out.println("hihi");
                break;
            case 0:
                System.out.println("đã đăng xuất");
                return;
        }
    }
}
