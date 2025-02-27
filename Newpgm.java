class Area {
    int l;
    int b;
    Area(int x, int y){
        l = x;
        b = y;
    }
    void area(){
        System.out.println("Area is: "+l*b);
    }
}
class Kutty extends Area{

    int h;

    Kutty(int x, int y,int z) {
        super(x, y);
        h=z;
        System.out.println("h= "+h);
    }

    void volume(){
        System.out.println("Volume is:  "+l*b*h);
    }
}

public class Newpgm {
    public static void main(String[] args) {
        Kutty k= new Kutty(7,2,3);
        k.area();
        k.volume();
    }
}
