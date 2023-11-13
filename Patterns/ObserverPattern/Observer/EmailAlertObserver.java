package Patterns.ObserverPattern.Observer;

import Patterns.ObserverPattern.Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{
    String email;
    StockObservable observer;
    public EmailAlertObserver(String email,StockObservable observer){
        this.observer=observer;
        this.email=email;
    }
    public void update(){
        sendmail(email,"Product is in Stock hurry up!");
    }
    private void sendmail(String email,String message){
        System.out.println("mail sent to:" + email+" Message: "+message);
    }
    
}
