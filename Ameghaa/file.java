import java.lang.*;
import java.util.*;
import java.io.*;

public class file {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name");
        String f = sc.nextLine();
        File ff = new File(f);
        if (!ff.exists()) {
            System.out.println("file not found ,creating one");
            FileWriter w = new FileWriter(ff);

            System.out.println("Enter the contents:");
            String con = sc.nextLine();
            w.write(con);
            w.close();
        }

        Scanner read = new Scanner(ff);

        while (read.hasNextLine()) {
            String s = read.nextLine();
            System.out.println(s);
        }
        sc.close();
        read.close();

    }

}
