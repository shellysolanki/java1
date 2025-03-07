import java.util.Scanner;
import java.util.ArrayList;
//import java.util.function.*;

class Employee
{
    String name;
    int salary; 
    
    Employee(String name,int salary)
    {
       this.name=name;
       this.salary=salary;
    }
}
class Demo
{
         public static void main(String[]args)
         {

            ArrayList<Integer> a2=new ArrayList<>();
            ArrayList<Employee> a=new ArrayList<>();

              Scanner sc=new Scanner(System.in);
               System.out.println("Enter no for loop : ");
               int n=Integer.parseInt(sc.nextLine());

              for(int i=0;i<n;i++)
              {
                  System.out.println("Enter employee name : ");
                   String name=sc.nextLine();

                  System.out.println("Enter employee's salary : ");
                   int salary=Integer.parseInt(sc.nextLine());

              Employee e=new Employee(name,salary);
              a.add(e);
              }
      
            for(Employee l : a)
            {
                if(l.salary > 5000)
                  {
                    a2.add(l.salary);
                  }
             }
          System.out.println("salary : "+a2);
        }
}

