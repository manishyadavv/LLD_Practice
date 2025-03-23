package DesignPatterns.ObserverDesignPattern.example2;

import DesignPatterns.ObserverDesignPattern.example2.Observable.IphoneStockObservableImpl;
import DesignPatterns.ObserverDesignPattern.example2.Observable.StockObservable;
import DesignPatterns.ObserverDesignPattern.example2.Observer.EmailAlertObserverImpl;
import DesignPatterns.ObserverDesignPattern.example2.Observer.MobileAlertObserverImpl;
import DesignPatterns.ObserverDesignPattern.example2.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String args[]){
        StockObservable iphoneStockObservable = new IphoneStockObservableImpl();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("abc@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("abc12@gmail.com",iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("0000000000",iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);

    }
}
