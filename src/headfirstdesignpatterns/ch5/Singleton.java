package headfirstdesignpatterns.ch5;

public class Singleton {
    private volatile static Singleton uniqeInstance;

    private Singleton(){}

    public static Singleton getInstance(){
        if(uniqeInstance == null){
            synchronized (Singleton.class){
                if(uniqeInstance == null){
                    uniqeInstance = new Singleton();
                }
            }
        }
        return uniqeInstance;
    }
}
