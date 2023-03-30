import java.util.stream.;
import java.util.*; 
class Order{

    private String Id;
    private double amount;
    public Order(String id, double amt) {
        this.Id = id; 
        this.amount =amt;

    }

    public double getAmount () {
        return amount;
    }
}

public class Test{
    public static void main(String[] args) {

        var oList = new ArrayList<Order>(); 
        oList.add(new Order ("A0000", 1000.0)); //LINE 1
        oList.add(new Order ("A0001", 600.0)); 
        oList.add(new Order ("A0002", 1200.0));
        oList.add(new Order ("A0003", 900.0));
        var elements = oList.stream().filter((x) -> x.getAmount ()> 900) .count();

        //LINE 2
        System.out.println(elements);
    }
    //LINE 3
}