package DesignPatterns.ObserverDesignPattern.Observable;


import DesignPatterns.ObserverDesignPattern.Observer.DisplayObserver;

import java.util.List;

public class WeatherObservableImpl implements WeatherObservable{

    List<DisplayObserver> observerList;
    int currentTemperature;
    @Override
    public void add() {
        //

    }

    @Override
    public void remove() {
        //remove from the object
    }

    @Override
    public void notifyAllObservers() {
        for(DisplayObserver displayObserver:observerList){
            //do something;
            System.out.println("displayObserver notified done");
        }
    }

    @Override
    public void updateTemperature(int temperature) {
        currentTemperature= temperature;
        notifyAllObservers();
    }
}
