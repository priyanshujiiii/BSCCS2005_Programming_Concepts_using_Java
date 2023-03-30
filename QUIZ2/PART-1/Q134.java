import java.util.*; 
class Example{

    ArrayList<Integer> list1 = new ArrayList<Integer>();
    ArrayList<Integer> list2 = new ArrayList<Integer>();
    public boolean property (int num) { 
        //return true if num is prime otherwise return false
    } 
    public void iterateList (ArrayList<Integer> inputlist) {

        Iterator<Integer> it =inputlist.iterator();
        while (it.hasNext()) {
            int element=it.next(); 
            if (element%2==0) {
                list1.add(element);
            }
            else {
                if (property (element)) 
                    it.remove();
                else{   
                    list2.add(element);
            }
        }
        System.out.println(list1+"\n" +list2);
    }
}

public class IteratorTest{
    public static void main (String[] args) { 
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i= 2; i < 15; i++)
            list.add(i);
        Example obj = new Example(); 
        obj.iterateList(list);
    }
}
