
import java.util.*;

class Simple implements Comparator<Double>
{
     public int compare(Double d1,Double d2)
      {
         if(d1 < d2)
         {
             return +1;
         }
         else if(d1 > d2)
         {
             return -1;
         }
        else
          {
             return 0;
          }
     
     }      

}

class Demo 
{
    public static void main(String[] args)
    {
      TreeSet<Double> l = new TreeSet<Double>(new Simple());
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no Price of Person : ");
      int n=sc.nextInt();
       sc.nextLine();

      for(int i=1;i<=n;i++)
      {
        System.out.println("Enter name of product : ");
       String name=sc.nextLine();

       System.out.println("Enter price : ");
       double price=sc.nextDouble();
       sc.nextLine();

       l.add(price);
      }
      
      System.out.println(l);
}

}

