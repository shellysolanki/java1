import java.util.*;

class Bill{
      String name; 
      int consmno; 
      int reeding;
      String Address;   
      
        Bill(String name,int consmno,int reeding,String Address){
            this.name=name;
            this.consmno=consmno;
            this.reeding=reeding;
            this.Address=Address;

        }
     
      public String toString(){
         return name+" : "+consmno+" : "+reeding+" : "+Address;
      } 
}
class Demo
     {
        public static void main(String[]args)
            {
            
            LinkedList<Bill> b=new LinkedList<Bill>();
              Scanner sc=new Scanner(System.in);
            
             System.out.println("Press 1 for Domestic Electric Bill.");
              System.out.println("Press 2 for Commercial Electric Bill.");
               int ch=sc.nextInt();

              int r1=330;
              int r2=420;
              int r3=510;
              int r4=660;
              int r5=680;
              int billamount=0;
              int promptamont=0;
              int dueamount=0;
              //int i,j;

           switch(ch)
              {
                case 1 :
              
              System.out.println("Enter Consumer Number : ");
              int consmno=sc.nextInt(); 
              sc.nextLine();

              System.out.println("Enter Reeding : ");
              int reeding=sc.nextInt(); 
              sc.nextLine();

              System.out.println("Enter name : ");
              String name=sc.nextLine();
              
              System.out.println("Enter Address : ");
              String Address=sc.nextLine();              

              if(reeding>=20 && reeding<=30)
               {
                    billamount=r1;
               }
              else if(reeding>=31 && reeding<=50)
               { 
                      billamount=r2;
               }
              else if(reeding>=51 && reeding<=150)
               { 
                      billamount=r3;
 
               }
              else if(reeding>=151 && reeding<=300)
               { 
                      billamount=r4; 
               }
              else
               { 
                      billamount=r5; 
               }
                 
                promptamont=billamount-20;

                 dueamount=billamount+30;

                  Bill s=new Bill(name,consmno,reeding,Address);
                 b.add(s); 
                  System.out.println("\n\n");
                   System.out.println("\n\n");

        System.out.println("-----------------------------------------------: DOMESTIC ELECTRIC BILL :-------------------------------------------"+"\n");

                    for(int i=0;i<=70;i++)
                    {
                       System.out.print("* ");  
                    }
                     
                     for(Bill r:b)
                     {
                     System.out.println("*");
                     System.out.println("*"+"          Name                                         "+r.name);
                     System.out.println("*"+"          Consumer Number                              "+r.consmno);
                     System.out.println("*"+"          Billing unit                                 "+"5214 Basant vihar,limbodi");
                     System.out.println("*"+"          PC                                           "+"1");
                     System.out.println("*"+"          Consumption                                  "+r.reeding);
                     System.out.println("*"+"          Bill Month                                   "+"FEB-25");
                     System.out.println("*"+"          Bill Date                                    "+"30-FEB-2025");
                     System.out.println("*"+"          Billing Amount                               "+billamount);
                     System.out.println("*"+"          Bill Due Date                                "+"02-Mar-2025");
                     System.out.println("*"+"          Bill Amount after Due Date                   "+dueamount);
                     System.out.println("*"+"          Billing unit                                 "+r.consmno);
                     System.out.println("*"+"          Prompt Payment Date                          "+"25-FEB-2025");
                     System.out.println("*"+"          Bill Amount with Prompt Payment Discount     "+promptamont);

                    }
                    
                     for(int i=0;i<=70;i++)
                     {
                       System.out.print("* ");
                     }

                        break;

               case 2:
                      
                    int IVRS;
                    int transno;
                    String Consumername;
                    int Address1;
                    int Mob;
                    String 

                  }
                  
      }
                 
              
}
                                     
        










