import java.util.*;
class Railway{
      String name;
      int ticketNumber;
      String source;
      String destination;
      int seatNumber;
    Railway(String name,int ticketNumber,String source,String destination,int seatNumber){
        this.name=name;
        this.ticketNumber=ticketNumber;
        this.source=source;
        this.destination=destination;
        this.seatNumber=seatNumber;
     }
  public String toString(){
       return name+" : "+ticketNumber+" : "+source+" : "+destination+" : "+seatNumber;
}
}
class Demo1{
    public static void main(String[]args){
           Scanner sc=new Scanner(System.in);
          ArrayList<Railway> l=new ArrayList<Railway>();
     
               System.out.println("Enter Passanger Name : ");
                       String name=sc.nextLine();

                       System.out.println("Enter Passanger Ticket Number : ");
                       int ticketNumber=sc.nextInt();
                       sc.nextLine();

                       System.out.println("Enter Passanger Source : ");
                       String source=sc.nextLine(); 

                       System.out.println("Enter Passanger Destination : ");
                       String destination=sc.nextLine();

                       System.out.println("Enter Passanger Seat Number : ");
                       int seatNumber=sc.nextInt();

             System.out.println("if you want to add more passangers....");
                 System.out.println("Please enter number for new passangers you want to add....");
                int n=sc.nextInt();
   
             Railway r1=new Railway(name,ticketNumber,source,destination,seatNumber);
              l.add(r1); 
for(Railway r:l){
            System.out.println("Passenger Name : "+r.name+"\n"+"Passenger ticketNumber : "+r.ticketNumber+"\n"+"Passenger source : "+r.source+"\n"+"Passenger destination : "+r.destination+"\n"+"Passenger seatNumber : "+r.seatNumber);

            }
           }
}

