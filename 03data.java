import java.io.*;
import java.util.Scanner;

class Demo
{
      public static void main(String[]args)    throws IOException
       {
         File f=new File("data.txt");
         PrintWriter pw=new PrintWriter(f);
          pw.println("Ram Ram");
         if(f.exists())
         {
            System.out.println("Yes! file is exist");
         }
         else
            System.out.println("No! file is not exist"); 

         FileReader fr=new FileReader(f);
          System.out.println(fr);

         pw.close();
         System.out.println("Success....");
       }
}