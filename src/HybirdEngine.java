public class HybirdEngine  extends  Engine{
    private  ElerticEngine elerticEngine;
    private GasEngine gasEngine;

    public HybirdEngine(ElerticEngine elerticEngine, GasEngine gasEngine) {
        this.elerticEngine = elerticEngine;
        this.gasEngine = gasEngine;
    }


    public  void increase()
    {
        speedEngine += 1;
        if(speedEngine < 50) {
            elerticEngine.increase();
        } else {
            gasEngine.increase();
        }
    }
    public void decrease()
    {
        if(speedEngine > 0) {
            speedEngine -= 1;
            if(speedEngine < 50) {
                elerticEngine.decrease();
            } else {
                gasEngine.decrease();
            }
        }
    }

    @Override
    public String getType() {
        return "Hybird";
    }
}
