package com.WhetherStationJavaObserver;

import java.util.Observer;
import java.util.Observable;

public class WeatherData extends Observable {
    private Integer temp;
    private Integer humidity;
    private Integer presser;

//    public WeatherData() {}


    public void measurementsChanged(){
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(int temp, int humidity, int presser){
        this.humidity = humidity;
        this.presser = presser;
        this.temp = temp;
        measurementsChanged();
    }

    public Integer getTemp() {
        return temp;
    }

    public Integer getHumidity() {
        return humidity;
    }

    public Integer getPresser() {
        return presser;
    }
}
