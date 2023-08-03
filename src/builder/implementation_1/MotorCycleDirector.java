package builder.implementation_1;

public class MotorCycleDirector extends Director {

    // Follows it's own sequence
    
    @Override
    public Vehicle instruct(Builder builder) {
        builder.addBrandName();
        builder.buildBody();
        builder.insertWheels();
        return builder.getVehicle();
    }
}
