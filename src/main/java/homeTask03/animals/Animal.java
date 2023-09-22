package homeTask03.animals;

public abstract class Animal {
    private String name;

    private int runLimit;
    private int swimLimit;
    private static int counter = 0;

    public Animal(String name) {
        this.name = name;
        counter++;
    }

    public void run(int distance) {
        action("ran", distance, runLimit);
    }

    public void swim(int distance) {
        action("swam", distance, swimLimit);
    }

    private void action(String action, int distance, int distanceLimit) {
        if (distance > 0 && distance <= distanceLimit) {
            System.out.println(name + " " + action + " " + distance + " m");
        } else {
            System.out.println("Distance should be up to " + distanceLimit);
        }
    }

    public static int getAnimalsCounter() {
        return counter;
    }

    public void setRunLimit(int runLimit) {
        this.runLimit = runLimit;
    }

    public void setSwimLimit(int swimLimit) {
        this.swimLimit = swimLimit;
    }

    public String getName() {
        return name;
    }
}
