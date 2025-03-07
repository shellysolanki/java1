import java.util.*;
 
class Demo
     {
        public static void main(String[]args)
            {
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
                  System.out.println("\n\n");
                   System.out.println("\n\n\n");

        System.out.println("-----------------------------------------------: DOMESTIC ELECTRIC BILL :-------------------------------------------"+"\n");

                    for(int i=0;i<=70;i++)
                    {
                       System.out.print("* ");  
                    }
                     
                     System.out.println("*");
                     System.out.println("*"+"          Name                                         "+name);
                     System.out.println("*"+"          Consumer Number                              "+consmno);
                     System.out.println("*"+"          Billing unit                                 "+"5214 Basant vihar,limbodi");
                     System.out.println("*"+"          PC                                           "+"1");
                     System.out.println("*"+"          Consumption                                  "+reeding);
                     System.out.println("*"+"          Bill Month                                   "+"FEB-25");
                     System.out.println("*"+"          Bill Date                                    "+"30-FEB-2025");
                     System.out.println("*"+"          Billing Amount                               "+billamount);
                     System.out.println("*"+"          Bill Due Date                                "+"02-Mar-2025");
                     System.out.println("*"+"          Bill Amount after Due Date                   "+dueamount);
                     System.out.println("*"+"          Billing unit                                 "+consmno);
                     System.out.println("*"+"          Prompt Payment Date                          "+"25-FEB-2025");
                     System.out.println("*"+"          Bill Amount with Prompt Payment Discount     "+promptamont);

                    
                     for(int i=0;i<=70;i++)
                     {
                       System.out.print("* ");
                     }
                        System.out.println("\n\n");
                   System.out.println("\n\n\n");
                        break;

               case 2:
                      
                    int IVRS;
                    int transno;
                    String Consumername;
                    String Address1;
                    int Mob;
                    String Email;
                    int unit;

                    int rr1=500;
                    int rr2=550;
                    int rr3=600;
                    int rr4=660;
                    int rr5=700;
                    int rr6=800;
                    int amount=0;
                    int promptamount=0;
                    int dueamt=0;

              System.out.println("Enter IVRS Number : ");
              IVRS=sc.nextInt(); 
              sc.nextLine();

              System.out.println("Enter Transaction Number : ");
              transno=sc.nextInt(); 
              sc.nextLine();

              System.out.println("Enter Consumer name : ");
              Consumername=sc.nextLine();
              
              System.out.println("Enter Address : ");
              Address1=sc.nextLine();

              System.out.println("Enter unit : ");
              unit=sc.nextInt();
              sc.nextLine();

              System.out.println("Enter Mobile Number : ");
              Mob=sc.nextInt();
              sc.nextLine();
 
              System.out.println("Enter Email : ");
              Email=sc.nextLine();

              if(unit>=150 && unit<=200)
               {
                    amount=rr1;
               }
              else if(unit>=201 && unit<=250)
               { 
                      amount=rr2;
               }
              else if(unit>=251 && unit<=300)
               { 
                      amount=rr3;
 
               }
              else if(unit>=301 && unit<=350)
               { 
                      amount=rr4; 
               }
              else if(unit>=351 && unit<=400)
               { 
                      amount=rr5; 
               }
               else if(unit>401)
               { 
                      amount=rr6; 
               }
  
                promptamount=amount-20;

                 dueamt=amount+30;
                  System.out.println("\n\n");
                   System.out.println("\n\n");
 

        System.out.println("                                               ----------------------------                                           "+"\n");
        System.out.println("                                               | COMMERCIAL ELECTRIC BILL |                                           "+"\n");
        System.out.println("                                               ----------------------------                                           "+"\n");
                        
                    
                       for(int i=0;i<=70;i++)
                    {
                       System.out.print("* ");  
                    }
                     System.out.println("\n");
                    
                     System.out.println("          IVRS Number                                  "+IVRS);
                     System.out.println("          Transaction Number                           "+transno);
                     System.out.println("          PC                                           "+"1");
                     System.out.println("\n");
                   for(int i=0;i<=70;i++)
                    {
                       System.out.print("- ");  
                    }
                     System.out.println("\n");
                     System.out.println("          Consumer name                                "+Consumername);
                     System.out.println("          Address1                                     "+Address1);
                     System.out.println("          Mobile Number                                "+Mob);
                     System.out.println("          Email                                        "+Email);

                   for(int i=0;i<=70;i++)
                    {
                       System.out.print("- ");  
                    }
                   System.out.println("\n");
                     System.out.println("          Bill Month                                   "+"FEB-25");
                     System.out.println("          Bill Date                                    "+"30-FEB-2025");
                     System.out.println("          Billing Amount                               "+amount);
                     System.out.println("          Bill Due Date                                "+"02-Mar-2025");
                     System.out.println("          Bill Amount after Due Date                   "+dueamt);
                     System.out.println("          Billing unit                                 "+unit);
                     System.out.println("          Prompt Payment Date                          "+"25-FEB-2025");
                     System.out.println("          Bill Amount with Prompt Payment Discount     "+promptamount);
                             
                     for(int i=0;i<=70;i++)
                     {
                       System.out.print("* ");
                     }System.out.println("\n\n\n\n");
                   System.out.println("\n\n\n");
                        break;


                  }
                  
      }
                 
              
}
                                     
        










