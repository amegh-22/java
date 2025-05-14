import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue<String>q=new PriorityQueue<>();
        q.add("2");
        q.add("3");
        System.out.println(q);
        q.remove();
        q.add("1");System.out.println(q);
    }
    
}
