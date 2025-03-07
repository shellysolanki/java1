//3
import java.util.*;

interface Factorial
{
     int fact(int n);
}
class Demo
{
      public static void main(String[]args)
       { 
           Factorial f1=n->
                          {
                          int factorial=1;
                         for(int i=1;i<=n;i++){
                            factorial=factorial*i;
                            }
                           return factorial;                    
                       };
             System.out.println(f1.fact(3));    
       }
}