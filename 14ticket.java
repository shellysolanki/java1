import java.util.*;

class Demo
{
      public static void main(String[]args)
      {
          int y=1;
          do
           {

          Scanner sc=new Scanner(System.in);
         System.out.println("How many sites do you want : ");
            int n=sc.nextInt();            
          int sites =5;

           if(n<=5) 
           {
             System.out.println("1 2 3 4 5 are available"+"\n"+"Enter seat for your choice : ");
         TreeSet<Integer> t=new TreeSet<>();
           int n1=sc.nextInt();
             sc.nextLine();
           System.out.println("Enter name of "+n+" Person.");
            String name=sc.nextLine();
             sc.nextLine();
           System.out.println("Enter destination : ");
            String destination=sc.nextLine();

              if(n1>=1 && n1<=5)
            {
               System.out.println(n+" is Present!");
            }
           else
           {
               System.out.println(n+" is Present!");
            }
         }
       
          else 
          {
             System.out.println("Sorry! for your inconvenience we have only 5 sites remaning....");
          }
         System.out.println("Press 1 If you want to continue....");
        y=sc.nextInt();
      }while(y==1);
       
  }
 
}