package headfirstdesignpatterns.ch1;

import java.util.ArrayList;
import java.util.List;

public class TestDuck01 {
    public static void main(String[] args){
        List<Duck> ducks = new ArrayList();
        ducks.add(new MallardDuck());
        ducks.add(new RedheadDuck());
        ducks.add(new RubberDuck());

        printDucks(ducks);
    }

    private static void printDucks(List<Duck> ducks){
        for(Duck duck : ducks){
            duck.performFly();
            duck.performQuack();
        }
    }
}
