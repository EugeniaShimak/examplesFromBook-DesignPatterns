package com.WhetherStationJavaObserver;
import java.util.Observer;
import java.util.Observable;

public class CurrentConditionsDisplay implements Display, Observer {
    Observable observable;
    private int humidity;
    private int temp;
    private int presser;

    public CurrentConditionsDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("CurrentConditionsDisplay: "+"temp = "+temp+", humidity = "+humidity+", presser = "+presser);
    }


    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData){
            WeatherData weatherData = (WeatherData) o;
            this.temp = weatherData.getTemp();
            this.humidity = weatherData.getHumidity();
            this.presser = weatherData.getPresser();
            display();
        }
    }
}
