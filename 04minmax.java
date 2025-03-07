import java.util.*;
import java.util.function.Function;

class Demo
{
          public static void main(String[]args)
           {
                Scanner sc=new Scanner(System.in); 
                  System.out.print("Enter no for loop : ");
                    int n = Integer.parseInt(sc.nextLine());
                      int arr[] = new int[n];                      

                 for(int i = 0; i < n; i++)
                  {
                        System.out.print("Enter no : ");
                          arr[i] = Integer.parseInt(sc.nextLine());
                  }
                   //System.out.println(Arrays.toString(arr));
               
                Function<int[], String> obj = x -> {
                  int min = x[0];
                  int max = x[0];

                   for(int j = 0; j < x.length; j++)
                    {
                         if(x[j] < min)
                           {
                                min = x[j];
                           }

                         if(x[j] > max)
                           {
                                max = x[j];
                           }
                    }  
                return "maximum : "+max + " , Minimum : "+min;
                    
                 };
              System.out.println(obj.apply(arr));
           }
}