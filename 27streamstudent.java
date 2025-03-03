import java.util.Scanner;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

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
           System.out.println("Enter details of students : ");
           int n=Integer.parseInt(sc.nextLine());

           for(int i=0;i<n;i++)
           {
              System.out.println("Enter Student's name : ");
              String name=sc.nextLine();

              System.out.println("Enter Student's marks : ");
              int marks=Integer.parseInt(sc.nextLine());

              Student s = new Student(name,marks);
               a.add(s);
           } 
   
        List<Student> l = a.stream().sorted((x,y)->
                {
                       if(x.marks < y.marks)
                       return +1;
                      if(x.marks > y.marks)
                        return -1;
                      else
                        return 0;
                 }
).collect(Collectors.toList());
        System.out.println(l);
      }
}