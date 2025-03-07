
//6
import java.util.*;
interface Concate
{
      String con(String s,String s1);
}
class Demo
{
        public static void main(String[]args)
         {
             Concate c=(s,s1)->s.concat(s1);
             System.out.println(c.con("hello","guys"));
         }
}