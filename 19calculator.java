//4

import java.util.*;

interface Calculator
{
       int cal(int a,int b);    
}
class Demo
{
          public static void main(String[]args)
           { 
               Calculator c=(a,b)->(int)Math.pow(a,b);
               System.out.println(c.cal(2,3));
           }
}