package Encapsulationn;


public class OopsConceptDemo {

    // Private fields (encapsulation)
    private String name;
    private int age;
    private int serialNum;

    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter for serial number
    public int getSerailNum() {
        return serialNum;
    }
    public void setSerailNum(int serialNum) {
        this.serialNum = serialNum;
    }

    // toString() method to display object info
    @Override
    public String toString() {
        return "Name: " + name + "\nAge: " + age + "\nSerial Number: " + serialNum;
    }
}

