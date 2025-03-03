import java.util.*;
import java.util.function.*;
class Pass2{
 public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter Size ");

      ArrayList<String> l=new ArrayList<>();
      int Size=Integer.parseInt(sc.nextLine());

      for (int i=0;i<Size;i++)
       {
        System.out.println("enter password");
        l.add(sc.nextLine());
       }

        Predicate<String> p=A->
           
           { 
          
            int uppercase=0;int lowercase=0;int character=0;int digit=0;
            if (A.length() < 8) 
                { 
                System.out.println("Weak Password (Less than 8 characters)");
                return false;
                }
              
                 for(int i=0;i<A.length();i++){

                if(A.charAt(i)>='A'&&A.charAt(i)<='Z')
                  { 
                    uppercase++;
                  }
                if(A.charAt(i)>='a'&&A.charAt(i)<='z')
                 {  
                    lowercase++;
                 }
                if (A.charAt(i)>'0'&&A.charAt(i)<'9')
                 {
                    digit++;
                 }
               
              if(A.charAt(i)=='@'||A.charAt(i)=='#'||A.charAt(i)=='$'||A.charAt(i)=='&')
                    character++;
               } 
               return uppercase > 0 && lowercase > 0 && digit > 0 && character > 0;
           };
           for(String A:l)
            {
                  
              if(p.test(A))
               {  
               System.out.println("Strong Password: " + A);
               }
 
                else 
                  {
                   System.out.println("Weak Password: " +A);
                  }
             }
        }
    }
                  
 







