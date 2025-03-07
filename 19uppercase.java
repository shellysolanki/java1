//8
import java.util.*;
interface Upper
{
     String upp(String s);
}
class Demo
{
    public static void main(String[]args)
     {
          Upper up=s->s.toUpperCase();
          System.out.println(up.upp("shelly"));
     }
}