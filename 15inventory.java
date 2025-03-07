import java.util.*;

class Inventory implements Comparable<Inventory>
{
   int pid;
   String pname;
   int pquantity;
   double pprice;

   Inventory(int pid,String pname,int pquantity,double pprice)
   {
       this.pid=pid;
       this.pname=pname;
       this.pquantity=pquantity;
       this.pprice=pprice;
   }
 
   public String toString()
   {
      return pid+" : "+pname+" : "+pquantity+" : "+pprice;
   }

  
  public int compareTo(Sport s)
  {
     return  (int)this.pprice - (int)s.pprice;
  }

}


class Product implements Comparator<Sport>
{
   public int compare(Sport s1,Sport s2)
   { 
       if(s1.pquantity < s2.pquantity)
       {
          return +1;
       }
       else if(s1.pquantity > s2.pquantity)
       {
          return -1;
       }
       else
       {
          return (s1.pname).compareTo(s2.pname);
       }

    }

}


class Demo
{
    public static void main(String[]args)
    {
      TreeSet<Sport> t=new TreeSet<>(new Product());

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number for loop : ");
        int n=sc.nextInt();

        for(int i=0;i<n;i++)
       {
          System.out.println("Enter Product Id number : ");
          int pid=sc.nextInt();
          sc.nextLine();

          System.out.println("Enter Product name : ");
          String pname=sc.nextLine();

          System.out.println("Enter Product quanity : ");
          int pquantity=sc.nextInt();
          sc.nextLine();
          
          System.out.println("Enter Product price : ");
          double pprice=sc.nextDouble();
          sc.nextLine();
        
         Sport s=new Sport(pid,pname,pquantity,pprice);
          t.add(s);
       }
    System.out.println(t);
    }
}
