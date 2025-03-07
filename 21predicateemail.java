import java.util.Scanner;
import java.util.function.Predicate;

class Demo
{
        public static void main(String[]args)
         {   

               Scanner sc=new Scanner(System.in);
               System.out.println("Enter email : ");
               String s=sc.nextLine();
             
               Predicate<String> obj = x -> {
                  int count=0;
                  for(int i = 0; i < x.length(); i++)
                   {
                     char c=x.charAt(i);
                     if(c == '@')
                      {
                         count++;
                      }
                    }

                 if(count == 1 && x.endsWith(".com"))
                  return true;
                 else
                  return false;
                                           
                };
              
               if(obj.test(s))
               {
                  System.out.println("Valid Email.");
               }
              else
               {
                   System.out.println("InValid Email.");
               }     
            
         }
}
