package builder.implementation_1;

public class MotorCycle extends Vehicle {
    String brandName;
    
    public MotorCycle(String brandName) {
        this.brandName = brandName;
        System.out.println("\nWe are about to make a " + brandName + " motorcyle.");
    }
}
