package composite;

public class JuniorEmployee extends Employee {

    public JuniorEmployee(String name, String designation) {
        super(name, designation);
    }

    @Override
    protected void printStructures() {
        System.out.println("\t\t" + this.name + " is a " + this.designation);
    }

    @Override
    protected int getSubordinatesCount() {
        return subordinatesCount;
    }

    @Override
    protected void addEmployee(Employee e) {
        
    }

    @Override
    protected void removeEmployee(Employee e) {

    }

}
