package builder.implementation_1;

interface Builder {
    void addBrandName();
    void buildBody();
    void insertWheels();
    
    Vehicle getVehicle();
}
