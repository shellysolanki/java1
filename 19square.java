//7

import java.util.*;

interface Square
{
      int sqr(int n);
}
class Demo
{
      public static void main(String[]args)
       {
            Square s=n->n*n;
            System.out.println(s.sqr(10));
       }
} 