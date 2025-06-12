import java.util.*;
import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the source file name:");
        String sourcePath = sc.nextLine();
        File sourceFile = new File(sourcePath);

        // Check if source file exists
        if (!sourceFile.exists()) {
            System.out.println("Source file does not exist.");
            return;
        }

        System.out.println("Enter the destination file name:");
        String destPath = sc.nextLine();
        File destFile = new File(destPath);

        Scanner read = new Scanner(sourceFile);
        FileWriter writer = new FileWriter(destFile);

        // Copy all lines
        while (read.hasNextLine()) {
            String line = read.nextLine();
            writer.write(line + "\n");
        }

        read.close();
        writer.close();

        System.out.println("File copied successfully.");
    }
}
