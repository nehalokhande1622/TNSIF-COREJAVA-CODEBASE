package Overloading;

public class OverLoadingDemo {

    public static void main(String[] args) {
        
        Point p = new Point(); // default constructor
        System.out.println(p);
        
        Point p1 = new Point(20.09f, 23.45f); // parameterized constructor
        System.out.println(p1);
        
        System.out.println("---Method Overloading---");
        System.out.println(MethodOverLoding.addition(3.14f, 23.67f)); // float addition
        System.out.println(MethodOverLoding.addition(1, 2, 3));       // int addition

    }

}
