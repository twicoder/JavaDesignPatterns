package headfirstdesignpatterns.ch1;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Fly with Wings...");
    }
}
