
import java.util.*;

class Employee implements Comparable<Employee>
{
    String name;
    double score;
 
   public String getName()
   {
      return name;
   }
   public void setName(String name)
   {
      this.name=name;
   }

   public double getScore()
   {
      return score;
   }
   public void setScore(double score)
   {
      this.score=score;
   }

   Employee(String name,double score)
   {
       this.name=name;
       this.score=score;
   }

   public String toString()
    {
       return getName()+" : "+getScore();
    }

   public int compareTo(Employee e)
   {
      if(e.score < this.score)
      {
         return -1;
      }
      else if(e.score > this.score)
      {
         return +1;
      } 
      else
      {
          return 0;
      }
   }
}

class Demo
{
      public static void main(String[]args)
      {
         ArrayList<Employee> t=new ArrayList<>();
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number between 1 to 100.");
         System.out.println("Enter number for loop ");
         int n=Integer.parseInt(sc.nextLine());
       
         if(n>=1 && n<=100)
         {
        
         for(int i=0;i<n;i++)
          {
           System.out.println("Enter Employee Name : ");
            String name=sc.nextLine();
           
           System.out.println("Enter Employee Score : ");
            double score=Integer.parseInt(sc.nextLine());  
           
          Employee r=new Employee(name,score);
          t.add(r);
          }
       
   Collections.sort(t);
  System.out.println("\nSorted Employee :");
       for(Employee t1:t)
       {
          System.out.println(t1);
       }
      }

   else
   {
         System.out.println("Sorry! , given number is not valid, try again....");
   }
      }
}









