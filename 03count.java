import java.io.*;
import java.util.Scanner;

class Demo
{
      public static void main(String[]args)  throws IOException
       {
          String name="null";
         Scanner sc=new Scanner(System.in);      
         PrintWriter pw=new PrintWriter("input.txt");
            System.out.print("Enter student name : ");
            name=sc.nextLine();
            pw.print(name);
         pw.close();

         FileReader fr=new FileReader("input.txt");
         int count=0;
         
         int i=fr.read();
         while(i != -1)
          {
              count++;
              i=fr.read();
          }
         System.out.println("There are "+count+" characters.");

         int countword = 0;
        BufferedReader br = new BufferedReader(new FileReader("input.txt"));  // Use a new FileReader
        String str = br.readLine();
        String arr[] = str.split(" "); 
        for(int j=0;j<arr.length;j++)
        {
            if(!arr[j].equals(" "))
             {
                 countword++;
             }
        }
        System.out.println("There are " + countword + " words.");
        br.close();
        System.out.println("Success....");
       }
}


