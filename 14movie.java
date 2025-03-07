import java.util.*;

class Movie 
{
     String title ;
     double rating;
     int releaseYear;

     Movie(String title,double rating,int releaseYear)
     {
        this.title=title;
        this.rating=rating;
        this.releaseYear=releaseYear;
     }
   public String toString()
    {
       return title+" : "+rating+" : "+releaseYear;
    }
    
 }

 class Year implements Comparator<Movie>
{
     public int compare(Movie s1,Movie s2)
      {
          if((s1.releaseYear)<(s2.releaseYear))
          {
             return +1;
          }

         if((s1.releaseYear)>(s2.releaseYear))
          {
             return -1;
          }
         else
          {
             return 0;
          }


      }
}


class Demo
{
      public static void main(String[] args)
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter no for loop : ");
          int n=sc.nextInt();
          sc.nextLine();

    TreeSet<Movie> t=new TreeSet<>(new Year());
      
          for(int i=1;i<=n;i++)
          {
              System.out.println("Enter Movie title : ");
              String title=sc.nextLine();
              sc.nextLine(); 

              System.out.println("Enter Movie rating : ");
              double rating=sc.nextDouble();
              sc.nextLine();

            System.out.println("Enter Movie release year : ");
              int releaseYear=sc.nextInt();

         Movie r1=new Movie(title,rating,releaseYear);
           t.add(r1);
       }
  
        System.out.println("Sorted Movie by releaseYear (Descending Order): ");
       for(Movie s:t)
         System.out.println(s);
    } 

}