public abstract class   Engine {
    protected double speedEngine;
    public void increase()
    {
        speedEngine+=1;
    }
    public void decrease()
    {
        if(speedEngine >0)
        {
            speedEngine -=1;
        }
    }

    public double getSpeedEngine() {
        return speedEngine;
    }

    public void setSpeedEngine(double speedEngine) {
        this.speedEngine = speedEngine;
    }
    public abstract String getType();
}
