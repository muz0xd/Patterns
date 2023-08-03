package observer;

public class Client {
    public static void main(String[] args) {
        System.out.println("***Observer Pattern Demonstration.***\n");
        Observer roy = new Employee("Roy");
        Observer kevin = new Employee("Kevin");
        Observer bose = new Customer("Bose");
        Observer jacklin = new Customer("Jacklin");
        System.out.println("Working with company : Abc ltd.\n");
        
        Company abcLtd = new SpecificCompany("ABC Ltd.");
        abcLtd.register(roy);
        abcLtd.register(kevin);
        abcLtd.register(bose);
        System.out.println("ABC Ltd.'s current stock price is $5.");
        abcLtd.setStockPrice(5);
        System.out.println("------------");
        
        System.out.println("\nABC Ltd. is removing Kevin from the observer list now.");
        abcLtd.unRegister(kevin);
        System.out.println("\nABC ltd.'s new stock  price is $50.");
        abcLtd.setStockPrice(50);
        System.out.println("------------");
        
        System.out.println("\nKevin resgisters again to get notification from ABC ltd.");
        abcLtd.register(kevin);
        System.out.println("\nABC ltd.'s new stock price is $100.");
        abcLtd.setStockPrice(100);
        System.out.println("-----------");
        
        System.out.println("\nWorking with another company: XYZ co.");
        
        Company xyzCo = new SpecificCompany("XYZ co.");
        xyzCo.register(roy);
        xyzCo.register(jacklin);
        System.out.println("\nXYZ co.'s current stock price is $500");
        xyzCo.setStockPrice(500);
        
    }
}