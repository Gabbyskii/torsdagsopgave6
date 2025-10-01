package task1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //1.e arraylist + instances:
        ArrayList<Customer> customers = new ArrayList<>();
        customers.add(new Customer("Lucia", "Castillo.", "lucia.c"));
        customers.add(new Customer("Jason", "Duval.", "jason.d"));
        customers.add(new Customer("Tommy", "Vercetti.", "tom.cetti"));

        //call method
        printCustomers(customers);
    }

    public static void printCustomers(ArrayList<Customer> customers) {
        System.out.println("All customers: ");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}