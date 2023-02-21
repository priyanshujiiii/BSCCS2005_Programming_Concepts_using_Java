class Calculator{
    public void operation(){
        System.out.println("Perfoms basic operation");
    }
}
class UpdatedCalculator extends Calculator{
    public void Operation(){
        System.out.println("Perfoms updated operations");
    }
}
class SmartCalculator extends Updated Calculator{
    public void operations(){
        System.out.println("Perfoms smart operations");
    }
}
public class Test{
    public static void main(String[] args){
        Calculator cl = new SmartCalculator();
        cl.operations();
    }
}
