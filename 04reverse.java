import java.util.*;
import java.util.function.Function;

class Demo
{
       public static void main(String[]args)
        {
             Scanner sc=new Scanner(System.in);
              System.out.print("Enter sentence : ");
              String str=sc.nextLine();

              Function<String, String> obj = x -> new StringBuilder(x).reverse().toString();
              System.out.print(obj.apply(str));
             sc.close();
        }
}