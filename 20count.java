//5

import java.util.*;

interface Count
{
        String count(String s);
}

class Demo
{
      public static void main(String[]args)
      {
           Count c= s -> {
               int count=0;
            String arr[]=s.split(" ");            
             count = arr.length;
            return "This are "+count+" words.";
          
          };
            System.out.println(c.count("shell is biwching person."));
      }
}