
import java.util.Scanner;
 class employee {
    int e_no;
    String e_name;
     int e_salary;
     void display(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Number");
        e_no=sc.nextInt();
        System.out.println("Enter Employee Name");
        e_name=sc.next();
        System.out.println("Enter Employee Salary");
        e_salary=sc.nextInt();
        System.out.println("Enter DA%");
         double daper=sc.nextDouble();
        System.out.println("Enter HRA%");
        double hraper=sc.nextDouble();
        double da=(daper/100)*e_salary;
        double hra=(hraper/100)*e_salary;
        double Salary=(e_salary+da+hra);
        System.out.println("Total salary is" + Salary); }
     public static void main(String[] args) {
        employee e=new employee();
        e.display(); }    }
