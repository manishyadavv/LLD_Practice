package DesignPatterns.ObserverDesignPattern.example2.Observable;

import DesignPatterns.ObserverDesignPattern.example2.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservableImpl implements StockObservable{

    List<NotificationAlertObserver> observers = new ArrayList<>();

    int iphoneStockCount;



    @Override
    public void add(NotificationAlertObserver observer) {
//        check if not present add
        observers.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        //check if present
        observers.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for(NotificationAlertObserver notificationAlertObserver : observers){
            //call update function
            // we are calling notification interface obj which eventually calls both
            // classes implementing it to do update and we get the Observable object there
            // in its constructor as it passed as reference
            notificationAlertObserver.update();
        }
    }

    @Override
    public void setStockCount(int stockCount) {

        //because stock count is updated so we call all the observers
        if(iphoneStockCount==0) {
            notifySubscribers();
        }
        iphoneStockCount=iphoneStockCount+stockCount;
    }

    @Override
    public int getStockCount() {
        return iphoneStockCount;
    }
}
