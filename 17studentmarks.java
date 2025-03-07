import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class Demo
{ 
      public static void main(String[]args)
        {

          Map<String,Integer> h=new HashMap<String,Integer<>();

             Scanner sc=new Scanner(System.in);
             System.out.println("Enter number for loop : ");
             int n=Integer.parseInt(sc.nextLine()); 
             for(int i=0;i<n;i++)
             {
                System.out.println("Enter Student name : ");
                String name=sc.nextLine();

                System.out.println("Enter Student marks : ");
                int marks=Integer.parseInt(sc.nextLine());

                h.put(k,v);
             }

            System.out.println("you can choose 1 to 5 as your choice : ");
            System.out.println("1. Add Student Marks");
            System.out.println("2. Remove Student");
            System.out.println("3. Display All Students");
            System.out.println("4. Exit");

            int c=Integer.parseInt(sc.nextLine()); 
            
            switch(c)
            {
               case 1 :
                     System.out.println("Add Employee name : ");
                     String name1=sc.nextLine();
                 if(name.contains(name1))
                  {
                     System.out.println("Add Employee salary : ");
                     Double salary2=Double.parse.Double(sc.nextLine());
                     h.put(name,salary2)
                     System.out.println("Add Successfully!");
                  }
                 System.out.println(h);          

               break;

               case 2:
                   if(name.contains(name1))
                  {
                     h.remove(name2);
                     System.out.println("Removed Successfully!");
                  }
                  System.out.println(h);

               break;

              case 3:
                 System.out.println(h);
                 System.out.println("\n");
              break;

               case 4:
                    System.out.println("Exit this programm."); 
                    System.exit(0);
            }

        }
}








