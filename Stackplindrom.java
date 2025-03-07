import java.util.*;

class Palindrom
{
       public static void main(String[]args)
        { 
           Scanner sc=new Scanner(System.in);
            System.out.print("Enter name : ");
            String s=sc.nextLine();
            int count=0;
            int e=0;
            String str="";
            for(int i=(s.length()-1);i>=0;i--){
                char c=s.charAt(i);
               str+= String.valueOf(c);
                 //System.out.print(str);
              
             if(s.equals(str))
             {
                count++;  
             }
            }
        
          if(count==1)
              {
                 System.out.println("Palindrom."); 
              }
             else 
             {
                 System.out.println("not Palindrom."); 
             }


        }
}