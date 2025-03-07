import java.util.*;
class Reverse
{
       public static void main(String[]args)
        {

             Scanner sc=new Scanner(System.in);
            System.out.println("Enter any name : ");
            String s=sc.nextLine();
    Stack<String> s1=new Stack<String>();
            s1.push(s);
            String str=s1.peek();
              for(int i=str.length()-1;i>=0;i--)
              { 
                  char c=s.charAt(i);
                    System.out.println(c); 
              }  
  
        }
}