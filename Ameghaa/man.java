import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class man {
    public static void main(String[] args) throws Exception {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the filename with extension: ");
        String file =sc.nextLine();
        File f1=new File(file);

        if(!f1.exists()){
            System.out.println("file not found ,creating one");
            FileWriter writ=new FileWriter(f1);
        
        System.out.println("Enter the integers: ");
        String num=sc.nextLine();

        writ.write(num);
        writ.close();
        }


        System.out.println("Enter file name for even numbers");
        String even=sc.nextLine();
        System.out.println("Enter the file for odd");
        String odd=sc.nextLine();

        Scanner read=new Scanner(f1);
        FileWriter oddn=new FileWriter(odd);
        FileWriter evenn=new FileWriter(even);

        System.out.println("even");
        while(read.hasNextInt())
        {
            int num =read.nextInt();
            if(num%2==0)
            {
                evenn.write(num);
                System.out.println(num);

            }
        }
        read.close();
        Scanner w=new Scanner(f1);

        System.out.println("odd");
             while(w.hasNextInt())
        {
            int num=w.nextInt();
            if(num%2!=0)
            {
                oddn.write(num);
                System.out.println(num);
            }
        }

       w.close();
    
        evenn.close();
        oddn.close();

    }
}