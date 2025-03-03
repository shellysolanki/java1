import java.util.*;
import java.util.stream.*;

class Student
{
     String name;
     int marks;
      
     public  String getName()
      {
          return name;
      }

     public  int getMarks()
      {
          return marks;
      }

     Student(String name,int marks)
     {
         this.name=name;
         this.marks=marks;
     } 
   
 
    public String toString()
      {
          return getName()+" : "+getMarks();
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

              System.out.println("Enter Student's marks : ");
              int marks=Integer.parseInt(sc.nextLine());

              Student s = new Student(name,marks);
               a.add(s);
            }
   
        List<Student> l = a.stream().filter(x -> x.getMarks() > 50)
                                    .map(x ->new Student( x.getName().toUpperCase(),x.getMarks()))
                                    .sorted((x,y) -> {
                                    if(x.getMarks() < y.getMarks())
                                      return +1;
                                    if(x.getMarks() > y.getMarks())
                                      return -1;  
                                    else
                                      return 0; }).limit(3)
                                 .collect(Collectors.toList());
                               System.out.println(l);  
                    
       }
}
