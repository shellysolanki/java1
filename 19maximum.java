//9
import java.util.*;
interface Max
{
    int max(int a,int b,int c);
}
class Demo
{
    public static void main(String[]args)   
     {
        Max m=(a,b,c)->{
             if(a>b && a>c)
              {
                 return a;
              }
              else if(b>a && b>c)
              {
                 return b;
              }
              else
              {
                 return c;
              }
           };
           System.out.println(m.max(10,20,30)+" is greater.");
     }

}
