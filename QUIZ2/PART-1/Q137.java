class AssertPositive{
    public static boolean assertPos(int a){ 
        assert a > 0: "a should not be negative";
        return true;
    }
}

class AssertNonZero{
    public static boolean assertNonZero (int b) { 
        assert b != 0: "b should not be zero";
        return true;
    }
}

//LINE-2

public class AssertionTest {
    public static void main(String args){
        int a = -1;
        int b = 0;
        int result = 0;
        if (AssertPositive.assertPos(a) && AssertNonZero.assertNonZero(b)) 
            result= a-b; //LINE-3
        System.out.println(result);
    }
}