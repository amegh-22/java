import java.util.*;
import graphics.*;

public class text {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double radius = sc.nextInt();
        graphics.circle c = new graphics.circle(radius);
        c.Area();
        System.out.println("Enter the length  of the rectangle");
        double len = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle");

        double brea = sc.nextInt();
        graphics.react a = new graphics.react(len, brea);
        a.Area();
        System.out.println("Enter the side of the square");
        double side = sc.nextInt();
        graphics.Square b = new graphics.Square(side);
        b.Area();
    }
}
