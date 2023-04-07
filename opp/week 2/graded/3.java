import java.util.*;

class Employee
{
    String eid;
    String ename;
    String eprojects[];
 //Define all the required methods here
    public Employee(String id,String name,String projects[]){
        eid = id;
        ename = name;
        eprojects = projects;
    }
    public Employee(Employee other){
        eid = other.eid;
        ename = other.ename;
        eprojects = other.eprojects;
    }
    public void display() {
        System.out.println("Employee ID: " + eid);
        System.out.println("Employee Name: " + ename);
        System.out.println("Employee Projects:");
        for (String project : eprojects) {
            if (project != null) {
                System.out.println("- " + project);
            }
        }
    }
public void mutator()
    {
        this.ename = "Mr "+ this.ename;
        this.eprojects[0] = null;
    }
    
}
public class FClass
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
    	   String project[] = {"P001","P002","P003"};
        //Enter the id of employee
        String id = s.nextLine();
        //Enter the name of employee
        String name = s.nextLine();
        
        Employee e1 = new Employee(id,name,project);
        Employee e2 = new Employee(e1); 
        //The copy constructor must copy all the data members. 
       
        e1.mutator();
        
        e2.display();
    }
}
