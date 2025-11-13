package org.example.ObserverPattern;
import java.util.Observable;
import java.util.Observer;
public class CurrentConditionDisplay implements Observer,DisplayElement{

    //get measurements
    Observable observable;
    private float temp;
    private float humidity;
    private float pressure;
    //private Subject weatherData;

    public CurrentConditionDisplay(Observable observable){
        //this.weatherData=weatherData;
        //this display is an observer
        this.observable=observable;
        //weatherData.registerObserver(this);
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current Conditions: "+temp+" F degrees and "+humidity+" % humidity");
    }

//    @Override
//    public void update(float temp, float humidity,float pressure) {
//            this.temp=temp;
//            this.humidity=humidity;
//            display();
//    }
    public void update(Observable obs, Object arg){
        if(obs instanceof WeatherData){
            WeatherData weatherData = (WeatherData)obs ;
            this.temp=weatherData.getTemp();
            this.humidity=weatherData.getHumidity();
            display();
        }
    }
}
