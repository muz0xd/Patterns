package singleton.implementation_1;

public class Client {

    public static void main(String[] args) {
        System.out.println("***Singleton pattern demo***\n");
        System.out.println("Trying to make captain for your team:");
        Captain captain1 = Captain.getCaptain();
        System.out.println("Traying to make another captain for your team:");
        Captain captain2 = Captain.getCaptain();
        if(captain1 == captain2) {
            System.out.println("Both captain1 and captain2 are the same.");
        }
    }
}
