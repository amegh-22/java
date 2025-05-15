package Amegha;

public class div {
    public static void main(String[] args) {
        System.out.println("Start");
        int a= 5, b =0, c;
        try{
            c = a/b;
            System.out.println(c);
        }catch(Exception e){
            System.out.println("Division by zero is not possible bro");
        }
        System.out.println("End");
        
    }
}
