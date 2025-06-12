import java.util.Scanner;
import java.io.*;


public class contents {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dir name");
        String f=sc.nextLine();
        File ff=new File(f);
        if(!ff.exists() || !ff.isDirectory())
        {
            System.out.println("not dir");
            return;
        }
        System.out.println("contents");
        File[] con=ff.listFiles();
        if(con!=null)
        {
            for(File file: con)
            {
                if(file.isDirectory())
                {
                    System.out.println("subdir :"+file.getName());
                }
                else{
                    System.out.println("files :" +file.getName());
                }
            }
        }
        System.out.println("Enter the file to search");
        String s=sc.nextLine();
        boolean flag=false;
        if(con!=null){
            for(File file:con)
            {
                if(file.isFile()&&file.getName().equalsIgnoreCase(s))
                {
                    System.out.println("found");
                    flag=true;
                    break;
                }
            }

        }
        if(!flag)
        {
            System.out.println("not found");
        }

    }
    
}
