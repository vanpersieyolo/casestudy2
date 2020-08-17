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
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }
}
