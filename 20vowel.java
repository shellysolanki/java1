//2

import java.util.*;
interface Vowel
{
      String name(String s);
}

class Demo
{
      public static void main(String[]args)
       {     

             Vowel v = s -> {
               int count=0;
               for(int i = 0;i < s.length(); i++)
               {
               char c=s.charAt(i);
               if(c=='a' || c=='e' || c=='i'|| c=='o' || c=='u')
               {
                 count++;
               }
            }  
            return "Vowel : "+count;
       };
     System.out.println(v.name("eyeiughjo"));
   }
}