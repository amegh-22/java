import java.lang.*;

public class Stringtest2 {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("abc");
        System.out.println(str);
        System.out.println(str+"def");
        str.append("defghi");
        System.out.println(str);
        String str2 = new String("xyz");
        System.out.println(str2);
        str.insert(2, "jkl");
        System.out.println(str);
        str.delete(2, 05);
        System.out.println(str);
    }
}
