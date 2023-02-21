public class Test{
    int a =1;
    long b = 1;
    boolean c = true;
    String str = "";
    public void show(){
        str += a;
        str += b;
        str += c;
        System.out.prinln(str);
    }
    public static void main(String[] args){
        new Test().show();
    }
}
