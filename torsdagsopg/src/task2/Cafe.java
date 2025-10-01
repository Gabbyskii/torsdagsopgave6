package task2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Cafe {
    //2.c arraylist:
    private ArrayList<String> coffeeMenu;
    //constructor:
    public Cafe() {
        coffeeMenu = new ArrayList<>();
    }
   //getter:
    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }
    void loadMenuData() {
        //2.d try-catch block to read from file
        try {
            //2.c file objekt:
            File file = new File("coffees.txt");
            Scanner scan = new Scanner(file);

            //2.e loops over line of text file
            while (scan.hasNextLine()) {
                coffeeMenu.add(scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Check path and filename");
        }
    }
}
