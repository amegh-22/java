import java.util.*;
public class Stack {
    int top = -1,size;
    ArrayList<Integer> stack = new ArrayList<Integer>();
    Stack(int s){
        size = s;
    }
    public void push(int value){
        if(top+1==size)
        {
            System.out.println("overflow");
        }
        else{
            
            top++;
            if(stack.size()>top)
            {
                stack.set(top,value);
            }
            else{

            }
            stack.add()
        }

        
    }
    public void  pop()
    {
        if(stack.size()>0)
        {
            top--;
        }
        else{
            System.out.println("underflow");
        }

    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        
    }
}
