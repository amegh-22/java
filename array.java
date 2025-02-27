 import java.util.*;
 class array {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    // System.out.println("Enter the size of the array");

    //  int size=scanner.nextInt();
    
     int a[]=new int[20];
     for( int i=0;i<20;i++)
     {
        System.out.println("Enter the elements of the array");
        a[i]=scanner.nextInt();

        
        
     }
     System.out.println("The array is:");
     for(int i=0;i<20;i++)
     {
        System.out.println(a[i]);
     }
       int max=a.length;
       System.out.println("length is"+max);

    }



}
