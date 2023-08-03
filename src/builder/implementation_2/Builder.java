package builder.implementation_2;

interface Builder {
    Builder addBrandName();
    Builder buildBody();
    Builder insertWheels();
    
    Vehicle getVehicle();
}
