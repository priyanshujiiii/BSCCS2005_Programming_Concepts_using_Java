public abstract class Computer{
    public abstract void isPortable();
    public void display(){
        System.out.println("Computer display something");
    }
}
public class LCDMonitor extends Monitor{
    public void display(){
        super.display();
        System.out.println("Laptop display something");
    }
}
public class Machine{
    public static void main(String[] args){
        Computer computer = new Laptop();
        computer.display();
    }
}
