package singleton.implementation_4;

public class Client {

    public static void main(String[] args) {
        System.out.println("***Singleton Pattern Demo using enum type.***\n");
        Captain.INSTANCE.getCaptain();
    }
}
