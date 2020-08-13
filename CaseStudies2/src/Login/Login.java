package Login;

import java.util.Scanner;

public class Login {
    String account= "";
    String passwords = "";

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPasswords() {
        return passwords;
    }

    public void setPasswords(String passwords) {
        this.passwords = passwords;
    }

    public void showLogin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chương trình quản lí Garage ");
        System.out.println("nhập tên đăng nhập: ");
        setAccount(scanner.nextLine());
        System.out.println("nhập password: ");
        setPasswords(scanner.nextLine());
    }
    public boolean checkLogin(){
       if (getAccount().equals("") && getPasswords().equals("")){
           return true;
       }else{
           return false;
       }
    }
}
