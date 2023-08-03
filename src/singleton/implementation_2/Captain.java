package singleton.implementation_2;

class Captain {
    private static final Captain CAPTAIN_INSTANCE = new Captain();
    
    private Captain() {
        System.out.println("\tNew captain is elected for your team.");
    }
    
    public static Captain getCaptain() {
        System.out.println("\tYou already have a captain for your team.");
        System.out.println("\tSend him for the toss.");
        return CAPTAIN_INSTANCE;
    }
    
    public static void dummyMethod() {
        System.out.println("It is a dummy method");
    }
}
