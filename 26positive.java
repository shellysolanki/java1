import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
 
class Demo
{
           public static void main(String[]args)
           {
             ArrayList<Integer> l=new ArrayList<>();

                Scanner sc=new Scanner(System.in);

                System.out.println("Enter no for loop : ");
                int n=sc.nextInt();

                for(int i=0; i<n; i++)
                {
                    System.out.println("Enter no : ");
                    int n1=sc.nextInt();  
                 l.add(n1);
                }
       
                List<Integer> l2= l.stream().filter(x -> x >= 0).collect(Collectors.toList());
                 System.out.println(l2);
           }
}