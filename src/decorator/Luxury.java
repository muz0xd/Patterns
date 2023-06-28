package decorator;

abstract class Luxury extends Home {
    
    protected Home home;
    public double luxuryCost;
    
    public Luxury(Home home) {
        this.home = home;
    }

    //TODO try to comment method - is unnecessary?
    @Override
    public double getPrice() {
        return home.getPrice();
    }

}
