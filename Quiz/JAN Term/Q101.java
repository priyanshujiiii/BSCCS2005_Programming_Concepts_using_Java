public class Data{
    private int d;
    public Data(){
        this.d = 10;
    }
    public Data(Data t){
        this.d = t.d;
    }
    public void setD(int d){
        this.d =d;
    }
    public int getD(){
        return d;
    }
}
public class Fclass{
    public static void main(String[] args){
        Data dObj1 = new Data();
        Data dObj2 = dObj1;
        Data dObj3 = new Data(dObj1);
        dObj1.setD(20);
        System.out.println("dObj2.d : "+ dObj2.getD());
        System.out.println("dObj3.d : "+ dObj3.getD());
    }
}
