import java.util.Scanner;
import java.util.function.Predicate;

class Demo
{
      public static void main(String[]args)
       {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter password : ");
           String s=sc.nextLine();

          Predicate<String> p = x -> {
      
             int uppercase=0;
             int pass=0;

             for(int i = 0 ;i < x.length() ;i++) 
             {   
             char c=x.charAt(i); 
                
                 if(c >= 'A' && c <= 'Z')
                   {
                       uppercase++;
                   }
                  if(x.length() <= 8 && uppercase == 1 && (c >= 'a' && c <= 'z') &&                       
                         (c >= '0' && c <= '9') &&
                          c == '!' || c == '@' || c == '#' || c == '$' || c == '%' || c == '^' || c == '&' || c == '*')
                            {
                               pass++;
                            }
               }
             

              if(uppercase == 1 && pass==1)
                 return true;
              else
              return false;
            
            };

           if(p.test(s))
           {
           System.out.println("Strong Password");
           }
          else
           {
           System.out.println("Invalid password");
           }
      }
}


