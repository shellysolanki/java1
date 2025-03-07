import java.io.*;

class Demo
{
       public static void main(String[]args)  throws IOException
        {
              FileReader f=new FileReader("info.txt");
              BufferedReader br = new BufferedReader(f);
              String str = br.readLine();
              while(str!=null)
              {
              System.out.println("jb sb thik h to fir chlo kai ghumne");
               str=br.readLine();
              }
              br.close();
              System.out.println("Done");
        }
}
