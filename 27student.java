import java.util.*;
import java.util.stream.*;

class Student
{
     String name;
     int marks;
 
     Student(String name,int marks)
     {
         this.name=name;
         this.marks=marks;
     } 
 
    public String toString()
      {
          return name+" : "+marks;
      } 
}

class Demo
{
    public static void main(String[]args)
    {
          ArrayList<Student> a=new ArrayList<>();

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no for loop : ");
            int n=Integer.parseInt(sc.nextLine());

            for(int i=0;i<n;i++)
            {
              System.out.println("Enter Student's name : ");
              String name=sc.nextLine();

              System.out.println("Enter Student's age : ");
              int marks=Integer.parseInt(sc.nextLine());

              Student s = new Student(name,marks);
               a.add(s);
            }
   
        List<Student> l = a.stream().filter(x -> x.marks < 40).collect(Collectors.toList());
              System.out.println(l);  
       }
}
