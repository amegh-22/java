class Parent {
    Parent(){
        System.out.println("Parent class");
    }
}

class Child extends Parent{
    Child(){
        System.out.println("Child class");
    }
    public static void main(String[] args) {    
        new Child();
    }
}
