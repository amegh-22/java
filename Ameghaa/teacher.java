package amegha;

import java.util.*;

class Bigteacher {
    int n;
    String nm;
    int sa;
    String a;

    Bigteacher() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee id");
        n = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the name of the employee");
        nm = sc.nextLine();
        System.out.println("Enter the salary");
        sa = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the Address");
        a = sc.nextLine();

    }
}

public class teacher extends Bigteacher {

    Scanner sc = new Scanner(System.in);
    String d;
    String p;

    teacher() {
        System.out.println("Enter the department ");
        d = sc.nextLine();
        System.out.println("Enter the subject");
        p = sc.nextLine();
    }

    public void display() {

        System.out.println("Id" + n);
        System.out.println("Name" + nm);
        System.out.println("Salary" + sa);
        System.out.println("Address:" + a);
        System.out.println("Department:" + d);
        System.out.println("Subject taught :" + p);

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of teachers to insert into the array of objects");
        int k=sc.nextInt();
        teacher t1[]=new teacher[k];
        for(int i=0;i<k;i++)
        {
            t1[i]=new teacher();
        }
        for(int i=1;i<=k;i++)
        {
            System.out.println("Teacher "+i);
            t1[i].display();
        }
    }

}
