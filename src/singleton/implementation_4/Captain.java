package singleton.implementation_4;

enum Captain {
    INSTANCE;
    
    public synchronized void getCaptain() {
        System.out.println("\t You already have a captain for your team.");
        System.out.println("\tSend him for the toss");
    }
}
