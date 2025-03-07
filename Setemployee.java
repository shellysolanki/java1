import java.util.*;

class Employee{
        
       private String name;
       private int id;
       private String department;
       
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


       public String getDepartment()
       {
            return department;
       }
       public void setDepartment(String department)
       { 
           this.department=department;
       }

     Employee(int id,String name,String department)
     {
           this.id=id;
           this.name=name;
           this.department=department;
     }

        public String toString()
        {
            return id+" : "+name+" : "+department;
        }
 
        public int hashCode()
         {
             return Objects.hash (id,name,department);
         }
     public boolean equals(Object obj)
     {
         if(this==obj)
          {
              return true;     
           }    
          if(this==null || getClass() != obj.getClass())
          {
              return false;     
          } 

      Employee other=(Employee)obj;
             
     return id==other.id && Objects.equals(name,other.name) && Objects.equals(department, other.department);
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

          System.out.println("Enter Employee 's Department : ");
           String department=sc.nextLine();

         Employee e1=new Employee(id,name,department);
         l.add(e1);
        }
           System.out.println("\n"+"Employee List : ");
           for(Employee e2:l)
           {
              System.out.println(e2);

           }
      } 
}

















 