import java.util.*;
import java.util.function.Predicate;

class Demo
{
       public static void main(String[]args)
        {
              Scanner sc=new Scanner(System.in);
              System.out.print("Enter year : ");
              int n=sc.nextInt();
 
              Predicate<Integer> obj = x -> {
                   
                 if(x % 4 == 0)
                     return true;
                 else
                     return false;
              };
            System.out.println(obj.test(n));
        }
}