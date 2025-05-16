import java.util.*;
public class set {
    public static void main(String[] args) {
        
    
    LinkedHashSet<String> s=new LinkedHashSet<String>();
    Scanner sc=new Scanner(System.in);
    while (true)
    {
        int ch;
        String ele;
        System.out.println("\nEnter your choice\n1.Add\n2.Remove\n3.display\n4.search\n5.exit");
        ch=sc.nextInt();
        switch(ch)
        {
            case 1:
            System.out.println("Enter the element to insert");
            ele=sc.next();
            s.add(ele);
            break;
            case 2:
                        System.out.println("Enter the element to remove");
            ele=sc.next();
            s.remove(ele);
            break;
            case 3:
            System.out.println("Linked Hashset is "+s);
            break;
            case 4:
            System.out.println("Enter the element to search");
            ele=sc.next();
            boolean con=s.contains(ele);
            System.out.println("the set contains"+ele+ ":"+con);
            break;
            case 5:
            System.exit(0);
            default:
            System.out.println("invalid choice");


        }
    }
    
}
}
