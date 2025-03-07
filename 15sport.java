import java.util.*;

class Sport implements Comparable<Sport>
{
   int pid;
   String pname;
   int matchesplyd;
   double avragScor;

   Sport(int pid,String pname,int matchesplyd,double avragScor)
   {
       this.pid=pid;
       this.pname=pname;
       this.matchesplyd=matchesplyd;
       this.avragScor=avragScor;
   }
 
   public String toString()
   {
      return pid+" : "+pname+" : "+matchesplyd+" : "+avragScor;
   }

  
  public int compareTo(Sport s)
  {
     return (int)s.avragScor - (int)this.avragScor;
  }

}


class Player implements Comparator<Sport>
{
   public int compare(Sport s1,Sport s2)
   { 
      return (s1.pname).compareTo(s2.pname);
    }

    }

}


class Demo
{
    public static void main(String[]args)
    {
      TreeSet<Sport> t=new TreeSet<>(new Player());

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number for loop : ");
        int n=Integer.parseInt(sc.nextLine());

        for(int i=0;i<n;i++)
       {
          System.out.println("Enter Player Id number : ");
          int pid=sc.nextInt();
          sc.nextLine();

          System.out.println("Enter Player name : ");
          String pname=sc.nextLine();

          System.out.println("Enter Player matches played : ");
          int matchesplyd=sc.nextInt();
          sc.nextLine();
          
          System.out.println("Enter Player Average Score : ");
          double avragScor=sc.nextDouble();
          sc.nextLine();
        
         Sport s=new Sport(pid,pname,matchesplyd,avragScor);
          t.add(s);
       }
     System.out.println("\nSorted Students:");
       for(Student r1:t)
       {
          System.out.println(r1);
       }
    }
}