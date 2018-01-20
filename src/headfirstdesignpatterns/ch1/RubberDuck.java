package headfirstdesignpatterns.ch1;

public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    public void display(){
        System.out.println("RubberDuck.display()");
    }
}
