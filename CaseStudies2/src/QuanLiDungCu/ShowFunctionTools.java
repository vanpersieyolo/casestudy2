package QuanLiDungCu;

import QuanLiNhanVien.Employee;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ShowFunctionTools {
    public void listTools(ArrayList<Employee> member, ArrayList<Tool> tools){
        int countMember= 0;
        String tenQuanli ="";
        for (Employee e: member) {
            countMember++;
        }
        int countIDTool = 1;
        for (Tool t: tools) {
            countIDTool++;
        }

        do {
            System.out.println("1. Thêm 1 dụng cụ mới ");
            System.out.println("2. Kiểm tra số dụng cụ qua ID người quản lí dụng cụ ");
            System.out.println("3. Xóa 1 dụng cụ ");
            System.out.println("4. In ra toàn bộ dụng cụ ");
            System.out.println("0. Exit");
            System.out.println("nhập lựa chọn");
            Scanner scanner = new Scanner(System.in);

            int choiceT = Integer.parseInt(scanner.nextLine());

            switch (choiceT){
                case 1:
                    System.out.println("1. Nhập vào tên dụng cụ");
                    String nameTool = scanner.nextLine();
                    System.out.println("nhập vào số lượng dụng cụ");
                    int numberTools = Integer.parseInt(scanner.nextLine());
                    int IDManagement = (int) (Math.random()*countMember+1);
                    countIDTool++;
                    for (Employee e:member) {
                        if (e.getId() == IDManagement){
                            System.out.println("người quản lí dụng cụ: " + e.getName());
                        }
                    }
//                  String nameTool, int IDManagement, int numberTool
                    Tool tool = new Tool(nameTool,IDManagement,numberTools);
                    System.out.println(tool.toString());
                    tools.add(tool);
                    break;
                case 2:
                    System.out.println("nhập vào ID người quản lí dụng cụ: ");
                    int idMember = Integer.parseInt(scanner.nextLine());
                    for (Employee e: member) {
                        if (idMember == e.getId()){
                            tenQuanli = e.getName();
                        }
                    }
                    for (Tool tool1: tools) {
                        if (tool1.getIDManagement() == idMember){
                            System.out.println("người quản lí "+ tenQuanli);
                            System.out.println(tool1);
                        }
                    }
                    System.out.println("hiện nhân viên không quản lí dụng cụ nào");
                    break;
                case 3:
                    System.out.println("nhập vào id dụng cụ cần xóa ");
                    int idToolRemove = Integer.parseInt(scanner.nextLine());
                    for (Tool t: tools) {
                        if (idToolRemove == t.getIdTool()){
                            tools.remove(t);
                        }
                    }
                    break;
                case 4:
                    for (Tool t: tools) {
                        System.out.println(t);
                        for (Employee e: member) {
                           if (t.getIDManagement() == e.getId()){
                               System.out.println("ngươi quản lí : "+ e.getName());
                           }
                        }
                    }

                    break;
                case 0:
                    return;
            }

        }while (true);

    }
}
