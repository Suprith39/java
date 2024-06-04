package javaClgNotes;
class demo{
    void area(int a){
        System.out.println("area of the square is :"+(a*a));
    }
    void area(float a,float b){
        System.out.println("the area of the rectangle is :"+(a*b));
    }
    void area(double a){
        System.out.println("The area of the circle is :"+(3.14*a*a));
    }
}
public class overload {
    public static void main(String[] args) {
        demo d=new demo();
        d.area(15);
        d.area(12.0f,13.0f);
        d.area(122.5);
    }
    
}
