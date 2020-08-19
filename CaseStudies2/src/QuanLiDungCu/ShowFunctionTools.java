package QuanLiDungCu;

import QuanLiNhanVien.Employee;
import com.sun.tools.javac.Main;

import java.io.ObjectInputStream;
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
        int countIDTool = 0;
        for (Tool t: tools) {
            if (t.getIdTool() > countIDTool){
                countIDTool = t.getIdTool();
            }
        }

        System.out.println(countIDTool);
        do {
            System.out.println("1. Thêm 1 dụng cụ mới ");
            System.out.println("2. Kiểm tra số dụng cụ qua ID người quản lí dụng cụ ");
            System.out.println("3. Xóa 1 dụng cụ ");
            System.out.println("4. In ra toàn bộ dụng cụ ( có người quản lí) ");
            System.out.println("5. In ra toàn bộ công cụ ");
            System.out.println("6. Thay đổi người quản lí dụng cụ ( những dụng cụ của nhân viên đã nghỉ việc)");
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
                    int idTools = ++ countIDTool;
                    for (Employee e:member) {
                        if (e.getId() == IDManagement){
                            System.out.println("người quản lí dụng cụ: " + e.getName());
                        }
                    }
//                  String nameTool, int IDManagement, int numberTool
                    Tool tool = new Tool(nameTool,IDManagement,numberTools,idTools);
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
                        for (Employee e: member) {
                            int countTools = 0;
                            for (Tool t:tools ) {
                                if (t.getIDManagement() == e.getId()){
                                    ++countTools;
                                }
                            }
                            if (countTools > 0 ){
                                System.out.println(e.getName());
                                for (Tool t:tools ) {
                                    if (t.getIDManagement() == e.getId()){
                                        System.out.println(t);
                                    }
                                }
                            }
                        }
                    for (Tool t: tools) {
                        boolean check = false ;
                        for (Employee a: member) {
                            if (t.getIDManagement() == a.getId()){
                                check = true;
                            }
                        }
                        if (!check){
                            System.out.println("dụng cụ chưa đc quản lí "+t);
                        }
                    }
                    break;
                case 5:
                    for (Tool t: tools) {
                        System.out.println(t);
                    }
                    break;
                case 6:
                    for (Tool t: tools) {
                        boolean check1 = false;
                        for (Employee e: member) {
                            if (t.getIDManagement() == e.getId()){
                                check1 = true;
                            }
                        }
                        if (!check1){
                            int indexArray = (int) (Math.random()*member.size());
                            t.setIDManagement(member.get(indexArray).getId());
                            System.out.println("dụng cụ đã được đổi sang người quản lí: "+ member.get(indexArray).getName());
                            System.out.println(t);
                            return;
                        }
                    }
                    System.out.println("không có công cụ nào chưa được quản lí");
                    break;
                case 0:
                    return;
            }
        }while (true);

    }
}
