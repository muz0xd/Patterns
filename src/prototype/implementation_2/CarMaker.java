package prototype.implementation_2;

public class CarMaker {
    BasicCar nano, ford;
    
    public CarMaker() {
//        nano = new Nano("Nano XM624 cc");
//        ford = new Ford("Ford Aspire");
    }
    
    public BasicCar getNano() throws CloneNotSupportedException {
        if(nano!=null) {
            return nano.clone();
        }
        else {
            nano = new Nano("Nano XM624 cc");
            return nano;
        }
    }
    
    public BasicCar getFord() throws CloneNotSupportedException {
        if(ford!=null) {
            return nano.clone();
        }
        else {
            ford = new Ford("Ford Aspire");
            return ford;
        }
    }
}
