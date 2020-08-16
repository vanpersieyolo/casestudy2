package QuanLiNhanVien;
import ChoiceFolder.Showlist;

import java.util.ArrayList;
import java.util.Scanner;

public class ShowfunctionEmployee {
    ArrayList<Employee> member;

    public ShowfunctionEmployee(ArrayList<Employee> member) {
        this.member = member;
    }

    public void list() {
        do {

            System.out.println("1. Thêm 1 nhân viên");
            System.out.println("2. Xóa 1 nhân viên");
            System.out.println("3. Tìm 1 nhân viên theo ID");
            System.out.println("4. In ra tất cả nhân viên");
            System.out.println("5. Sửa thông tin nhân viên ");
            System.out.println("0. Exit ");
            System.out.println("nhập lựa chọn: ");
            Scanner scanner = new Scanner(System.in);
            int choiceE = Integer.parseInt(scanner.nextLine());
            switch (choiceE) {
                case 1:
                    System.out.println("nhập vào tên nhân viên:");
                    String name = scanner.nextLine();
                    System.out.println("nhập vào email:");
                    String email = scanner.nextLine();
                    System.out.println("nhập vào tuổi: ");
                    int age = Integer.parseInt(scanner.nextLine());
                    System.out.println("nhập vào ID: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    Employee employee = new Employee(name, age, email, id);
                    member.add(employee);
                    break;
                case 2:
                    System.out.println("nhập vào ID của nhân viên cần remove: ");
                    int idRemove = Integer.parseInt(scanner.next());
                    for (Employee e: member) {
                        if (e.getId() == idRemove){
                            member.remove(e);
                            System.out.println("Đã xóa nhân viên khỏi danh sách");
                            break;
                        }else {
                            System.out.println("không có nhân viên có ID vừa nhập !");
                        }
                    }
                    break;
                case 3:
                    System.out.println("nhập vào ID nhân viên cần tìm: ");
                    int idFind = Integer.parseInt(scanner.next());
                    for (Employee e: member) {
                        if (e.getId() == idFind){
                            System.out.println("Nhân viên cần tìm là: ");
                            System.out.println(e.toString());
                        }else{
                            System.out.println("không có nhân viên có ID vừa nhập !");
                        }
                    }
                    break;
                case 4:
                    for (Employee e : member) {
                        System.out.println(e.toString());
                    }
                    break;
                case 5:
                    System.out.println("nhập vào ID của nhân viên cần sửa thông tin: ");
                    int idUpdate = Integer.parseInt(scanner.next());
                    for (Employee e : member) {
                        if (idUpdate == e.getId()){
                            System.out.println("sửa lại tên nhân viên: ");
                            String nameNew = scanner.next();
                            e.setName(nameNew);
                            System.out.println("sửa lại tuổi nhân viên: ");
                            int ageNew = Integer.parseInt(scanner.next());
                            e.setAge(ageNew);
                            System.out.println("sửa lại email nhân viên: ");
                            String emailNew = scanner.next();
                            e.setEmail(emailNew);
                            System.out.println(e.toString());
                        }
                        else {
                            System.out.println("không có nhân viên có ID vừa nhập !");
                        }
                    }
                case 0:
                    return;
            }
        }while (true);
    }
}
