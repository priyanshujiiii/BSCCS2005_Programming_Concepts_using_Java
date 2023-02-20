public class Vechile{
    public void move(){
        System.out.println("move original");
    }
    public void move(String str){
        System.out.println('move overloaded');
    }
    public class Bike extends Vechile{
        public void move(String str){
            System.out.println("move overridden");
        }
    }
}
public class Example{
    public static void main(String[] args){
         Bike bike=new Bike();
         bike.move();
         bike.move("IIT Madras");
    }
}
