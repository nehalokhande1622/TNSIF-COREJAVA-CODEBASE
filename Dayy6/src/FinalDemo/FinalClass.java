// File: FinalDemo.java
package FinalDemo;

// Declare the class as final so it can't be inherited
public final class FinalClass {
    void show() {
        System.out.println("Final class cannot be inherited");
    }

    public static void main(String[] args) {
        FinalClass f = new FinalClass();
        f.show();
    }
}
