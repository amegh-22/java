public class Test {
    int a;
    int b;
    public Test(int x,int y){
        a=x;
        b=y;
    }
    //passing an object
    public boolean equals(Test ob){
        if(ob.a==a && ob.b==b){
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        Test o1=new Test(10,20);
        Test o2=new Test(10,20);
        Test o3=new Test(1,5);
        System.out.println("o1==o2"+" "+o1.equals(o2));
        System.out.println("o1==03"+" "+o1.equals(o3));
    }
}
