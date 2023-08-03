package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Company {
    
    List<Observer> observerList = new ArrayList<>();
    
    private String name;
    
    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    
    private int stockPrice;

    public int getStockPrice() {
        return this.stockPrice;
    }
    
    public void setStockPrice(int stockPrice) {
        this.stockPrice = stockPrice;
        notifyRegisteredUsers();
    }
    
    abstract void register(Observer o);
    
    abstract void unRegister(Observer o);
    
    abstract void notifyRegisteredUsers();

}
