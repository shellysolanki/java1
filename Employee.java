import java.util.*;
class Employee{
   private int Id;
   private  String Name;
   private String Department;

     public int getId()
     {
     return Id;
     }
     public void setId(int Id)
     { 
       this.Id=Id;
     } 

   
     public String getName()
     {
     return Name;
     }
     public void setName(String Name)
     { 
       this.Name=Name;
     } 

      public String getDepartment()
     {
     return Department;
     }
     public void setDepartment(String Department)
     { 
       this.Department=Department;
     } 


     Employee(int Id,String Name,String Department){
        this.Id=Id;
        this.Name=Name;
        this.Department=Department;
     }

      public String toString(){
           return Id+" : "+Name+" : "+Department;
      }
}
class Demo1{
      public static void main(String[] args){
        List<Employee> l=new ArrayList<Employee>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter id  : ");
        int Id=sc.nextInt();
         sc.nextLine();

        System.out.println("Enter Name : ");
        String Name=sc.nextLine();
        
         System.out.println("Enter Department : ");
        String Department=sc.nextLine();

        Employee r=new Employee(Id,Name,Department);
         System.out.println("Employee Id : "+r.getId()+"\n"+"Employee Name : "+r.getName()+"Employee Department : "+r.getDepartment());
         
}
}