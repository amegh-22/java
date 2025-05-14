class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void display(){
        System.out.println("Name of the person is : "+name);
        System.out.println("Age of the person is : "+age);
    }
}

public class Personmain {
    public static void main(String[] args) {
        //creating an array of objects for the class person
        Person people[]=new Person[3];
        people[0]= new Person("Bheem", 10);
        people[1]= new Person("Chutki", 9);
        people[2]= new Person("Raju", 8);
        //accessing objects in the array
        for(int i=0;i<people.length;i++){
            people[i].display();
        }
    }
}
