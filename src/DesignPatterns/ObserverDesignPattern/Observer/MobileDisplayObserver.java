package DesignPatterns.ObserverDesignPattern.Observer;

import DesignPatterns.ObserverDesignPattern.Observable.WeatherObservable;

public class MobileDisplayObserver implements DisplayObserver{

    WeatherObservable weatherObservable;

    MobileDisplayObserver(WeatherObservable weatherObservable){
        this.weatherObservable=weatherObservable;
    }
    @Override
    public void update() {

    }
}
