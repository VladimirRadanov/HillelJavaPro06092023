public class Car {
    public void start() {
        startElectricity();
        startCommand();
        startFuelSystem();
    }

    private void startElectricity() {
        System.out.println("Starting Electricity");
    }

    private void startCommand() {
        System.out.println("Stating Command");
    }

    private void startFuelSystem() {
        System.out.println("Starting Fuel System");
    }

}
