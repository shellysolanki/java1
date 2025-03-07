import java.util.*;
import java.util.function.Function;

class Demo
{
       public static void main(String[]args)
        {
             Scanner sc=new Scanner(System.in);
              System.out.print("Enter name : ");
              String str=sc.nextLine();

              Function<String, Integer> obj = x -> {                  
                     int count=0;
                     for(int i = 0; i < x.length(); i++)
                      {
                         char c = x.charAt(i);
                         if(c > 0)
                           count++;
                      }
                     return count;
               };

            System.out.print(obj.apply(str));

             sc.close();
        }
}