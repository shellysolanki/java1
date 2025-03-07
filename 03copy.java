import java.io.*;
//import java.util.Scanner;

class Demo
{
      public static void main(String[]args)  throws IOException
       {
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          FileInputStream fi = null;
          FileOutputStream fo = null;
          
         try{
          System.out.println("Enter original file : ");
          String of = br.readLine();

          System.out.println("Enter copied file : ");
          String cf = br.readLine();

          fi = new FileInputStream(of);
          fo = new FileOutputStream(cf);

          int i;
            
           do{
              i=fi.read();
              fo.write(i);
           }
          while(i != -1);
       }
       catch(Exception ee)
        { }
         System.out.println("Successfully....!");
       }
}