import java.util.Scanner;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;

class Product
{
        int id=0;
        String location="null";
        double rent=0.0;
 
       Product(int id,String location,double rent)
        {
            this.id=id;
            this.location=location;
            this.rent=rent;
        }
 
      public String toString()
        {
              return id+" : "+location+" : "+rent;
        }
}
class Demo
{
      public static void main(String[]args)
      {

       ArrayList<Product> l = new  ArrayList<>();

          Scanner sc=new Scanner(System.in);
           System.out.println("Enter no for loop : ");
                int n=Integer.parseInt(sc.nextLine());

             int id;
             String location;
             double rent;

             for(int i=0; i<n; i++)
                {
                   System.out.println("Enter house's id : ");
                    id=Integer.parseInt(sc.nextLine()); 

                   System.out.println("Enter house location : ");
                    location=sc.nextLine(); 

                   System.out.println("Enter house rent : ");
                    rent=Double.parseDouble(sc.nextLine());
                                 
                Product s = new Product(id,location,rent);
                    l.add(s);

                }      
          
         List<Double> l2 = l.stream().map(x -> x.rent + 1000 ).collect(Collectors.toList());
           System.out.println(l2);                
      }
}

