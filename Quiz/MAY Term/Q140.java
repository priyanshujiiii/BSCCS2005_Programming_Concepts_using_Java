public class Test{
    public static void show(){
        for(int i=0; i<5;i++){
            switch(i){
                case 1:
                    System.out.println(1 + " ")
                case 2:
                    System.out.println(2 + " ")
                case 3:
                    System.out.println(3 + " ")
                default:
                    System.out.print("wrong number");
                break;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        show();
    }
}
