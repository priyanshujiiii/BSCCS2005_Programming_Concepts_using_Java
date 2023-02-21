interface Transferable{
    public void transfer();
}
interface Recievable{
    public void receive();
    public default void sanityCheck(){
        System.out.println("Checks receipt details");
    }
}
class BankAccount implements Transfarable, Receivable{
    public void transfer(){
        System.out.println("Transfers Money")
    }
