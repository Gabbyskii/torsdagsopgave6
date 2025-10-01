package task2;

public class Main {
    //2.b main method
    public static void main(String[] args) {
        //2.g create cafe instance and loadmenu data
        Cafe cafe = new Cafe();
        cafe.loadMenuData();

        //2.h print all coffees from menu
        System.out.println("\nCoffee Menu: ");
        for (String coffee: cafe.getCoffeeMenu()) {
            System.out.println(coffee);
        }
    }
}