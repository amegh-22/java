import java.io.File;

public class checkfile {
    public static void main(String[] args) {
        String fname = args[0];
        File f = new File(fname);
        System.out.println("File name: "+f.getName());
        System.out.println("File name: "+f.getPath());
        System.out.println("File name: "+f.exists());

    }
}
