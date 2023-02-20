import java.util.*;
public interface Enquiry{
    public void checkSlot(Date d);
}
public class VaccineRegistration{
    private AadhaarNumber;
    private void setAadhaarNumber(int x){
        AadhaarNumber = x;
    }

    /*----------- method isValid() will be defined here --------*/
    public Enquiry checkDetails(){
        if(isValid())//check if aadhaar is valid
            return new PassedEnquiry();
        return new FailedEnquiry();
    }
    private class PassedEnquiry implements Enquiry{
        /*--------- method is available() will be defined here ------*/
        public void checkSlot(Date d){
            if(isAvailable(Date d)){
                System.out.println("Registration successful")
            }
            else
                System.out.println("Slot not available");
        }
    }
    private class FailedEnquiry implements Enquiry{
        public void checkSlot(Date d){
            System.out.println("Invalid Aadhaar Number");
        }
    }
}
public class Candidate{
    public static void main(String[] args){
        VaccineRegistration v = new VaccineRegistration();
        v.setAadhaarNumber(44557);
        Date dt = new Date(2022,1,30);

    }
}
