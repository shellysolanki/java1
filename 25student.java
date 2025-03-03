
import java.util.Scanner;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;

class Student
{
        int id=0;
        String name="null";
        int age=0;
        double marks=0.0;
        String department="null";
 
        Student(int id,String name,int age,double marks,String department)
        {
            this.id=id;
            this.name=name;
            this.age=age;
            this.marks=marks;
            this.department=department;
        }
 
      public String toString()
        {
              return id+" : "+name+" : "+age+" : "+marks+" : "+department;
        }
}
class Demo
{
      public static void main(String[]args)
      {

       ArrayList<Student> l = new  ArrayList<>();

          Scanner sc=new Scanner(System.in);
           System.out.println("Enter no for loop : ");
                int n=Integer.parseInt(sc.nextLine());

             int id;
             String name;
             int age;
             double marks;
             String department;

            for(int i=0; i<n; i++)
                {
                   System.out.println("Enter student's  id : ");
                    id=Integer.parseInt(sc.nextLine()); 

                   System.out.println("Enter student's  name : ");
                    name=sc.nextLine(); 

                  System.out.println("Enter student's age : ");
                    age=Integer.parseInt(sc.nextLine());

                  System.out.println("Enter student's  marks : ");
                    marks=Double.parseDouble(sc.nextLine());
                  
                     System.out.println("Enter student's department : ");
                    department=sc.nextLine();
               
                Student s=new Student(id,name,age,marks,department);
                    l.add(s);
                }      
          
         List<Student> l2 = l.stream().filter(x -> x.marks > 75).collect(Collectors.toList());
           System.out.println(l2);
         List<Student> l3 = l.stream().filter(y -> y.department.equals("computer science")).collect(Collectors.toList());
           System.out.println(l3);
         List<Student> l4 = l.stream().filter(z -> z.age > 20).collect(Collectors.toList()); 
           System.out.println(l4);
         List<Student> l5 = l.stream().filter(h -> h.name.startsWith("A")).collect(Collectors.toList());
         System.out.println(l5);
                
      }
}




