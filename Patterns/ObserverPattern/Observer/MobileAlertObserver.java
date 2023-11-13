package Patterns.ObserverPattern.Observer;

import Patterns.ObserverPattern.Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver {
    String userName;
    StockObservable observer;
    public MobileAlertObserver(String userName,StockObservable observer){
        this.observer=observer;
        this.userName=userName;
    }
    public void update(){
        sendMessage(userName,"Product is in Stock hurry up !!");
    }
    private void sendMessage(String userName,String message){
        System.out.println("USer Name:" + userName+" Message: "+message);
    }
    
}
