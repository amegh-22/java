
 import java.util.Scanner;
 class employees {

    int e_no;
    String e_name;
     int e_salary;
     employees( int e_no, String e_name, int e_salary)
     {
        this.e_no=e_no;
        this.e_name=e_name;
        this.e_salary=e_salary;
     }
     public static void main(String[] args) {
        employees e[]=new employees[10];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number of employees: ");
        int n=sc.nextInt();

        for( int i=0;i<n;i++)
        {
            System.out.println("Enter Employee Number");
            int e_no=sc.nextInt();
            System.out.println("Enter Employee Name");
            String e_name=sc.next();
            System.out.println("Enter Employee Salary");
            int e_salary=sc.nextInt();
            e[i]=new employees(e_no,e_name,e_salary);
        }

        System.out.println("Enter the employee number to search:");
        int search=sc.nextInt();
        sc.close();
        for(int j=0;j<n-1;j++){
         if(e[j].e_no==search){
            System.out.println("Employee Number: "+e[j].e_no);
            System.out.println("Employee Name: "+e[j].e_name);
            System.out.println("Employee Salary: "+e[j].e_salary);
         }
      }
        
   }
}