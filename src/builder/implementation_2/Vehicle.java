package builder.implementation_2;

import java.util.LinkedList;

abstract class Vehicle {
    private LinkedList<String> parts;
    public Vehicle() {
        parts = new LinkedList<>();
    }
    public void add(String part) {
        parts.add(part);
    }
    
    public void showProduct() {
        System.out.println("These are the construction sequences:");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}