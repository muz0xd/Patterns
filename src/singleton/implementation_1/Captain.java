package singleton.implementation_1;

final class Captain {
    private static Captain captain;

    private Captain() {
    }

    public static synchronized Captain getCaptain() {
        if (captain == null) {
            captain = new Captain();
            System.out.println("\tA new captain is elected for your team.");
        } 
        else {
            System.out.println("\tYou already have a captain for your team.");
            System.out.println("\tSend him for the toss.");
        }
        return captain;
    }
}
