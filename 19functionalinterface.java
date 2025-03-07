//1 

import java.util.*;

interface Operation
{
     public void operation(int a,int b);
}
class Demo
{
   public static void main(String[]args)
   {
        Operation o=(a,b)->{
           if(a>b) 
           {
             System.out.println("a is greater than b.");
           }
           else if(a<b) 
           {
             System.out.println("b is greater than a.");
           }
           else 
           {
             System.out.println("a and b both are equal.");
           }
        };
       o.operation(20,10);
   }
}