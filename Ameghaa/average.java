import java.util.Scanner;

class negative extends Exception{
negative(String s)
{
    super(s);
}
}


    
public class average{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int no[] =new int[n];
        double sum=0;
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        {
            no[i]=sc.nextInt();
            try{
                if(no[i]<0)
                {
                    throw new negative("cannot be negative number");
                }
                else{
                    sum+=no[i];
                }
            }
            catch(negative e){
                System.out.println(e.getMessage());
                System.exit(0);
            }
        }
        System.out.println("Average" +String.format("%.2f", sum/n));
    }
    
}
