package decorator;

public abstract class Home {
    public double basePrice;
    public double additionalCost;
    
    public Home() {
        this.basePrice = 100000.0;
        this.additionalCost = 0;
    }
    
    public abstract double getPrice();
}
