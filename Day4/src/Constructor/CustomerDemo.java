
package Constructor;

import java.util.Scanner;

public class CustomerDemo {
	

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name, city;
        int id;

        // Input for Customer 1 (using default constructor)
        System.out.println("Enter Customer Id:");
        id = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        System.out.println("Enter Customer Name:");
        name = sc.nextLine();

        System.out.println("Enter Customer City:");
        city = sc.nextLine();
        System.out.println();

        Customer c1 = new Customer();  // Using default constructor
        c1.setCustomerId(id);
        c1.setCustomerName(name);
        c1.setCustomerCity(city);
        System.out.println(c1);
        System.out.println();

        // Input for Customer 2 (using parameterized constructor)
        System.out.println("Enter Customer Id:");
        id = sc.nextInt();
        sc.nextLine(); // Consume leftover newline

        System.out.println("Enter Customer Name:");
        name = sc.nextLine();

        System.out.println("Enter Customer City:");
        city = sc.nextLine();
        System.out.println();

        Customer c2 = new Customer(name, id, city); // Using parameterized constructor
        System.out.println(c2);
        System.out.println();

        // Displaying individual details using getters
        System.out.println("Customer 2 City: " + c2.getCustomerCity());
        System.out.println("Customer 2 ID: " + c2.getCustomerId());
        System.out.println("Customer 2 Name: " + c2.getCustomerName());

        sc.close();
    }
}
