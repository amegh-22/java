import java.util.Scanner;

class employee
{
    String name;
    int salary;
    String dep;
    employee(String n, int s,String d)
    {
        name=n;
        salary=s;
        dep=d;

    }
}
class teacher extends employee
{
    String sub;
    int exp;

    teacher(String name,int salary,String dep,String ss,int ex)
    {
        super(name, salary, dep);
        sub=ss;
        exp=ex;

    }

}
public class Arrayofobjects {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of employee want");
        int p=sc.nextInt();
        sc.nextLine();
        employee e[]=new employee[10];
        for(int i=0;i<p;i++)
        {

        System.out.println("Enter the name");
        String n=sc.nextLine();
        System.out.println("Enter salary");
        int s=sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the dep");
        String d=sc.nextLine();
        e[i]=new employee(n,s,d);
    }
    System.out.println("Enter the emp to search");
    String nam=sc.nextLine();
    for(int j=0;j<p;j++)
    {
        if(e[j].name==nam)
        {
            System.out.println(e[j].name);
            System.out.println(e[j].dep);
        }
    }
}
    
}
