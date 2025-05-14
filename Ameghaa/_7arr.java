import java.util.Scanner;
public class _7arr {
    
    int A[];
    int s;
    Scanner sc;
    void create()
    {
        sc=new Scanner(System.in);
        System.out.println("Enter the array size");
        s=sc.nextInt();
        A= new int[s];
        System.out.println("Enter the elements:");
        
        for(int i=0;i<s;i++)
        {
            System.out.print("A["+i+"]=");
            A[i]=sc.nextInt();
        }

    }
}
    class find extends _7arr
    {
   

        void search()
        {
             System.out.println("Enter the element to search:");
        int ele=sc.nextInt();
            int index=0;
            boolean flag=false;
            for(int i=0;i<s;i++)
            {
                if(A[i]==ele)
                {
                    index=i;
                    System.out.println("the element is in A["+index+"]");
                    flag=true;
                    break;

                }
            

            }
            if(!flag)
            {
                System.out.println("not found");
            }
        }
        public static void main(String[] args) {
            find f=new find();
            f.create();
            f.search();
        }

    }
    
