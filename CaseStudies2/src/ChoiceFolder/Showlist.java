package ChoiceFolder;

import QuanLiDungCu.ShowFunctionTools;
import QuanLiDungCu.Tool;
import QuanLiNhanVien.Employee;
import QuanLiNhanVien.ShowfunctionEmployee;
import RecodeFile.RecordAndWriteTools;
import RecodeFile.RecordandWrite;
import RecodeFile.RecordandWrite;

import java.util.ArrayList;
import java.util.Scanner;

public class  Showlist {
    public static void showlist(){
        System.out.println("chọn thư mục quản lí: ");
        System.out.println("1. Quản lí nhân viên trong xưởng");
        System.out.println("2. Quản lí dụng cụ trong xưởng");
        System.out.println("0. Save & logout ");
    }
    public static boolean choiceList(ArrayList<Employee> member,ArrayList<Tool> tools){

        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();

        switch (choice){
            case "1":
                ShowfunctionEmployee showfunctionEmployee = new ShowfunctionEmployee(member);
                showfunctionEmployee.list();
                break;
            case "2":
                ShowFunctionTools showFunctionTools = new ShowFunctionTools();
                showFunctionTools.listTools(member,tools);
                break;
            default:
                System.out.println("nhập lại đê bạn êii");
                break;
            case "0":
                System.out.println("đã đăng xuất");
                RecordandWrite.write("case2.txt",member);
                RecordAndWriteTools.record("case2Tools",tools);
                return false;
        }
        return true;
    }
}
