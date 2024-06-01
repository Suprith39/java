public class tut2Static {
    static int x =100;
    static void test(){
        System.out.println("running test() function");
        System.out.println("x value is :"+x);
       int x=200;
       System.out.println("x value is :"+x);
       x=300;
    }
    public static void main(String[] args) {
        System.out.println("main method started");
        test();
        System.out.println("x value is :"+x);
        System.out.println("main method ended");
    }
}
