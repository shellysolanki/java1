import java.util.*;

class Student implements Comparable<Student>
{
   int rollno;
   String name;
   int totalMarks;

   Student(int rollno,String name,int totalMarks)
   {
       this.rollno=rollno;
       this.name=name;
       this.totalMarks=totalMarks;
   }
 
   public String toString()
   {
      return rollno+" : "+name+" : "+totalMarks;
   }

  
  public int compareTo(Student s)
  {
      return  s.totalMarks - this.totalMarks;
  }

}


class Name implements Comparator<Student>
{
   public int compare(Student s1,Student s2)
  {           
      return (s2.name).compareTo(s1.name);    
   }

}


class Demo
{
    public static void main(String[]args)
    {
      TreeSet<Student> t=new TreeSet<>();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number for loop : ");
        int n=Integer.parseInt(sc.nextLine());

        for(int i=0;i<n;i++)
       {
          System.out.println("Enter Student Rollno : ");
          int rollno=sc.nextInt();
          sc.nextLine();

          System.out.println("Enter Student Name : ");
          String name=sc.nextLine();

          System.out.println("Enter Student Total Marks : ");
          int totalMarks=sc.nextInt();
          sc.nextLine();
        
         Student s=new Student(rollno,name,totalMarks);
          t.add(s);
       }
       System.out.println("\nSorted Students:");
       for(Student r1:t)
       {
          System.out.println(r1);
       }
    }
}


