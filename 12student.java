import java.util.*;

class Student 
{
     int rollno;
     String name;
     int marks;

     Student(int rollno,String name,int marks)
     {
        this.rollno=rollno;
        this.name=name;
        this.marks=marks;
     }
   public String toString()
    {
       return "Roll No : "+rollno+" "+"Name : "+name+" "+"Marks : "+marks;
    }
    
 }

 class Marks implements Comparator<Student>
{
     public int compare(Student s1,Student s2)
      {
         //return Integer.compare(s1.marks, s2.marks);
           if(s2.marks<s1.marks) {return -1;} 
          else if(s2.marks>s1.marks) {return +1;}
          else {return 0;}
      }

}


class Demo
{
      public static void main(String[] args)
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter no for loop : ");
          int n=sc.nextInt();
          sc.nextLine();

    TreeSet<Student> t=new TreeSet<>(new Marks());
      
          for(int i=1;i<=n;i++)
          {
              System.out.println("Enter Student Rollno : ");
              int rollno=sc.nextInt();
              sc.nextLine();

              System.out.println("Enter Student name : ");
              String name=sc.nextLine();
    
            System.out.println("Enter Student marks : ");
              int marks=sc.nextInt();

          Student r1=new Student(rollno,name,marks);
           t.add(r1);
        }
     System.out.println("Sorted Students by Marks (ascending Order): ");
       for(Student s:t)
         System.out.println(s);
   } 
}
