package prototype.implementation_2;

import java.util.Random;

public class Ford extends BasicCar {
    public Ford(String modelName) {
        this.modelName = modelName;
        basePrice = 40000;
        onRoadPrice = basePrice + (new Random()).nextInt(1000);
    }
    
    @Override
    public BasicCar clone() throws CloneNotSupportedException {
        return (Ford) super.clone();
    }
    
    @Override
    public String toString() {
        return "Model: "+modelName+"\nPrice: "+onRoadPrice;
    }
}
