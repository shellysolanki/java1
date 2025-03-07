//1

import java.util.Scanner;

interface Reverse
{
       String rev(String s);
}

class Demo
{
      public static void main(String[]args)
       {
           Reverse r=s->new StringBuilder(s).reverse().toString();
           System.out.println(r.rev("shelly"));
       }
}