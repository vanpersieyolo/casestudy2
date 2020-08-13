package ChoiceFolder;
import Login.Login;
import QuanLiNhanVien.ShowfunctionEmployee;
import java.util.ArrayList;

public class DisplayProgram {
    public static void main(String[] args) {
        ArrayList<ShowfunctionEmployee> arrE= new ArrayList<>();
        Login login = new Login();
        login.showLogin();
        int count = 3;
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
            Showlist.showlist();
            Showlist.choiceList();
        }
    }
}
