import java.util.Scanner;
import java.util.Collection;
import java.util.ArrayList;
import java.util.function.Predicate;

class Demo
{
        public static void main(String[]args)
         {
            ArrayList<Integer> a=new ArrayList<Integer>();      

               Scanner sc=new Scanner(System.in);
               System.out.println("Enter name: ");
               String s1=sc.nextLine();

               Predicate<String> obj= x -> {
                      String str=new StringBuilder(x).reverse().toString();
                           
                          if(str.equals(x))
                          {
                               return true;
                          }
                         else
                          {
                               return false;
                          }
                     };
              
               if(obj.test(s1))
               {
                  System.out.println("Palindrom.");
               }
              else
               {
                   System.out.println("not Palindrom.");
               }     
            
         }
}
