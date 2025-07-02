package Encapsulationn;

import Encapsulationn.OopsConceptDemo;

public class EncapsulationDemo{

    public static void main(String[] args) {
        
        // Creating object of OopsConceptDemo
        OopsConceptDemo obj = new OopsConceptDemo();
        
        // Setting values using setters
        obj.setName("Shubham");
        obj.setAge(23);
        obj.setSerailNum(1001);

        // Printing object using toString
        System.out.println(obj);
    }
}