package amegha;

import java.util.*;

public class stack {
    int size,top=-1;
    ArrayList <Integer> stack;
    stack(int s)
    {
        size=s;
        
        stack=new ArrayList<Integer>(s);
    }
    void push()
    {
        Scanner sc=new Scanner (System.in);
        if(top+1>=size)
        {
            System.out.println("overflow");
        }
        else{
            top++;
            System.out.println("Enter the elements");
            int ele=sc.nextInt();
            stack.add(ele);
        }
    }
    void pop()
    {
        if(top==-1)
        {
            System.out.println("underflow");
        }
        else
        {
            stack.remove(top);
            top--;
        }
    }
    void display()
    {
        System.out.println("the stack elements are"+stack);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size ");
        int s=sc.nextInt();
        stack st=new stack(s);
        int ch;
        while(true)
        {
            System.out.println("\nEnter your choice\n1.push\n2.pop\n3.display\n4.Exit");
            ch=sc.nextInt();
            switch (ch)
            {
                case 1:st.push();
                break;
                case 2:st.pop();
                break;
                case 3:st.display();
                break;
                case 4:System.exit(0);
                default:
                System.out.println("invalid choice");



            }

        }
    }
    
}
