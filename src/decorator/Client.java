package decorator;

public class Client {
    public static void main(String[] args) {
        System.out.println("*** Using wrappers in different scenarios.***\n");
        
        System.out.println("Scenario-1: Making a basic home with standard facilities.");
        Home home = new BasicHome();
        System.out.println("Total cost: $" + home.getPrice());
        
        System.out.println("\nScenario-2: Making a basic home. Then adding a playground");
        home = new BasicHome();
        home = new PlayGround(home);
        System.out.println("Total cost: $" + home.getPrice());
        
        System.out.println("\nScenario-3: Making a basic home. Then adding two playground one-by-one.");
        home = new BasicHome();
        home = new PlayGround(home);
        home = new PlayGround(home);
        System.out.println("Total cost: $" + home.getPrice());
        
        System.out.println("\nScenarios-4: Making a basic home. Then adding one additional"
                + " playground and swiming pool.");
        home = new BasicHome();
        home = new PlayGround(home);
        home = new SwimingPool(home);
        System.out.println("Total cost: $" + home.getPrice());
        
        System.out.println("\nScenario-5: Adding a swiming pooland then a playground to a basic home.");
        home = new BasicHome();
        home = new SwimingPool(home);
        home = new PlayGround(home);
        System.out.println("Total cost: $" + home.getPrice());
        
        System.out.println("\nScenario-6: Making an advanced home now.");
        home = new AdvancedHome();
        System.out.println("Total cost: $" + home.getPrice());
        
        System.out.println("\n Scenario-7: Making an advanced home. "
                + "Than adding one additional playgraound to it.");
        home = new AdvancedHome();
        home = new PlayGround(home);
        System.out.println("Total cost: $" + home.getPrice());
        
        System.out.println("\n Scenario-8: Making an advanced home. Then adding one additional "
                + "playground and one swiming pool to it.");
        home = new AdvancedHome();
        home = new PlayGround(home);
        home = new SwimingPool(home);
        System.out.println("Total cost: $" + home.getPrice());
    }
}
