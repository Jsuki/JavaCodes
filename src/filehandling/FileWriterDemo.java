package filehandling;

import java.io.*;

public class FileWriterDemo {
    public static void main(String args[])
    {
        FileWriter fileWriter=null;
        FileReader fileReader =null;
        try
        {
            fileWriter = new FileWriter("Sample2.txt");
            fileWriter.write("I am from Sawantwadi");
            System.out.println(" Write Succesfully ");

        }
        catch (Exception e)
        {
            throw new RuntimeException();
        }
        finally {
            try {
                fileWriter.close();
            }
            catch (Exception e)
            {
                throw  new RuntimeException();
            }
        }

        try
        {
            fileReader =new FileReader("Sample2.txt");
            int i =fileReader.read();
            while(i>0)
            {
                System.out.print((char) i);
                i=fileReader.read();
            }
        }
        catch(Exception e)
        {
            throw new RuntimeException();
        }
        finally {
            try{
                fileReader.close();
            }
            catch (IOException e)
            {
                throw new RuntimeException();
            }
        }

    }
}
