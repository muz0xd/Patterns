package decorator;

public class SwimingPool extends Luxury {

    public SwimingPool(Home home) {
        super(home);
        this.luxuryCost = 55000;
        System.out.println("For a swiming pool, you pay an extra $" + this.luxuryCost);
    }
    
    @Override
    public double getPrice() {
        return super.getPrice() + luxuryCost;
    }

}
