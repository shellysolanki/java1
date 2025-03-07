import java.util.*;
class Demo
{
      public static void main(String[] args)
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter no for loop : ");
          int n=sc.nextInt();
int id=0;
    TreeSet<Integer> t=new TreeSet<Integer>();
      
          for(int i=1;i<=n;i++)
          {
              System.out.println("Enter Student id : ");
              id=sc.nextInt();
              sc.nextLine();
      Integer r=new Integer(id);
        t.add(r);
        }
     System.out.println("\n"+"ascending order and Prevent duplicate entries : ");
        for(Integer r1:t)
         {
             System.out.print(r1+" ");
         }
      } 
}