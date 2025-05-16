import java.util.*;
public class queue {
    public static void main(String[] args) {
        PriorityQueue <String> q=new PriorityQueue<String>();
        Scanner sc=new Scanner(System.in);
       
        
        while(true)
        {
             String ele;
            int ch;
            System.out.println("\nEnter your choice\n1.Enqueue\n2.Dequeue\n3.peek\n4.Display\n5.Exit");
            ch= sc.nextInt();
            switch(ch)
            {
                case 1:
                System.out.println("Enter the element to insert");
                ele=sc.next();
                q.add(ele);
                break;
                case 2:
                q.remove();
                break;
                case 3:
                System.out.println("the head elemet is"+q.peek());
                case 4:
                System.out.println("The queue is"+q);
                case 5:
                System.exit(0);
                default:
                System.out.println("invalid choice");

            }
        }
    }
    
}
