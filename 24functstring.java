import java.util.Scanner;
import java.util.function.Function;

class Demo
{
       public static void main(String[]args)
       {
           Scanner sc=new Scanner(System.in);
            System.out.println("Enter name : ");
            String k=sc.nextLine();
            Function<String,String> f = x -> new StringBuilder(x).reverse().toString();
             System.out.println(f.apply(k));
       }
}
