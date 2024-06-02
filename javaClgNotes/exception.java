package javaClgNotes;

public class exception {
    public static void main(String[] args) {
        try {
            int a =Integer.parseInt(args[0]);
            int b =Integer.parseInt(args[1]);
            int res=a/b;
            System.out.println("answer is"+res);
        } catch (ArithmeticException ae) {
            System.out.println("Dividing a number zero error"+ae);
    
            // TODO: handle exception
        }
         catch (ArrayIndexOutOfBoundsException aie) {
            System.out.println("Insufficient input"+aie);
            // TODO: handle exception
        }
    }
}
