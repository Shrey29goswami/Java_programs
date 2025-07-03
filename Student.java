//
//
class Student  
{    
    int id = 700515;    
}    

//subclass
public class Department extends Student
{   
    String dept_name = "CSE";
    public static void main(String args[])  
    {  
        Department dt=new Department();   
        System.out.println("Student ID: "+dt.id);    
        System.out.println("Department Name: "+dt.dept_name);   
    }
}
