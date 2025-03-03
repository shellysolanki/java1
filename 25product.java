import java.util.Scanner;
import java.util.stream.*;
import java.util.ArrayList;
import java.util.List;

class Product
{
        int id=0;
        String name="null";
        double price=0.0;
 
       Product(int id,String name,double price)
        {
            this.id=id;
            this.name=name;
            this.price=price;
        }
 
      public String toString()
        {
              return id+" : "+name+" : "+price;
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
             String name;
             double price;

             for(int i=0; i<n; i++)
                {
                   System.out.println("Enter product's id : ");
                    id=Integer.parseInt(sc.nextLine()); 

                   System.out.println("Enter product's name : ");
                    name=sc.nextLine(); 

                   System.out.println("Enter product price : ");
                    price=Double.parseDouble(sc.nextLine());
                                 
                Product s = new Product(id,name,price);
                    l.add(s);

                }      
          
         List<Double> l2 = l.stream().map(x -> x.price + 100 ).collect(Collectors.toList());
           System.out.println(l2);                
      }
}

