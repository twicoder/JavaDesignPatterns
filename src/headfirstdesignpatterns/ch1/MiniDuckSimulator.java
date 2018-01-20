package headfirstdesignpatterns.ch1;

public class MiniDuckSimulator {
    public static void main(String[] args){
        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
