import java.util.*;

class Classroom
{
   private int quantity;
   private String name;
   private String preference;

   public String getName()
    {
       return name;
    }
   public void setName(String name)
    {
      this.name=name;
    }

   
   public String getPreference()
    {
       return preference;
    }
   public void setPreference(String preference)
    {
      this.preference=preference;
    }


    public int getQuantity()
    {
       return quantity;
    }
   public void setQuantity(int quantity)
    {
      this.quantity=quantity;
    }
  
    Classroom(String name,String preference,int quantity)
    {
        this.name=name;
        this.preference=preference;
        this.quantity=quantity;
    }

    
   public String toString()
    {
       return getName()+" : "+getPreference()+" : "+getQuantity();
    }

 }
   
   class Student implements Comparator<Classroom>
     {
        public int compare(Classroom s1,Classroom s2)
        {
           return -s2.getPreference().compareTo(s1.getPreference());
        }
     }


class Demo
{
    public static void main(String[]args)
     {
      
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number for student : ");
        int n=sc.nextInt();
           sc.nextLine();

     TreeSet<Classroom> t=new TreeSet<>(new Student());

        for(int i=1;i<=n;i++)
         {
         System.out.println("Enter Student name : ");
         String name=sc.nextLine();
        
         System.out.println("Enter unique preferences : ");
         String preference=sc.nextLine();
        sc.nextLine();
         System.out.println("Enter quantity of "+preference+" : ");
         int quantity=sc.nextInt();
        sc.nextLine();
         Classroom c=new Classroom(name,preference,quantity);
          t.add(c);      
      
         }

      System.out.println(t);
     }
}