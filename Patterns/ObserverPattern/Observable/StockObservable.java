package Patterns.ObserverPattern.Observable;
import Patterns.ObserverPattern.Observer.NotificationAlertObserver;

public interface StockObservable {
   public void add(NotificationAlertObserver observer);
   public void remove(NotificationAlertObserver observer);
   public void notifyMe();
   public void SetStockCount(int newStockadded);
   public int getStockCount();

    
}
