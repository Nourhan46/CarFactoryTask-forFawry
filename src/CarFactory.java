public class CarFactory {

    public Car createCar(String engineType) {
        Engine engine = createEngine(engineType);
        return new Car(engine);
    }

    public void replaceEngine(Car car, String engineType) {
        Engine engine = createEngine(engineType);
        car.setEngine(engine);
    }

    private Engine createEngine(String engineType) {
        if(engineType.equalsIgnoreCase("gas")) {
            return new GasEngine();
        } else if(engineType.equalsIgnoreCase("electric")) {
            return new ElerticEngine();
        } else
             {
            return new HybirdEngine( new ElerticEngine() ,new GasEngine());
        }
    }
}