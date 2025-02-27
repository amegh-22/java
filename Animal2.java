class Animal {
    String color="red";
}

class Animal2 extends Animal{
    String color="blue";

    void color_display(){
        System.out.println("Color of animal is: "+color);
        System.out.println("Color of parent animal is: "+super.color);
    }
    public static void main(String[] args) {
        Animal2 a=new Animal2();
        a.color_display();
    }
}
