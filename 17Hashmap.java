
import java.util.HashMap;
import java.util.Scanner;

class Demo
{
    public static void main(String[]args)
     {
         HashMap<String,String> h=new HashMap<String,String>();
        
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter no for loop : ");
         int n=Integer.parseInt(sc.nextLine());
         
         for(int i=0;i<n;i++)
         { 
           System.out.println("Enter country name : ");
            String k=sc.nextLine();
         
           System.out.println("Enter country's capital name : ");
            String v=sc.nextLine();

            h.put(k,v);
         }
       System.out.println(h);
     }
}