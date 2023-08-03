package singleton.implementation_3;

class Captain {
    private Captain() {
        System.out.println("\tNew captain is elected for your team.");
    }
    
    private static class SingletonHelper {
        private static final Captain CAPTAIN_INSTANCE = new Captain();
    }
    
    public static Captain getCaptain() {
        return SingletonHelper.CAPTAIN_INSTANCE;
    }
    
    public static void dummyMethod() {
        System.out.println("It is a dummy method");
    }
}
