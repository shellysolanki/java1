import java.util.ArrayList;
import java.util.Scanner;
import java.util.function.Predicate;

class Product
{
    private int id;
    private String name;
    private double price;
    private double rating;

    public int getId()
    {
        return id;
    }   
    public void setId(int id)
    {
       this.id=id;
    }

    public String getName()
    {
        return name;
    }   
    public void setName(String name)
    {
       this.name=name;
    }

    public double getPrice()
    {
        return price;
    }   
    public void setPrice(double price)
    {
       this.price=price;
    }

    public double getRating()
    {
        return rating;
    }   
    public void setRating(double Rating)
    {
       this.rating=rating;
    }

    Product(int id,String name,double price,double rating)
    {
         this.id=id;
         this.name=name;
         this.price=price;
         this.rating=rating;
    }
}

class Demo
{
    public static void main(String[]args)
    {
       ArrayList<Product> a=new ArrayList<>();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no for loop : ");
        int n=Integer.parseInt(sc.nextLine());
        System.out.println("Rating should be greater than 4.5 and price also greater than 500.");

        for(int i=0;i<n;i++)
        {
            System.out.println("Enter product id number : ");
            int id=Integer.parseInt(sc.nextLine());
  
            System.out.println("Enter product name : ");
            String name=sc.nextLine();

            System.out.println("Enter product price : ");
            double price=Double.parseDouble(sc.nextLine());

            System.out.println("Enter product rating : ");
            double rating=Double.parseDouble(sc.nextLine());

           Product p=new Product(id,name,price,rating);
            a.add(p);
        }
        
        Predicate<Product> obj = x -> {
                   if(x.getPrice() > 500 && x.getRating() >= 4.0)
                    return true;

                     else
                     return false;
              };
     
                 for(Product p1 : a)
                 {
                      if(obj.test(p1))
                      {
                         System.out.println(p1.getPrice()+" : "+p1.getRating());
                      }
                      else
                      {
                         System.out.println("Sorry! not give correct input....");
                      }
                 }
            }
}
