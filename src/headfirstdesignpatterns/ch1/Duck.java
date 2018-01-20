package headfirstdesignpatterns.ch1;
// 策略模式：定义了算法族，分别封装起来，让他们之间
// 可以相互替换，此模式让算法的变化独立于使用算法的客户


public abstract class Duck {

    public void swim(){
        System.out.println("Duck.swim()");
    }
    public abstract void display();

    public void performFly(){
        flyBehavior.fly();
    }

    public void performQuack(){
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
}
