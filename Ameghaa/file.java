package amegha;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;


public class file {
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter file name");
        String file=sc.nextLine();
        FileOutputStream f=new FileOutputStream(file);
        System.out.println("Enter text to insert");
        String text=sc.nextLine();
        f.write(text.getBytes());

        FileInputStream fs=new FileInputStream(file);/////main
        byte[] b=new byte[fs.available()];
        fs.read(b);
        fs.close();
        String content=new String(b);
        System.out.println("contents of the file is"+file+":");
        System.out.println(content);
        sc.close();

    }
    
}
