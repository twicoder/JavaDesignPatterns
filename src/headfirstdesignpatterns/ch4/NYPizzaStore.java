package headfirstdesignpatterns.ch4;

public class NYPizzaStore extends PizzaStore {
    @Override
    Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new NYStyleCheesePizza();
        } else if (type.equals("veggle")){
            return new NYStyleVegglePizza();
        } else if(type.equals("clam")){
            return new NYStyleClamPizza();
        } else {
            return null;
        }
    }
}
