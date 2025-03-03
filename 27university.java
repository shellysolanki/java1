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

        Optional<University> l = a.stream().min((x,y)-> {
               
                  if(x.age < y.age)
                    return +1;
                  if(x.age > y.age)
                    return -1;
                  else
                     return 0;
          });
            if(l.isPresent())
            {
             System.out.println("Maximum age : "+l.get());
            }

         Optional<University> l2 = a.stream().min((x,y)-> {
               
                  if(x.age > y.age)
                    return +1;
                  if(x.age < y.age)
                    return -1;
                  else
                     return 0;
          });
            if(l2.isPresent())
            {
             System.out.println("Minimum age : "+l2.get());
            }

    }
}