//3

import java.util.*;

interface Fibo
{
    int fibonnaci(int n);
}

class Demo
{
     public static void main(String[]args)
      {
          Fibo f = n ->{
                if (n == 0) return 0;
                if (n == 1) return 1;

                int f1=0, f2=1, f3=0;
     
                 for(int i=2;i<=n;i++)
                 {
                    f3=f1+f2;
                      f1=f2;
                      f2=f3;
                    System.out.println(f3);
                 } 
                return f3;
           };
       System.out.println(f.fibonnaci(5));
      }
}