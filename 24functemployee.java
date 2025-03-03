
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


class Employee
{
      String name;
      int salary;
     
      Employee(String name,int salary)
      {
           this.name=name;
           this.salary=salary;
      }
 
    public String toString()
     {
           return name+" : "+salary;
     }
}

class Demo
{
          public static void main(String[]args)
           {
              ArrayList<Employee> e=new ArrayList<>();

               Scanner sc=new Scanner(System.in);
               System.out.println("Enter no for loop : ");
               int n=Integer.parseInt(sc.nextLine());

               for(int i=0;i < n;i++)
               {
                  System.out.println("Enter Employee's name : ");
                  String name=sc.nextLine();

                 System.out.println("Enter Employee's salary : ");
                 int salary=Integer.parseInt(sc.nextLine());

                 Employee e1=new Employee(name,salary);
                  e.add(e1);
               }     
           
                List<Employee> l1 = e.stream().map(x -> new Employee (x.name, x.salary < 50000 ?  x.salary + 5000 : x.salary))
.collect(Collectors.toList());
                 System.out.println(l1);     
               
           }
}



