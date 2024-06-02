class demo2{
    int y =25;
    int x=10;
    void disp(){
        System.out.println("running disp() method");

    }
    void test(){
        System.out.println("test() function  started");
        System.out.println(new demo2().x);
        new demo2().x=20;
        System.out.println(new demo2().x);
    }
}
public class tut1nonStatic {
    public static void main(String[] args) {
        System.out.println("main method started");
        System.out.println("y value is :"+ new demo2().y);
        new demo2().disp();
        new demo2().test();
        System.out.println("main method ended");

    }
}
