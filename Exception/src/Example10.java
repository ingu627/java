import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.File;
import java.io.FileInputStream;

public class Example10 {

    public static void main(String args[]){
        try
        {
            File file = new File("F:/java/fashion_mnist48.txt");
            FileInputStream fileInputStream = new FileInputStream(file);
            System.out.println("file content: ");
            int r = 0;
            while((r = fileInputStream.read())!=-1)
            {
                System.out.print((char)r);
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }


}