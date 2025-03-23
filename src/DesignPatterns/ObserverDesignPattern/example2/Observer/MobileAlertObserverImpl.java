package DesignPatterns.ObserverDesignPattern.example2.Observer;

import DesignPatterns.ObserverDesignPattern.example2.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{

    String mobileNumber;

    StockObservable stockObservable;
    // Basically we are doing constructor injection here, we could have passed object in update method below from
    // stockObservable class but it was clumsy and we had to check the object as well
    public MobileAlertObserverImpl(String mobileNumber, StockObservable stockObservable){
        this.mobileNumber=mobileNumber;
        this.stockObservable=stockObservable;
    }

    @Override
    public void update() {
        sendSms(mobileNumber, "Iphone stock is available now");
    }

    private void sendSms(String mobileNumber, String message){
        System.out.println("Message sent to:"+ mobileNumber);
    }
}

