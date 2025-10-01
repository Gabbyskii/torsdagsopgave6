package task1;

public class Customer {
    //1.a
    String firstName;
    String lastName;
    String username;
    int id;
    static int counter;

    //1.b constructor
    public Customer(String firstName, String lastName, String username) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.id = counter;
        counter++; //1.c counter+1
    }
//1.d getter + settere + toString() at bottom
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String toString() {
        return "Customer info: " + id +" "+ firstName +" "+ lastName +" "+ " Username: " + username;
    }
}
