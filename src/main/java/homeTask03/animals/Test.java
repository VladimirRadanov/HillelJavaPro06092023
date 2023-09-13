package homeTask03.animals;

public class Test {
    public static void main(String[] args) {
        Cat murchik = new Cat("Murchik");
        Cat ryzhyk = new Cat("Ryahik");

        System.out.println("\n--- Cats ---");
        murchik.run(10);
        ryzhyk.run(300);
        ryzhyk.swim(50);

        Dog bobik = new Dog("Bobik");
        Dog sharik = new Dog("Sharik");
        Dog mukhtar = new Dog("Mukhtar");

        System.out.println("\n--- Dogs ---");
        bobik.run(300);
        bobik.run(600);
        bobik.swim(5);
        bobik.swim(100);

        System.out.println("\n--- Counters ---");
        System.out.println("The counter of Animals:" + Animal.getAnimalsCounter());
        System.out.println("The counter of Cats:" + Cat.getCounter());
        System.out.println("The counter of Dogs:" + Dog.getCounter());

    }
}
