17hashmapstudent.java

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class Demo
{ 
      public static void main(String[]args)
        {

          Map<String,String> h=new HashMap<String,String>();

             Scanner sc=new Scanner(System.in);
             System.out.println("Enter number for loop : ");
             int n=Integer.parseInt(sc.nextInt()); 
             for(int i=0;i<n;i++)
             {
                System.out.println("Enter Student name : ");
                String name=sc.nextLine();

                System.out.println("Enter Student name : ");
                int marks=Integer.parseInt(sc.nextInt());

                h.push(k,v);
             }

            System.out.println("you can choose 1 to 5 as your choice : ");
            System.out.println("1. Add Student Marks");
            System.out.println("2. Remove Student");
            System.out.println("3. Update Marks");
            System.out.println("4. Display All Students");
            System.out.println("5. Exit");
            int c=Integer.parseInt(sc.nextInt()); 
            
            switch(c)
            {
               case 1 :
              System.out.println("How many Student you want to add again enter here....");
              int n1=Integer.parseInt(sc.nextInt());
              for(int i=0;i<n1;i++)
              {
                System.out.println("Enter Student name : ");
                String name=sc.nextLine();

                System.out.println("Enter Student rollno : ");
                int rollno=Integer.parseInt(sc.nextInt());

                System.out.println("Enter Student name : ");
                int marks=Integer.parseInt(sc.nextInt());

                h.push(k,v);
              }
              System.out.println(h);

             case 2:
               

            }
        }
}