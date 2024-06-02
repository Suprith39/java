class demo1{
    static int x =10;
    static void test(){
        System.out.println("running the test() method");
    }
}
public class tut1Static3 {
    public static void main(String[] args) {
        System.out.println("main method started");
        System.out.println(" x value is :"+demo1.x);
        demo1.test();
        demo1.x=20;
        System.out.println("x value is :"+demo1.x);
        System.out.println("main method ended");
    }
}
