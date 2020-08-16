package RecodeFile;

import QuanLiNhanVien.Employee;

import javax.naming.PartialResultException;
import java.io.*;
import java.util.ArrayList;

public class RecordandWrite {
    public static void write(String source, ArrayList<Employee> arr) {
        try {
            FileOutputStream f = new FileOutputStream(source);
            ObjectOutputStream o = new ObjectOutputStream(f);
            o.writeObject(arr);
            o.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
