import java.util.Scanner;
public class _9ob
{
Scanner sc;

    void display(int n)
    {
        sc=new Scanner(System.in);
            System.out.println("enter the colour of fruit");
            String s=sc.nextLine();
                System.out.println("enter the no of fruit");
        int i=sc.nextInt();

    }
    public static void main(String[] args) {
        _9ob h=new _9ob();
        System.out.println("enter the number");
        h.sc=new Scanner(System.in);
        int n =h.sc.nextInt();
_9ob d[] = new _9ob[n];  
for (int i = 0; i < n; i++) {
    d[i] = new _9ob(); 
    d[i].display(n);  
}
    }
}