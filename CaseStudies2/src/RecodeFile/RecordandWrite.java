package RecodeFile;

import QuanLiNhanVien.Employee;

import javax.naming.PartialResultException;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class RecordandWrite {
    public static void write(String source, ArrayList<Employee> arr) {
        try {
            FileOutputStream f = new FileOutputStream(source);
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(arr);
            o.close();
        } catch (FileNotFoundException e) {
            System.out.println("không tìm thấy file lưu rồi");
        } catch (IOException e) {
            System.out.println("record lỗi rồi ấy ơi :))");
        }
    }

    public static ArrayList<Employee> read(String source) {
        try {
            FileInputStream f = new FileInputStream(source);
            ObjectInputStream  o = new ObjectInputStream(f);
            ArrayList<Employee> arr = (ArrayList<Employee>) o.readObject();
            o.close();
            return arr;
        } catch (FileNotFoundException e) {
            System.out.println("chưa có dữ liệu rồi. add ngay 1 thành viên thôi");
        } catch (IOException e) {
            System.out.println("chưa có dữ liệu rồi. add ngay 1 thành viên thôi");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
