package builder.implementation_2;

public class CarBuilder implements Builder {
    
    Car car;
    
    public CarBuilder () {
        car = new Car("Ford");
    }

    @Override
    public Builder addBrandName() {
        car.add(" Adding the car brand: " + car.brandName);
        return this;
    }

    @Override
    public Builder buildBody() {
        car.add(" Making the car body.");
        return this;
    }

    @Override
    public Builder insertWheels() {
        car.add(" 4 wheels are added to the car.");
        return this;
    }

    @Override
    public Vehicle getVehicle() {
        return car;
    }

}
