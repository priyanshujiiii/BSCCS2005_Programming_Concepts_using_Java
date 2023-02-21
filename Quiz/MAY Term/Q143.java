class Person{
    public void showDetails(){
        System.out.println("displays person details");
    }
}
class Employee extends Person{
    public void showDetails(){
        System.out.println("displays employee details");
    }
    public void incrementSalary(){
        System.out.println("displays the increment salary");
    }
}
public class Test{
    public static void main(String[] args){
        Person p = new Employee();
        p.showDetails();
        p.incrementSalary();
    }
}
