
package Patterns.ObserverPattern.Observable;
import Patterns.ObserverPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;
public class IphoneObservableimpl implements StockObservable {
    List<NotificationAlertObserver> listOfUsers=new ArrayList<>() ;
    public int stockcount=0;
    public void add(NotificationAlertObserver observer){
        listOfUsers.add(observer);

    }
    public void remove(NotificationAlertObserver observer){
        listOfUsers.remove(observer);
    }
    public void notifyMe(){
        for(NotificationAlertObserver obj:listOfUsers ){
            obj.update();
        }
    }
    public void SetStockCount(int newvalue){
        if(stockcount==0){
            notifyMe();
        }
        stockcount=newvalue;
    }
   public int getStockCount(){
    return stockcount;
   }
    
    
    
}
