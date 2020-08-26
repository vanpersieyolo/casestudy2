package RecodeFile;

import QuanLiDungCu.Tool;

import java.io.*;
import java.util.ArrayList;

public class RecordAndWriteTools {
    public static void record(String source, ArrayList<Tool> arr) {
        try {
            FileOutputStream f = new FileOutputStream(source);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(f);
            objectOutputStream.writeObject(arr);
            objectOutputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println(" ko thầy file để ghi cơ");;
        } catch (IOException e) {
            System.out.println("lỗi ghi file r nhé");
        }
    }
    public static ArrayList<Tool> read(String source){
        try {
            FileInputStream f = new FileInputStream(source);
            ObjectInputStream o = new ObjectInputStream(f);
            ArrayList<Tool> arrayList = (ArrayList<Tool>) o.readObject();
            o.close();
            return arrayList;
        } catch (FileNotFoundException e) {
            System.out.println("ko thấy file nào để ghi");
        } catch (IOException e) {
            System.out.println("chưa có dụng cụ nào thỳ phải. thêm ngay nhé");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
