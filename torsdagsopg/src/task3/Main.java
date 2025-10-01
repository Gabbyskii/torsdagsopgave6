package task3;
import java.util.ArrayList;

public class Main {
    //3.g main method
    public static void main(String[] args) {
        //3.g instantiate at least three different rooms
        Room r1 = new Room(3, 4);
        Room r2 = new Room(2, 2);
        Room r3 = new Room(3, 3);
        Room r4 = new Room(2, 2);

        //3.h add rooms to collection
        ArrayList<Room> rooms = new ArrayList<>();
        rooms.add(r1);
        rooms.add(r2);
        rooms.add(r3);
        rooms.add(r4);

        //3.i instantiate new building with the rooms
        Building building = new Building(rooms, 2);

        //3.j test methods
        System.out.println("Total lamps: " + countLampsInBuilding(building));
        System.out.println("Total windows: " + countWindowsInBuilding(building));
        System.out.println("Total rooms: " + countRoomsInBuilding(building));

        //3.k test isNormal() with normal building
        System.out.println("\nIs building normal sized? " + isNormal(building));

        //3.k test with abnormal building (more floors than rooms)
        Building anormalBuilding = new Building(rooms, 5);
        System.out.println("Is abnormal building normal? " + isNormal(anormalBuilding));
    }

    //3.j count total lamps in building
    public static int countLampsInBuilding(Building building) {
        int totalLamps = 0;
        for (Room room : building.getRooms()) {
            totalLamps += room.getNumberOfLamps();
        }
        return totalLamps;
    }

    //3.j count total windows in building
    public static int countWindowsInBuilding(Building building) {
        int totalWindows = 0;
        for (Room room: building.getRooms()) {
            totalWindows += room.getNumberOfWindows();
        }
        return totalWindows;
    }

    //3.j count total rooms
    public static int countRoomsInBuilding(Building building) {
        return building.getRooms().size();
    }

    //3.k static method isNormal()
    public static boolean isNormal(Building building) {
        int numberOfFloors = building.getNumberOfFloors();
        int numberOfRooms = building.getRooms().size();
        return numberOfFloors <= numberOfRooms;
    }
  }
