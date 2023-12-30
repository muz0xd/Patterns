package prototype.implementation_1;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        System.out.println("*** Prototype pattern example***");
        BasicCar nano = new Nano("Nano XM624 cc");
        System.out.println(nano);
        System.out.println("--------");
        
        BasicCar clonedCar;
        clonedCar = nano.clone();
        printCarDetail(clonedCar);
        
        System.out.println("--------\n");
        
        BasicCar ford = new Ford("Ford Aspire");
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
