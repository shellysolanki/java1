import java.util.*;

class Hall implements Comparable<Hall>
{
   private String name;
   private String contact;
   private double costprday;
   private String ownrname;

   public String getName()
   {
      return name;
   }
   public void setName(String name)
   {
      this.name=name;
   }

   public String getContact()
   {
      return contact;
   }
   public void setContact(String contact)
   {
      this.contact=contact;
   }

   public double getCostprday()
   {
      return costprday;
   }
   public void setContact(double costprday)
   {
      this.costprday=costprday;
   }

   public String getOwnrname()
   {
      return ownrname;
   }
   public void setOwnrname(String ownrname)
   {
      this.ownrname=ownrname;
   }
 
   Hall(String name,String contact,double costprday,String ownrname)
   {
       this.name=name;
       this.contact=contact;
       this.costprday=costprday;
       this.ownrname=ownrname;
   }

  public String toString()
  {
      return getName()+" : "+getContact()+" : "+getCostprday()+" : "+getOwnrname();
  }
   
  public int compareTo(Hall s)
 {
   return s.name.compareTo(this.name);
 } 

}

class Demo
{
     public static void main(String[]args)  
      {
        TreeSet<Hall> t=new TreeSet<>();
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number for loop ");
         int n=Integer.parseInt(sc.nextLine());

         for(int i=0;i<n;i++)
         {
           System.out.println("Enter hall name : ");
            String name=sc.nextLine();
          
           System.out.println("Enter contact : ");
            String contact=sc.nextLine();

           System.out.println("Enter cost per day : ");
            double costprday=sc.nextDouble();
             sc.nextLine();

           System.out.println("Enter Owner's name : ");
            String ownrname=sc.nextLine();
            
         Hall r=new Hall(name,contact,costprday,ownrname);
         t.add(r);
         }
        System.out.println("\nSorted Hall :");
       for(Hall t1:t)
       {
          System.out.println(t1);
       }

      }
}
 







