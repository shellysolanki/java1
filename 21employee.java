import java.util.Scanner;
import java.util.ArrayList;
import java.util.function.Predicate;

class Employee
{
     private int id;
     private String name;
     private int year;
     private double rating;

     public int getId()
     {
          return id;
     }
     public void setId(int id)
     {
         this.id=id;
     }

     public String getname()
     {
          return name;
     }
     public void setName(String name)
     {
         this.name=name;
     }

     public int getYear()
     {
          return year;
     }
     public void setYear(int year)
     {
         this.year=year;
     }

     public double getRating()
     {
          return rating;
     }
     public void setRating(double rating)
     {
         this.rating=rating;
     }

     Employee(int id,String name,int year,double rating)
     {
         this.id=id;
         this.name=name;
         this.year=year;
         this.rating=rating;
     }

}

class Demo
{
     public static void main(String[]args)
     {
         ArrayList<Employee> a=new ArrayList<>();
       
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter no for loop ");
         int n=Integer.parseInt(sc.nextLine());

         for(int i=0;i<n;i++)
         {
             System.out.println("Enter Employee's id : ");
             int id=Integer.parseInt(sc.nextLine());

             System.out.println("Enter Employee's name : ");
             String name=sc.nextLine();

             System.out.println("Enter Employee's experience year : ");
             int year=Integer.parseInt(sc.nextLine());

             System.out.println("Enter Employee's rating : ");
             double rating=Double.parseDouble(sc.nextLine());

            Employee e=new Employee(id,name,year,rating);
            a.add(e);
         }
        
         Predicate<Employee> obj = s -> {
                    if(s.getYear() >= 3 && s.getRating()>= 4.2 && s.getRating()<=5.0)
                      return true;
                    else
                      return false;
              };

           for(Employee r: a)
           {
               if(obj.test(r))
               {
                  System.out.println("Year of Experience : "+r.getYear()+"\n"+"Rating of employee : "+r.getRating());
               }
           }

     }
}

















