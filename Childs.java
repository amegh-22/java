class Base {
    Base() {
        System.out.println("This is base Constructor");
    }

    void display() {
        System.out.println("This is base display function");
    }
}

class Childs extends Base {
    
        int x;
        Childs()
        {
            System.out.println("This is child default Constructor");

        }
        void display(int m)
        {
            x=m;
            System.out.println(" Value of X is " + x);

        }
        public static void main(String[] Args)
        {
            Childs c=new Childs();
            c.display();
            c.display(2);
        
        
    }
}


