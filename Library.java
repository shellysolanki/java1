import java.util.*;
 
class Library{
           
        int bookId;
        String title;
        String author;
        
        Library(int bookId,String title,String author){
            this.bookId=bookId;
            this.title=title;
            this.author=author;
        }
     public String toString(){
           return bookId+" : "+title+" : "+author;
      }
}

class Demo{
       public static void main(String[]args){
               Scanner sc=new Scanner(System.in);
            LinkedList<Library> l=new LinkedList<Library>();
            int y;
        
             System.out.println("Enter n for loop : ");
              int n=sc.nextInt();
              
             for(int i=0;i<n;i++){
             System.out.println("Enter Book Id : ");
               int bookId = sc.nextInt();
                            sc.nextLine();
             System.out.println("Enter Book title : ");
              String title = sc.nextLine();

             System.out.println("Enter Book author : ");
              String author = sc.nextLine();
  
             Library r=new Library(bookId,title,author);
             l.add(r);
             }
              /*
              System.out.println("\n"+"Available Books : ");
               for(Library r2:l){
                System.out.println(r2.bookId+" : "+r2.title+" : "+r2.author);
                }*/
                 
              do{
               System.out.println("Press 1 for Check how many Books : ");
               System.out.println("Press 2 for Book Issue : ");
               System.out.println("Press 3 for Book Return : ");
                int c=sc.nextInt();
                 switch(c){
                    case 1  :
                        for(Library r2:l){
                        System.out.println(r2.bookId+" : "+r2.title+" : "+r2.author);
                          }
                        break;
                    
                    case 2  :
                        System.out.println("You can only issue one book at once....");
                      System.out.println("You can take book from the list....");
                      for(Library r2:l){
                     System.out.println(r2.bookId+" : "+r2.title+" : "+r2.author);
                     }
                     System.out.println("please press from 0 : ");
                    int b=sc.nextInt();
                    System.out.println("Issued book is : ");
                    System.out.println(l.get(b));
                     break;
                   
                   case 3 :
                         System.out.println("You can only return issued book....");
                          int b1=sc.nextInt();
                          System.out.println("\n"+"After Removal of Issued Book: ");
                         System.out.println(l.get(b1)); 
                             l.remove(b1);

                         for(Library r3:l){
                System.out.println(r3.bookId+" : "+r3.title+" : "+r3.author);
                       }
                       break;
          
                  default :
                       System.out.println("Invalid input");
              } 

              System.out.println("press 1 for repeate the process....");
             y=sc.nextInt();         
          }while(y==1);
         }
}

















