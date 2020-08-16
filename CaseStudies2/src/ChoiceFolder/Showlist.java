package ChoiceFolder;

import QuanLiNhanVien.Employee;
import QuanLiNhanVien.ShowfunctionEmployee;
import RecodeFile.RecordandWrite;
import RecodeFile.RecordandWrite;

import java.util.ArrayList;
import java.util.Scanner;

public class Showlist {
    public static void showlist(){
        System.out.println("chọn thư mục quản lí: ");
        System.out.println("1. Quản lí nhân viên trong xưởng");
        System.out.println("2. Quản lí dụng cụ trong xưởng");
        System.out.println("0. Đăng xuất ");
    }
    public static boolean choiceList(ArrayList<Employee> member){
        int choice;
        Scanner scanner = new Scanner(System.in);
        choice = Integer.parseInt(scanner.nextLine());

        switch (choice){
            case 1:
                ShowfunctionEmployee showfunctionEmployee = new ShowfunctionEmployee(member);
                showfunctionEmployee.list();
                break;
            case 2:
                System.out.println("hihi");
                break;
            case 0:
                System.out.println("đã đăng xuất");
                RecordandWrite.write("case2.txt",member);
                return false;
        }
        return true;
    }
}
