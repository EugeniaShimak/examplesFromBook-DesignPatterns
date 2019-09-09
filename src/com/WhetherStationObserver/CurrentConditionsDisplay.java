package com.WhetherStationObserver;

public class CurrentConditionsDisplay implements Display, ObserverWeather{
    int humidity;
    int temp;
    int presser;
    Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {

    }

    @Override
    public void update(Integer temp, Integer humidity, Integer presser) {
        this.humidity = humidity;
        this.temp = temp;
        this.presser = presser;
        display();
        System.out.println("CurrentConditionsDisplay: "+"temp = "+temp+", humidity = "+humidity+", presser = "+presser);
    }
}
