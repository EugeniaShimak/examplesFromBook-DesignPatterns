package com.WhetherStationObserver;

public class WeatherStation {
    public static void main(String[] args) {
        System.out.println("Hi");
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        weatherData.setMeasurements(2,5,9);
        weatherData.setMeasurements(7,7,7);
        weatherData.setMeasurements(0,9,7);
    }
}
