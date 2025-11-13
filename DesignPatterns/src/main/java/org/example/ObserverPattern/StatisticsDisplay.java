package org.example.ObserverPattern;
import java.util.Observer;
import java.util.Observable;
public class StatisticsDisplay implements Observer,DisplayElement{


    private float temp;
    private float humidity;
    Observable observable;

    public StatisticsDisplay(Observable observable){
        this.observable=observable;
        observable.addObserver(this);

    }

//    @Override
//    public void update(float temp, float humidity, float pressure) {
//
//        display();
//    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData = (WeatherData)o;

            this.temp=weatherData.getTemp();
            this.humidity=weatherData.getHumidity();
            display();
        }

    }

    @Override
    public void display() {
        System.out.println("Current Conditions: "+temp+" F degrees and "+humidity+" % humidity");
    }
}
