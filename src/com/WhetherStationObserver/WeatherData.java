package com.WhetherStationObserver;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList observers = new ArrayList();
    private Integer temp;
    private Integer humidity;
    private Integer presser;

    @Override
    public void registerObserver(ObserverWeather observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(ObserverWeather observer) {
        Integer i = observers.indexOf(observer);
        if (i >= 0) {
            observers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i = 0; i < observers.size(); i++) {
        ObserverWeather observerWeather = (ObserverWeather) observers.get(i);
        observerWeather.update(temp, humidity, presser);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(int temp, int humidity, int presser){
        this.humidity = humidity;
        this.presser = presser;
        this.temp = temp;
        measurementsChanged();
    }


}
