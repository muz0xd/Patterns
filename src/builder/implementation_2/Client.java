package builder.implementation_2;

// The client is the director now.

public class Client {

    public static void main(String[] args) {
        System.out.println("***Builder pattern Demo2(Using method chaining)");
        
        // Making a car
        Builder builder = new CarBuilder();
        Vehicle vehicle = builder.buildBody()
                .insertWheels()
                .addBrandName()
                .getVehicle();
        vehicle.showProduct();
        
        // Making a motorcycle
        builder = new MotorCycleBuilder();
        vehicle = builder.addBrandName()
                .buildBody()
                .insertWheels()
                .getVehicle();
        vehicle.showProduct();
    }
}
