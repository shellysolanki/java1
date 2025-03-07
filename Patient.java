import java.util.*;
class Patient{
   int Id;
   String Name;
   String Disease;
   int Age;

     public Patient(int Id,String Name,String Disease,int Age){
        this.Id=Id;
        this.Name=Name;
        this.Disease=Disease;
        this.Age=Age;
     }
  
      public String toString(){
           return Id+" : "+Name+" : "+Disease+" : "+Age;
      }

   /*public Patient(int Id1,String Name1,String Disease1,int Age1){
        this.Id1=Id1;
        this.Name1=Name1;
        this.Disease1=Disease1;
        this.Age1=Age1;
     }

    public String toString(){
           return Id1+" : "+Name1+" : "+Disease1+" : "+Age1;
      }*/

}
class Demo1{
      public static void main(String[] args){
        List<Patient> l=new ArrayList<Patient>();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number for loop  : ");
        int n=sc.nextInt();

         for(int i=0;i<n;i++){

        System.out.println("Enter id  : ");
        int Id=sc.nextInt();
         sc.nextLine();

          System.out.println("Enter age : ");
        int Age=sc.nextInt();
         sc.nextLine();

        System.out.println("Enter Name : ");
        String Name=sc.nextLine();
        
         System.out.println("Enter Disease : ");
        String Disease=sc.nextLine();

        Patient r=new Patient(Id,Name,Disease,Age);
        l.add(r);
        
     }
        for(Patient r1:l){
        System.out.println("id : "+r1.Id+" "+"name : "+r1.Name+" "+"disease : "+r1.Disease+" "+" age : "+r1.Age);
           }


     /*  System.out.println("If you want to add ");
      int n1=sc.nextInt();
          for(int j=0;j<n1;j++){

               System.out.println("Enter id  : ");
        int Id1=sc.nextInt();
         sc.nextLine();

          System.out.println("Enter age : ");
        int Age1=sc.nextInt();
         sc.nextLine();

        System.out.println("Enter Name : ");
        String Name1=sc.nextLine();
        
         System.out.println("Enter Disease : ");
        String Disease1=sc.nextLine();

         Patient r3=new Patient(Id1,Name1,Disease1,Age1);
        l.add(r3);         

           }
      for(Patient r2:l){
         System.out.println("new id : "+r2.Id1+" "+"new name : "+r2.Name1+" "+"new disease : "+r2.Disease1+" "+"new age : "+r2.Age1);
         }*/
}
}


