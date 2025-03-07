//10
import java.util.*;

interface Even
{
     String odd(int a);
}

class Demo
{
      public static void main(String[]args)
       {
          Scanner sc = new Scanner(System.in);
          System.out.print("Enter a number: ");
          int a = sc.nextInt();
           Even e = n -> {
               if(n % 2 == 0)
               {
                   return n + " is Even.";
               }
               else
               {
                  return n + " is Odd.";
               }
       };
       System.out.println(e.odd(a));
   }
}