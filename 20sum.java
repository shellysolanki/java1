
//4

import java.util.*;

interface Sum
{
      int add(int n);
}

class Demo
{
      public static void main(String[]args)
       {
           Sum s = (n) ->{ 
                   int sum=0;
                  while(n != 0)
                  {
                     sum+= n%10;
                     n/=10;
                  }
                return sum;
               };
           System.out.println(s.add(123));
       }
}