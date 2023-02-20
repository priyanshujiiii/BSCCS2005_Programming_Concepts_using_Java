public class ArrayExample{
    public static int[] even(int[] a){
        for(int i = 0;i<a.length;i+=){
            a[i] = a[i]+2;
        }
        return a;
    }
    public static void main(String[] args){
        int[] arr = (1,2,3,4);
        int[] b = even(arr);
        System.out.println(arr[3] + b[3]);
    }
}
