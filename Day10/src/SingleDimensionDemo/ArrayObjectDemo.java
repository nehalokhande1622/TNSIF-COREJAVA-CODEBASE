// File: ArrayObjectDemo.java
package SingleDimensionDemo;

public class ArrayObjectDemo {

    public static void main(String[] args) {

        Student[] arr;

        // Allocate memory for 5 Student objects
        arr = new Student[5];

        arr[0] = new Student(101, "Heti");
        arr[1] = new Student(102, "Zeel");
        arr[2] = new Student(103, "Aditya");
        arr[3] = new Student(104, "Rahul");
        arr[4] = new Student(105, "Akshay");
       

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element at index " + i + ": " +
                arr[i].getRollNo() + "\t" + arr[i].getName());
        }
    }
}
