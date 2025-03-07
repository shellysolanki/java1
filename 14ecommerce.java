import java.util.*;

class Store implements Comparable<Store>
{
     int pid ;
     String pname;
     double pprice;

     Store(int pid,String pname,double pprice)
     {
        this.pid=pid;
        this.pname=pname;
        this.pprice=pprice;
     }
   public String toString()
    {
       return pid+" : "+pname+" : "+pprice;
    }

    public int compareTo(Store s1)
      {
           return (int)s1.pprice-(int)this.pprice;
      }

    
 }

/* class Product implements Comparable<Store>
{
     public int compareTo(Store s1)
      {
           return (int)(s1.pprice-super.pprice);
      }
}*/


class Demo
{
      public static void main(String[] args)
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter no for loop : ");
          int n=sc.nextInt();
          sc.nextLine();

    TreeSet<Store> t=new TreeSet<>();
      
          for(int i=1;i<=n;i++)
          {
              System.out.println("Enter Product id : ");
              int pid=sc.nextInt();
              sc.nextLine(); 

              System.out.println("Enter Product name : ");
              String pname=sc.nextLine();
              //sc.nextLine();

            System.out.println("Enter Product price : ");
               double pprice=sc.nextDouble();

         Store r1=new Store(pid,pname,pprice);
           t.add(r1);
       }
  
        System.out.println("Sorted Product by price (Descending Order): ");
       for(Store s:t)
         System.out.println(s);
    } 

}