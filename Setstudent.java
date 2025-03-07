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
     public void setId(String id)
       { 
           this.id=id;
       }


       public String getDepartment()
       {
            return Department;
       }
       public void setDepartment(String Department)
       { 
           this.Department=Department;
       }

     Employee(int id,String name,String Department)
     {
           this.id=id;
           this.name=name;
           this.Department=Department;
     }

        public String toString()
        {
            return id+" : "+name+" : "+Department;
        }
 
        public int hashcode()
         {
             return objects Hashcode( id+" : "+name+" : "+Department);
         }

}

class Demo
{
      public static void main(String[]args)
      {
          Scanner sc=new Scanner(System.in);
           System.out.println("Enter no for loop : ");
            int n=sc.nextInt();
         
          for(int i=0;i<n;i++)
         {
           System.out.println("Enter Employee's id : ");
           int id=sc.nextInt();
            sc.nextLine();        

           System.out.println("Enter Employee's name : ");
           String name=sc.nextLine();

          System.out.println("Enter Employee's Department : ");
           String Department=sc.nextLine();
        }
           
          Employee e1=new Employee(id,name,Department);
          System.out.println(e1);
      } 
}
