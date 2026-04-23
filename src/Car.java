public class Car {
    private Engine engine;
    private double speed;
    Car(Engine engine)
    {
        this.engine= engine;
    }
    public void start()
    {
        setSpeed(0);
        engine.setSpeedEngine(0);
        System.out.println("car start now and speed is zero");


    }
    public void stop()
    {
        if(engine.getSpeedEngine()>0)
        {
            System.out.println("the speed of engine should be zero  use break");
        }
        else
          System.out.println("car stopped now and speed is zero");

    }
    public void accelerate()
    {
        System.out.println("current speed " + speed);
        if( speed < 200)
        {
           speed+=20;
           for(int i=0;i<20;i++)
           {
               engine.increase();
           }
        }
        else {
            System.out.println("can't accelerate any more the max speed 200 km /h");
        }
        System.out.println("current speed " + speed);


    }
    public  void brake()
    {
        System.out.println("current speed " + speed);
        if(speed>=20)
        {
            for(double i=0;i<20;i++)
            {
                engine.decrease();
            }


        }
        else if(speed < 20)
        {
            for(double i=0;i<speed;i++)
            {
                engine.decrease();
            }
        }
        speed-=20;
        if(speed<0 ) speed=0;

        System.out.println("current speed " + speed);

    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
