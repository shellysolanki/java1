import java.util.Scanner;
import java.util.TreeMap;

class Board
{

}

class Demo
{
     public static void main(String[]args)
      {
         TreeMap<String,Integer> t=new TreeMap<String,Integer>();

         Scanner sc=new Scanner(System.in);
         System.out.println("Enter number for loop.");
         int n=Integer.parseInt(sc.nextLine());

             String rank1=null;
             String rank2=null;
             String rank3=null;
             String rank4=null;

         for(int i=0;i<n;i++)
         {
            System.out.println("Enter Student name : ");
             String name=sc.nextLine();

            System.out.println("Enter Student marks : ");
             int marks=Integer.parseInt(sc.nextLine());

            if(marks<=600 && marks>=550)
             {
                 rank1=name;
             }
            else if(marks<=549 && marks>=400)
             {
                 rank2=name;
             }
           else if(marks<=399 && marks>=350)
             {
                 rank3=name;
             }
          else if(marks<=349 && marks>=300)
             {
                 rank4=name;
             }
         }
           System.out.println("Rank 1: "+rank1);
           System.out.println("Rank 2: "+rank2);
           System.out.println("Rank 3: "+rank3);
           System.out.println("Rank 4: "+rank4); 
      }

} 