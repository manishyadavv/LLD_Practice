package DesignPatterns.ObserverDesignPattern.example2.Observable;

import DesignPatterns.ObserverDesignPattern.example2.Observer.NotificationAlertObserver;

public interface StockObservable {

    public void add(NotificationAlertObserver observer);

    public void remove(NotificationAlertObserver observer);

    public void notifySubscribers();

    public void setStockCount(int stockCount);

    public int getStockCount();
}
