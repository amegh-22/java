import java.util.*;
public class Arrray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList <String> list=new ArrayList<String>();
        list.add("hi");
        list.add("hello");
        list.add("abcd");
        list.add("xyz");
        System.out.println(list);
        System.out.println(list.get(2));
        System.out.println(list.indexOf("xyz"));
        System.out.println(list.contains("abcd"));
        System.out.println(list.set(0,"amegha"));
        System.out.println("Size: "+list.size());
        System.out.println(list);
    }
}