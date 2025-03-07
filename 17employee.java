import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class Demo
{ 
      public static void main(String[]args)
        {

          Map<String,Double> h=new HashMap<String,Double>();

             Scanner sc=new Scanner(System.in);
             System.out.println("Enter number for loop : ");
             int n=Integer.parseInt(sc.nextLine());
             String name=null;
             double salary=0;
             for(int i=0;i<n;i++)
             {
                System.out.println("Enter Employee name : ");
                name=sc.nextLine();

                System.out.println("Enter Employee Salary : ");
                salary=Double.parseDouble(sc.nextLine());

                h.put(name,salary);
             }

            System.out.println("you can choose 1 to 5 as your choice : ");
            System.out.println("1. Update Salary");
            System.out.println("2. Remove Employee");
            System.out.println("3. Display All Employee");
            System.out.println("4. Exit");

            int c=Integer.parseInt(sc.nextLine()); 
            
            switch(c)
            {
               case 1 :
                   System.out.println("Add Employee name : ");
                String name1=sc.nextLine();

                 if(name.contains(name1))
                  {
                     System.out.println("Add employee's salary : ");
                     Double salary1=Double.parseDouble(sc.nextLine());

                     h.put(name,salary1);
                     System.out.println("Salary Add Successfully!");
                  }
                 System.out.println(h);          

               break;

               case 2:
                   System.out.println("Add Employee name : ");
                   String name2=sc.nextLine();

                   if(name.contains(name2))
                   {
                     h.remove(name2);
                     System.out.println("Employee Remove Successfully!");
                   }
    
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
