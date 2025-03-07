import java.util.*;
import java.util.function.Function;

class Demo
{
       public static void main(String[]args)
        {
              Scanner sc=new Scanner(System.in);
              System.out.print("Enter sentence : ");
              String str=sc.nextLine();
     
              Function<String, String> obj = x -> {                  

                      String arr[]=x.split(" "); 
                  StringBuilder s= new StringBuilder();
for (String word : arr) {  
                if (word.length() > 0) {  // Avoid empty strings
                    String str2 = word.substring(0, 1).toUpperCase() + word.substring(1);  
                   s.append(str2).append(" ");  // Append capitalized word and space
                }
            }
     
                  return s.toString().trim();
               };
             System.out.print(obj.apply(str));
             sc.close();
        }
}