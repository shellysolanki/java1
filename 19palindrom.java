//5
import java.util.*;

interface Palindrom
{
       void p(String s);
} 

class Demo
{
       public static void main(String[]args)
        {
               Palindrom p1 = s -> {
            String reversedStr = new StringBuilder(s).reverse().toString();

            if (s.equals(reversedStr)) {
                System.out.println("Palindrome.");
            } else {
                System.out.println("Not a Palindrome.");
            }
        };   
       p1.p("eye");
        }
}
