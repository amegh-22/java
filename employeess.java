public class employeess {
    int emp_id;
    String name;
    int salary;
    String address;

employeess(int emp_id,String name,int salary,String address)
{
    this.emp_id = emp_id;
    this.name = name;
    this.salary = salary;
    this.address = address; 
}
}
    

class Teacher extends employeess  {
    String name;
    String dep;
    String sub;
    Teacher(int emp_id, String name,int salary,String address,String dep,String sub)
    {
        super(emp_id,name,salary,address);
        super(0, name, 0, "");
    }


    
}
