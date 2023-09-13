package homeTask03.animals;

public class Cat extends Animal {
    private static int counter = 0;

    public Cat(String name) {
        super(name);
        counter++;
        setRunLimit(200);
    }

    @Override
    public void swim(int distance) {
        System.out.println("Cat " + getName() + " can't swim");
    }

    public static int getCounter() {
        return counter;
    }
}
