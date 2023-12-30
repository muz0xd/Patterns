package prototype.implementation_2;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("*** Prototype pattern example***");
        CarMaker carMaker = new CarMaker();
        
        BasicCar nano = carMaker.getNano();
        System.out.println(nano);
        System.out.println("--------");
        
        BasicCar clonedCar;
        clonedCar = nano.clone();
        printCarDetail(clonedCar);
        
        System.out.println("--------\n");
        
        BasicCar ford = carMaker.getFord();
        System.out.println(ford);
        System.out.println("---------");
        
        clonedCar = ford.clone();
        printCarDetail(clonedCar);
        System.out.println("---------\n");
        
    }
    
    private static void printCarDetail(BasicCar car) {
        System.out.println("Editing a cloned model:");
        System.out.println("Model: " + car.modelName);
        car.onRoadPrice += 100;
        System.out.println("It's on-road price $" + car.onRoadPrice);
    }
}
