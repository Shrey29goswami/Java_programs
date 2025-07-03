//parent class
class Employee  
{    
    float salary = 50000;    
}    

//subparent class

class IT extends Employee {
    String Dept_head = "ABC";
}

//child class
public class JavaDEV extends IT  
{   
    String job_type = "Java Developer";
    public static void main(String args[])  
    {  
        JavaDEV obj=new JavaDEV();   
        System.out.println("Total salary credited: "+obj.salary);   
        System.out.println("Department Head: "+obj.Dept_head);   
        System.out.println("Job Type: "+obj.job_type);   
    }    
}
