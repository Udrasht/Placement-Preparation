package Patterns.ObserverPattern;

import Patterns.ObserverPattern.Observable.IphoneObservableimpl;
import Patterns.ObserverPattern.Observable.StockObservable;
import Patterns.ObserverPattern.Observer.EmailAlertObserver;
import Patterns.ObserverPattern.Observer.MobileAlertObserver;
import Patterns.ObserverPattern.Observer.NotificationAlertObserver;

public class main {
    public static void main(String args[]){
        StockObservable iphoneObservableimp=new IphoneObservableimpl();
        NotificationAlertObserver observer1=new EmailAlertObserver("Udrasht@gmail.com", iphoneObservableimp);
        NotificationAlertObserver observer2=new EmailAlertObserver("udrasht.pal@gmail.com", iphoneObservableimp);
        NotificationAlertObserver observer3=new MobileAlertObserver("udrasht", iphoneObservableimp);
        iphoneObservableimp.add(observer1);
        iphoneObservableimp.add(observer2);
        iphoneObservableimp.add(observer3);
        iphoneObservableimp.SetStockCount(20);
        iphoneObservableimp.SetStockCount(0);
        iphoneObservableimp.SetStockCount(499);


    }
    
}
