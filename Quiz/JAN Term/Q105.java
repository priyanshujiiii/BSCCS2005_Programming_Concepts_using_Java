public class Rectnagle{
    public final void computerArea(){
        System.out.println("area of rectangle");
    }
}
public class Cube extends Rectangle{
    public final void computerArea(){
        System.out.println("area of cube");
    }
}
public class Fclass{
    public static void main(String[] args){
        Rectangle r = new Cube ();
        r.computeArea();
    }
}
