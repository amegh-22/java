import java.util.*;
class example extends Exception {
    public example(String message) {
        super(message);
    }
    
}
public class exc{
    static void check(int age) throws example{
        if(age<18)
        {
            throw new example("age mus be greater than 18");
        }
        else
        {
            System.out.println("Age"+age);

        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your age: ");
        int a=sc.nextInt();
        try{
            check(a);
        }
        catch(example e)
        {
            System.out.println("caught"+e.getMessage());
        }
    }

}
