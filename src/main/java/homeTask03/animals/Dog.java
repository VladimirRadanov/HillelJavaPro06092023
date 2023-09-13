package homeTask03.animals;

public class Dog extends Animal {
    private static int counter = 0;

    public Dog(String name) {
        super(name);
        counter++;
        setRunLimit(500);
        setSwimLimit(10);
    }

    public static int getCounter(){
        return counter;
    }

}
