import java.util.*;

class Simple implements Comparator<String>
{
     public int compare(String s1,String s2)
      {      
	         return -s2.compareToIgnoreCase(s1);

      }
    
}

class Demo 
{
    public static void main(String[] args)
    {
      TreeSet<String> l = new TreeSet<String>(new Simple());
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter no Price of Person : ");
      int n=sc.nextInt();
       sc.nextLine();

      for(int i=1;i<=n;i++)
      {
        System.out.println("Enter city name : ");
       String name=sc.nextLine();
       l.add(name);
      }
      
      System.out.println(l);
}

}
