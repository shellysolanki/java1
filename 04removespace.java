import java.util.*;

class Demo
{
          public static void main(String[]args)
           {
               Scanner sc=new Scanner(System.in);
               System.out.print("Enter any sentence : "); 
               String str=sc.nextLine();

               String a = str.replace(" ","");
               System.out.println(a);  
           }
}