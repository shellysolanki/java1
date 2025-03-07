//2

import java.util.*;
interface Length
{
    public int length(String s);
}
class Demo
{
      public static void main(String[]args)
       {
           Length l=s->s.length();
           System.out.println(l.length("shelly"));
       }
}