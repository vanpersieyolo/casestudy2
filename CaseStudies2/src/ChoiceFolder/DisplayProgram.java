package ChoiceFolder;
import Login.Login;
import QuanLiDungCu.Tool;
import QuanLiNhanVien.Employee;
import QuanLiNhanVien.ShowfunctionEmployee;
import RecodeFile.RecordAndWriteTools;
import RecodeFile.RecordandWrite;

import java.util.ArrayList;

public class DisplayProgram {
    public static void main(String[] args) {
        ArrayList<Employee> member = new ArrayList<>();
        ArrayList<Tool> tools = new ArrayList<>();
        Login login = new Login();
        login.showLogin();
        int count = 3;
        member = RecordandWrite.read("case2.txt");
        tools = RecordAndWriteTools.read("case2Tools");
        while (count > 0 ){
            if (login.checkLogin() == false){
                System.out.println("bạn đã nhập sai. bạn còn "+count+" lần đăng nhập");
                login.showLogin();
                count--;
            }else {
                System.out.println("succes");
                break;
            }
        }
        if (login.checkLogin() == true){
            boolean check = true;
            do{
                Showlist.showlist();
                check = Showlist.choiceList(member,tools);
            } while (check);

        }
    }
}
