package com.WhetherStationJavaObserver;

public interface Subject {
    public void registerObserver(ObserverWeather observer);
    public void removeObserver(ObserverWeather observer);
    public void notifyObservers();
}
