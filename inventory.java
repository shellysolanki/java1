import java.util.*;

class Inventory{
       String bookn;
       String bauthor;

     Inventory(String bookn,String bauthor){
        this.bookn=bookn;
        this.bauthor=bauthor;
      }
public String toString()
{
      return bookn+" : "+bauthor;       
}
}

class Demo
{
        public static void main(String[]args)
        {

         Scanner sc=new Scanner(System.in);
       List<Inventory> b=new LinkedList<Inventory>();
        System.out.println("Enter book's name : ");
        String bookn=sc.nextLine();

       System.out.println("Enter author's name : ");
        String bauthor=sc.nextLine();
       
    Inventory b1=new Inventory(bookn,bauthor);
    b.add(b1);
      System.out.println("Press 1 for Moby Dick's Book");
      System.out.println("Press 2 for The Alchemist's Book");
      int ch=sc.nextInt();
      switch(ch){
         case 1 : 
            System.out.println(ch+"\n"+"Books in the inventory : "+"\n"+"The Alchemist"+"\n"+"Sapiens: A Brief History of Humankind ");
               break;

         case 2 : 
              System.out.println(ch+"\n"+"Books in the inventory : "+"\n"+"Moby Dick"+"\n"+"The Great Gatsby");
               break;

}
 } 
}