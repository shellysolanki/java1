import java.util.*;
import java.util.stream.*;

class University
{
     String name;
     int age;
 
     University(String name,int age)
     {
         this.name=name;
         this.age=age;
     } 
 
    public String toString()
      {
          return name+" : "+age;
      } 
}

class Demo
{
    public static void main(String[]args)
    {
          ArrayList<University> a=new ArrayList<>();

            Scanner sc=new Scanner(System.in);
            System.out.println("Enter no for loop : ");
            int n=Integer.parseInt(sc.nextLine());

            for(int i=0;i<n;i++)
            {
              System.out.println("Enter Student's name : ");
              String name=sc.nextLine();

              System.out.println("Enter Student's age : ");
              int age=Integer.parseInt(sc.nextLine());

              University s = new University(name,age);
               a.add(s);
            }

        boolean l = a.stream().anyMatch(x -> {
                                 if(x.age > 18)
                                     return true;
                              else
                                  return false;
             });
         System.out.println(l);
       }
}
