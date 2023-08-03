package builder.implementation_1;

public class CarDirector extends Director {

    // Follows it's own sequence
    
    @Override
    public Vehicle instruct(Builder builder) {
        builder.buildBody();
        builder.insertWheels();
        builder.addBrandName();
        return builder.getVehicle();
    }

}
