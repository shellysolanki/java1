import java.util.*;

public class Product{

     private int id;
     private String name;
     private int price;
     private String location;

     public int getId(){
      return id;
     }
     public void setId(int id){
      this.id=id;
     }


      public String getName(){
      return name;
     }
     public void setName(String name){
      this.name=name;
     }


     public int getPrice(){
      return price;
     }
     public void setprice(int price){
      this.price=price;
     }

     
     public String getLocation(){
      return location;
     }
     public void setLocation(String location){
      this.location=location;
     }

  public Product(int id,String name,int price,String location){
       this.id=id;
       this.name=name;
       this.price=price;
       this.location=location;

}
public String toString(){
     return id+" : "+name+" : "+price+" : "+location;
}

}

 class Demo{
       public static void main(String[]args){
             ArrayList<Product> l=new ArrayList<Product>();
               Scanner sc=new Scanner(System.in);
                System.out.println("Enter any number for loop : ");
                   int n=sc.nextInt();
                   for(int i=0;i<n;i++){
                         System.out.println("Enter Product Id : ");
                         int id = sc.nextInt();
                          sc.nextLine();

                         System.out.println("Enter Product Name : ");
                         String name =sc.nextLine(); 

                         System.out.println("Enter Product Price : ");
                         int price = sc.nextInt();
                         sc.nextLine();

                         System.out.println("Enter Product location : ");
                         String location =sc.nextLine();
                  
          Product r=new Product(id,name,price,location);
               l.add(r);  
} 
                                     
           for(Product p6:l){
                 if(p6.getPrice()>500){
          System.out.println(p6.getId()+" : "+p6.getName()+" : "+p6.getPrice()+" : "+p6.getLocation());  
                          
               }
            }
         }
}
