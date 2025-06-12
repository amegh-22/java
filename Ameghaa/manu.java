import java.util.Scanner;

public class manu {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        s=sc.nextLine();
        int ch;
        do{
            System.out.println("-----------menu----------");
            System.out.println("\n1.Toggle\n2.length\n3.trim\n4.replace\n5.conversion");
            System.out.println("Enter your choice");
            ch=sc.nextInt();
            sc.nextLine();
            switch (ch)
            {
                case 1:
                System.out.println(s.toLowerCase());
                System.out.println(s.toUpperCase());
                break;
                case 2:
                System.out.println(s.length());
                break;
                case 3:
                System.out.println(s.trim());
                break;
                case 4:
                System.out.println("Enter the word to replace: ");
                String a=sc.nextLine();
                System.out.println("with what replace");
                String b=sc.nextLine();
                System.out.println("the new string is");
                String s2=s.replace(a, b);
                System.out.println(s2);
                break;
                case 5:

                System.out.println("Enter a integer value to convert to string");
                int num=sc.nextInt();
                String ss=Integer.toString(num);
                System.out.println(ss);
                break;
                default:
                System.out.println("invalid choice");


            }
        }
            while(ch!=6);
            
        

    }
    
}

