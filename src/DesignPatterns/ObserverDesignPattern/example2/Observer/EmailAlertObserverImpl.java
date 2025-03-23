package DesignPatterns.ObserverDesignPattern.example2.Observer;

import DesignPatterns.ObserverDesignPattern.example2.Observable.StockObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

        String emailId;

        StockObservable stockObservable;
        // Basically we are doing constructor injection here, we could have passed object in update method below from
        // stockObservable class but it was clumsy and we had to check the object as well
        public EmailAlertObserverImpl(String emailId, StockObservable stockObservable){
                this.emailId=emailId;
                this.stockObservable=stockObservable;
        }

        @Override
        public void update() {
                sendEmail(emailId, "Iphone stock is available now");
        }

        private void sendEmail(String emailId, String message){
                System.out.println("Email sent to:"+ emailId);
        }
}
