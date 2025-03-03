import java.util.Scanner;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;

class Employee
{
        int id=0;
        String name="null";
        int age=0;
        double salary=0.0;
        String department="null";
 
       Employee(int id,String name,int age,double salary,String department)
        {
            this.id=id;
            this.name=name;
            this.age=age;
            this.salary=salary;
            this.department=department;
        }
 
      public String toString()
        {
              return id+" : "+name+" : "+age+" : "+salary+" : "+department;
        }
}
class Demo
{
      public static void main(String[]args)
      {

       ArrayList<Employee> l = new  ArrayList<>();

          Scanner sc=new Scanner(System.in);
           System.out.println("Enter no for loop : ");
                int n=Integer.parseInt(sc.nextLine());

             int id;
             String name;
             int age;
             double salary;
             String department;

            for(int i=0; i<n; i++)
                {
                   System.out.println("Enter student's  id : ");
                    id=Integer.parseInt(sc.nextLine()); 

                   System.out.println("Enter student's  name : ");
                    name=sc.nextLine(); 

                  System.out.println("Enter student's age : ");
                    age=Integer.parseInt(sc.nextLine());

                  System.out.println("Enter student's salary : ");
                    salary=Double.parseDouble(sc.nextLine());
                  
                     System.out.println("Enter student's department : ");
                    department=sc.nextLine();
               
                Employee s=new Employee(id,name,age,salary,department);
                    l.add(s);
                }      
          
         List<Employee> l2 = l.stream().filter(x -> x.salary > 50000).collect(Collectors.toList());
           System.out.println(l2);
         List<Employee> l3 = l.stream().filter(y -> y.department.startsWith("IT")).collect(Collectors.toList());
           System.out.println(l3);
         List<Employee> l4 = l.stream().filter(z -> z.age > 30).collect(Collectors.toList()); 
           System.out.println(l4);
         List<Employee> l5 = l.stream().filter(h -> h.name.startsWith("M")).collect(Collectors.toList());
         System.out.println(l5);
                
      }
}

