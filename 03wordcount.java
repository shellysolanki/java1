import java.io.*;
import java.util.Scanner;

class Demo
{
      public static void main(String[]args)    throws IOException
       {
        Scanner sc=new Scanner(System.in);

          String name="null";
          char c=0;

            System.out.print("Enter name : ");
            name=sc.nextLine();

            System.out.print("Enter character : ");
            c=sc.next().charAt(0);
    
         PrintWriter pw=new PrintWriter("document.txt");
         pw.print(name);
         pw.close();

         int count=0;
         FileReader fr=new FileReader("document.txt");
         int i=fr.read();
         while(i != -1)
          {
              if((char)i == c)
                {
                   count++;
                }
              i=fr.read();
          }
         System.out.println("repeated char : "+count);
         fr.close();
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
        sc.close();
       }
}

