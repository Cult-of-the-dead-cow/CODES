package hackerrank1;

public class StringMethods {
    public static void main(String args[]) {
        String str = new String();
        str= "Welcome to NICT 15!";
        try {
            char ch = str.charAt(0);
            System.out.println("char at 0 index: "+ch);
            ch  = str.charAt(2);
            System.out.println("char at 2 index: "+ch);
            
        }
        catch(IndexOutOfBoundsException ex) {
            System.out.println("Exception!" + ex.getMessage());
        }
    }
}
