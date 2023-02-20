public class Monitor{
    public void display(){
        System.outprintln("Monitor display()");
    }
}
public class LCDMonitor extends Monitor{
    public void display(){
        System.out.println("LCDMonitor display()");
    }
}
public class LEDMonitor extends LCDMonitor{
    
}
public class Example{
    public static void main(String[] args){
        LEDMonitor monitor= new LEDMonitor();
        monitor.display();
    }
}
