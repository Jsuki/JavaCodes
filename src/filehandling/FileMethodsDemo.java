package filehandling;
import java.io.*;
public class FileMethodsDemo {
    public static void main(String args[])
    {
        File file = new File("Sample.txt");
        try
        {
            if(file.exists())
            {
                System.out.println("File already exists");
            }
            else {
                Boolean f =file.createNewFile();
                System.out.println(f);
            }
            System.out.println(file.isFile());
            System.out.println(file.canExecute());
            System.out.println(file.canRead());
            System.out.println(file.canWrite());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.getParent());
            System.out.println(file.getFreeSpace());
        }
        catch (Exception e)
        {
            throw new RuntimeException();
        }
    }

}
