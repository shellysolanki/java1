import java.util.*;

class Employee{
        
       private String name;
       private int id;
       private String course;
       
       public String getName()
       {
            return name;
       }
       public void setName(String name)
       { 
           this.name=name;
       }

       
     public int getId()
       {
            return id;
       }
     public void setId(int id)
       { 
           this.id=id;
       }


       public String getCourse()
       {
            return course;
       }
       public void setCourse(String course)
       { 
           this.course=course;
       }

     Employee(int id,String name,String course)
     {
           this.id=id;
           this.name=name;
           this.course=course;
     }

        public String toString()
        {
            return id+" : "+name+" : "+course;
        }
 
        public int hashCode()
         {
             return Objects.hash (id);
         }
     public boolean equals(Object obj)
     {
         if(this==obj)
          {
              return false;     
           }
            
          if(this==null || getClass() != obj.getClass())
          {
              return false;     
          } 

      Employee other=(Employee)obj;
             
     return id==other.id;
}

}


class Demo
{
      public static void main(String[]args)
      {
       
          Scanner sc=new Scanner(System.in);
           System.out.println("Enter no of employees : ");
            int n=sc.nextInt();
         HashSet<Employee> l=new HashSet<Employee>();

          for(int i=0;i<n;i++)
         {
           System.out.println("Enter Employee 's id : ");
           int id=sc.nextInt();
            sc.nextLine();        

           System.out.println("Enter Employee 's name : ");
           String name=sc.nextLine();

          System.out.println("Enter Employee 's Course : ");
           String course=sc.nextLine();

         Employee e1=new Employee(id,name,course);
         l.add(e1);
        }
           System.out.println("\n"+"Employee List : ");
           for(Employee e2:l)
           {
              System.out.println(e2);

           }
      } 
}
