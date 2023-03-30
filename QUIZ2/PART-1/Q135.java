import java.util.*; 
public class MapEx {

    TreeMap<String, String> map-new TreeMap<String, String>(); 
    public void addToMap (String key,String value){ 
        map.put(key,//_____________*);
    
    //LINE-1
    
    }
    
    public static void main(String[] args) {
        MapEx obj=new MapEx();
        obj.addToMap("India","Sachin"); 
        obj.addToMap("India", "Sehwag");
        obj.addToMap("Sri Lanka", "Hasaranga");
        obj.addToMap("Sri Lanka", "Asalanka"); 
        for (Map.Entry<String, String> entry:obj.map.entrySet()) {
            System.out.println(entry.getKey()+"-->"+entry.getValue());
        }
    }
}
