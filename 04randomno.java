import java.util.*;
import java.util.function.Function;

class Demo
{
       public static void main(String[]args)
        {
              Scanner sc=new Scanner(System.in);
              System.out.print("Enter no1 : ");
              int n=Integer.parseInt(sc.nextLine());
     
              System.out.print("Enter no2 : ");
              int n1=Integer.parseInt(sc.nextLine());

              Function<Integer, Integer> obj = x -> {
                    int n2 = n+(int)(Math.random()*(n1 - n + 1));
                     return n2;
               }; 
         
               System.out.print(obj.apply(n));
        }
}