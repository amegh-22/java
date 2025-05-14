import java.util.Scanner;

public class _8str {
    void functions() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        System.out.println("the lower case of the string is" + s.toLowerCase());
        System.out.println("the upper case of the string is" + s.toUpperCase());
        System.out.println("the length of the string is" + s.length());

        System.out.println("substring(2)" + s.substring(2));
        System.out.println("substring(2,10)" + s.substring(2, 10));

        System.out.println("the trimmed version" + s.trim());
        System.out.println("index of s" + s.indexOf("s"));
        System.out.println("index of a from starting of 7" + s.indexOf("a", 7));
                System.out.println("conctact ponnu"+s.concat("ponnu"));


    }
    public static void main(String[] args) {
        _8str t=new _8str();
        t.functions();
    }

}
