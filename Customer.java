import java.util.*;
class Customer{
      String name;
      int age;
      int marks;
    Customer(String name,int age,int marks){
        this.name=name;
        this.age=age;
        this.marks=marks;
     }
}
class Demo1{
    public static void main(String[]args){
          ArrayList<Customer> l=new ArrayList<Customer>();
          Customer r=new Customer("shelly",22,90);
          //System.out.println(r);
          System.out.println("Customer Name : "+r.name+"\n"+"Customer age : "+r.age+"\n"+"Customer marks "+r.marks);
    }
}
