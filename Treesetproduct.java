
import java.util.*;
class Person
{
   private int id;
   private String name;
   private double salary;

   public int getId()
   {
      return id;
   } 
   public void setId(int id)
   {
      this.id=id;
   }

   public String getName()
   {
      return name;
   } 
   public void setName(String name)
   {
      this.name=name;
   }

   public double getSalary()
   {
      return salary;
   } 
   public void setSalary(double salary)
   {
      this.salary=salary;
   }
     
   Person(int id,String name,double salary)
   {
      this.id=id;
      this.name=name;
      this.salary=salary;
   }

   public String toString()
   {
      return id+" : "+name+" : "+salary;
   }

   public int hashCode()
   {
      return Objects.hashCode(id+" : "+name+" : "+salary);
   }

   public boolean equals(Object Obj)
   {
      if(this==Obj)
      {
         return true;
      }
      if(this==null || getClass() != Obj.getClass())
      {
         return false;
      }
   Person other=(Person)Obj;
      
         return id==other.id && Objects.equals(name,other.name) && Objects.equals(salary, other.salary);
   }


   
}
class Demo
{
    public static void main(String[] args)
    {
      TreeSet<Person> l=new TreeSet<Person>();
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no of Person : ");
      int n=sc.nextInt();
      for(int i=0;i<=n;i++)
      {
       System.out.println("Enter Person id : ");
       int id=sc.nextInt();
       sc.nextLine();

       System.out.println("Enter Person name : ");
       String name=sc.nextLine();
       
       System.out.println("Enter Person salary : ");
       double salary=sc.nextDouble();
       sc.nextLine();

      Person r=new Person(id,name,salary);
       l.add(r);
      }
       for(Person p:l)
       {
         System.out.println(p);
       }
    }
}