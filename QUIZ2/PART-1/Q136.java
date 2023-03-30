class InvalidIndexException extends Exception{
    public InvalidIndexException() { 
        super("invalid exception");
    }
}

public class Main {

    public static void getSubString(String a, int s, int e) throws StringIndexOutOfBoundsException{
        try {

            if (s > e)
                throw new InvalidIndexException(); 
            else
                System.out.println(a.substring(s, e));
        }
        catch(InvalidIndexException ie) { 
            StringIndexOutOfBoundsException ne;
            ne = new StringIndexOutOfBoundsException("string inder out of bound");  
            ne.initCause(ie);
            throw ne;
        }
    }


    public static void main(String[] args) {
        try {
            getSubString("Java program", 5, 0);
        }
        catch (StringIndexOutOfBoundsException se) { 
            System.out.println(se.getMessage()); 
            System.out.println(se.getCause().getMessage());
        }
    }
}