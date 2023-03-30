import java.util.*;
class Address implements Cloneable{
    private String city;
    private int pinCode;
    // constructor here to instantiate city, pincode
    public void setCity(String c){
        city = c;
    }
}

class Temple implements Cloneable{
    private Address adr;
    private String tempName;
    // constructor here to instantiate adr, templame
    public Address getAddress(){
        return adr;
    }

    public void setTempName (String t) { 
        tempName= t;
    }
    public Temple clone() throws CloneNotSupportedException{
        Temple t =  (Temple) super.clone();
        return t;
    }

}

//Overrides the method toString()

// to return tempName+:+ city+ ":" + pinCode;

public class Main{
    public static void main(String[] args) { 
        Temple t1 = new Temple(new Address ("Madurai", 625001), "Meenakshi temple");

        try{   
            Temple t2=t1.clone();
            t2.setTempName ("Golden temple");
            t2.getAddress().setCity("Amritsar");
            System.out.println(t1);
            System.out.println(t2);

        }

        catch (CloneNotSupportedException e){ 
            System.out.println("Cloning not supported");
        }
    }
}