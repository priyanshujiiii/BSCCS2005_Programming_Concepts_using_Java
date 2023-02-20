public class University{
    public void checOpeningDate(){
        Department d = new Department();
        System.out.println("Institute opening date is "+ d.openingDate());
    }
    private class Department{
        public String openingDate(){
            return "20th April 2022";
        }
    }
}
public class Example{
    public static void main(String[] args){
        University u = new University();
        u.checkOpeningDate();
    }
}
