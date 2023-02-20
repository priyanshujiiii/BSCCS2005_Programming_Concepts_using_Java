public interface One{
    public default void f1(){
        System.out.println("cannot implement f1()");
    }
    public default void f3(){
        System.out.println("cannot implement f3()");
    }
}
public abstract class Two{
    public abstract void f2();
    public void f1(){
        System.out.println("Class Two f1()");
    }
}
public class Three extends Two implements One{
    public void f2(){
        System.out.println("Class Three f2()");
    }
}
public class Fclass {
    public static void main(String[] args){
        Three three = new Three();
        three.f1();
        three.f2();
        three.f3();
    }
}
