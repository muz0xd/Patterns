package observer;

public class Customer implements Observer {
    String nameOfObserver;
    
    public Customer(String name) {
        this.nameOfObserver = name;
    }

    @Override
    public void getNotification(Company company) {
        System.out.println(nameOfObserver + " is notified from " + company.getName());
        System.out.println("It's current stock price is:$" + company.getStockPrice());
    }

    @Override
    public String getObserverName() {
        return nameOfObserver;
    }

}
