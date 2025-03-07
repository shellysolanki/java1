import java.io.*;
import java.util.Scanner;

class Demo
{
      public static void main(String[]args)    throws IOException
       {
         Scanner sc=new Scanner(System.in);
         System.out.print("Enter number of students: ");
         int n=Integer.parseInt(sc.nextLine());

         PrintWriter pw=new PrintWriter("students.txt");
         for(int i=0;i<n;i++)
         {
            System.out.println("Enter student name : ");
            String name=sc.nextLine();
            pw.println(name);
         }
         pw.close();
         System.out.println("Success....");
       }
}