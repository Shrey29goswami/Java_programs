//Program to display dispatch method. 

//import java.util.Scanner;

class Student{
	int maxRollNo = 100;
}
 
class SchoolStudent extends Student{
      int maxRollNo = 80;
}
 
class CollegeStudent extends SchoolStudent{
      int maxRollNo = 700;
}
 
class DynamicMethodDispatch {
      public static void main(String args[]){
       //Super class can contain subclass object.   
       SchoolStudent obj1 = new CollegeStudent();
       CollegeStudent obj2 = new CollegeStudent();
 
       //In both calls maxRollNo of super class will be printed.
       System.out.println(obj1.maxRollNo);
       System.out.println(obj2.maxRollNo);
      }
}
