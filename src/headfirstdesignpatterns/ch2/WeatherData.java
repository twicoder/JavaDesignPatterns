package headfirstdesignpatterns.ch2;

import java.util.ArrayList;
import java.util.Observable;

public class WeatherData extends Observable {

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }


    public WeatherData() {
    }


    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    private float temperature;
    private float humidity;
    private float pressure;
}
