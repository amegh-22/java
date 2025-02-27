import java.util.*;
 class sort_array {
    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    System.out.println("Enter the size of the array");

    int size=scanner.nextInt();
    
     int a[]=new int[size];
     for( int i=0;i<size;i++)
     {
        System.out.println("Enter the elements of the array");
        a[i]=scanner.nextInt();

        
        
     }
     System.out.println("The array is:");
     for(int i=0;i<size;i++)
     {
        System.out.println(a[i]);
     }
     
     //Sorting
     for(int j=0;j<size;j++){
      for(int i=j;i<size;i++)
         if (a[j]>a[i])
         {
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
         }
      }

     System.out.println("The sorted array is:");
     for(int i=0;i<size;i++)
     {
        System.out.print(a[i]+" ");
     }
    }



}