package filehandling;
import java.io.*;
public class FileHandlingDemo {
    public static void main(String args[]) {
        File file = new File("sample1.txt");
        try {
            FileOutputStream obj = new FileOutputStream(file);
            String str = "Welcome";
            byte[] arr = str.getBytes();
            obj.write(arr);

        } catch (Exception e) {
            throw  new RuntimeException();

        }

        try {
            FileInputStream obj2 = new FileInputStream(file);
            int i=obj2.read();
            System.out.println(i);

        }
        catch (Exception e)
        {
            throw new RuntimeException();
        }

    }
}
