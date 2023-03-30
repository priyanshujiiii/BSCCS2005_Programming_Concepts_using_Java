import java.util.*; 
public class Test{
    public static void main(String[] args) {

        var bill_march = new LinkedHashMap<String, Integer>();
        bill_march.put("suresh", 100);
        bill_march.put("mukesh", 150);
        bill_march.put("ganesh", 80);
        bill_march.put("pranay", 200);
        var bill_april = new LinkedHashMap<String,Integer>(); 
        bill_april.put("suresh", 200);
        bill_april.put("mukesh", 100); 
        bill_april.put("ganesh", 100);
        bill_april.put("pranay", 100);
        var totalBill = new LinkedHashMap<String, Integer>();

        for (Map.Entry<String, Integer> e bill_march.entrySet()) 
            totalBill.put (e.getKey(), e.getValue());

        for (Map.Entry<String, Integer> e: bill_april.entrySet())
            totalBill.merge(e.getKey(), e.getValue(), (x, y) -> y + x);

        System.out.println(totalBill);
    }
}