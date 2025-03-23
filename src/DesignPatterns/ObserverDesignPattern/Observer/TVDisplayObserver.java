package DesignPatterns.ObserverDesignPattern.Observer;

import DesignPatterns.ObserverDesignPattern.Observable.WeatherObservable;

public class TVDisplayObserver implements DisplayObserver{

    WeatherObservable weatherObservable;

    TVDisplayObserver(WeatherObservable weatherObservable){
        this.weatherObservable=weatherObservable;
    } 
    @Override
    public void update() {

    }
}
