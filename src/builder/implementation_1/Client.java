package builder.implementation_1;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** Builder Pattern Demostration. ***");
        
        Builder builder = new CarBuilder();
        Director director = new CarDirector();
        Vehicle vehicle = director.instruct(builder);
        vehicle.showProduct();
        
        builder = new MotorCycleBuilder();
        director = new MotorCycleDirector();
        vehicle = director.instruct(builder);
        vehicle.showProduct();
    }
}
