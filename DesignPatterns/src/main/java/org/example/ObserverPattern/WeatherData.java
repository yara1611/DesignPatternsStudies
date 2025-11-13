package org.example.ObserverPattern;
import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;

public class WeatherData extends Observable{
    //add observers
    //private ArrayList observers;
    public WeatherData(){

    }
    //get humidity, temperature, pressure data
    private float temp;
    private float humidity;
    private float pressure;

    //update changed data
    public void measurementsChanged(){
        //update displays
        setChanged();
        notifyObservers();
    }

    public float getTemp() {
        return temp;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void setMeasurements(float temp, float humidity, float pressure){
        this.temp=temp;
        this.humidity=humidity;
        this.pressure=pressure;
        measurementsChanged();
    }
}
