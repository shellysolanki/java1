import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class Demo
{
         public static void main(String[]args)
         {
             HashMap<Character,Integer> h=new HashMap<Character,Integer>();

               Scanner sc=new Scanner(System.in);
               System.out.println("Enter name : ");
               String s=sc.nextLine();

               char arr[]=s.toCharArray();
               for(char c:arr)
               {
                  if(h.containsKey(c))
                   {
                       h.put(c, h.get(c)+1);
                   }
                  else
                   {
                       h.put(c,1);
                   }
               }
              System.out.println(s+" : "+h);
         }
}
