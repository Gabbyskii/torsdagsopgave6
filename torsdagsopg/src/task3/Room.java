package task3;
//3.a attributes
public class Room {
    private int numberOfLamps;
    private int numberOfWindows;

    //3.b constructor
    public Room(int numberOfLamps, int numberOfWindows) {
        this.numberOfLamps = numberOfLamps;
        this.numberOfWindows = numberOfWindows;
    }

    //3.c getter & setter methods
    public int getNumberOfLamps() {
        return numberOfLamps;
    }

    public int getNumberOfWindows() {
        return numberOfWindows;
    }

    public void setNumberOfLamps(int numberOfLamps) {
        this.numberOfLamps = numberOfLamps;
    }

    public void setNumberOfWindows(int numberOfWindows) {
        this.numberOfWindows = numberOfWindows;
    }


}
