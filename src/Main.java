public class Main {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();

        System.out.println("Gas Car ");
        Car gasCar = factory.createCar("gas");
        gasCar.start();
        gasCar.accelerate();
        gasCar.accelerate();
        gasCar.brake();
        gasCar.stop();


        System.out.println("Electric Car");
        Car electricCar = factory.createCar("electric");
        electricCar.start();
        electricCar.accelerate();
        electricCar.stop();


        System.out.println("Hybrid Car");
        Car hybridCar = factory.createCar("hybrid");
        hybridCar.start();
        hybridCar.accelerate();
        hybridCar.accelerate();
        hybridCar.brake();
        hybridCar.stop();


        System.out.println("Replace Engine");
        factory.replaceEngine(gasCar, "electric");
        System.out.println("Engine replaced to: " + gasCar.getEngine().getType());


    }
}