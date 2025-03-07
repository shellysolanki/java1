import java.util.*;

class Movie 
{
   String title;
   int releaseyear;
   double rating;

  public String getTitle()
   {
      return title;
   }
   public void setTitle(String title)
   {
      this.title=title;
   }

   public int getReleaseyear()
   {
      return releaseyear;
   }
   public void setReleaseyear(int releaseyear)
   {
      this.releaseyear=releaseyear;
   }
   
   public double getRating()
   {
      return rating;
   }
   public void setRating(double rating)
   {
      this.rating=rating;
   }
 
  Movie(){ }

  Movie(String title,int releaseyear,double rating)
  {
     this.title=title;
     this.releaseyear=releaseyear;
     this.rating=rating;
  }
  
  public String toString()
  {
     return getTitle() + " : " + getReleaseyear() + " : " + getRating();
  }
 }

class New implements Comparator<Movie> 
{
public int compare(Movie m1,Movie m2)
    {
        return (int)m2.rating - (int)m1.rating;      

    }
 }

class Demo
{
      public static void main(String[]args)
      {
         ArrayList<Movie> t=new ArrayList<>();
         Scanner sc=new Scanner(System.in);

         System.out.println("Enter number for loop ");
         int n=Integer.parseInt(sc.nextLine());
       
         for(int i=0;i<n;i++)
          {
           System.out.println("Enter Movie Title : ");
            String title=sc.nextLine();

           System.out.println("Enter Movie Release Year : ");
            int releaseyear=Integer.parseInt(sc.nextLine());
           
           System.out.println("Enter Employee Score : ");
            double rating=Double.parseDouble(sc.nextLine());  
           
          Movie r=new Movie(title,releaseyear,rating);
          t.add(r);
         
          }
     Collections.sort(t,new New());
       
        System.out.println("\nSorted Employee :");
          for(Movie t1:t)
            {
              System.out.println(t1);
            }
      
      }
}