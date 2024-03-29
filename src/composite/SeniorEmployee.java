package composite;

public class SeniorEmployee extends Employee {

    public SeniorEmployee(String name, String designation) {
        super(name, designation);
    }

    @Override
    protected void printStructures() {
        System.out.println("\t" + this.name + " is a " + this.designation);
        for (Employee e : subordinates) {
            e.printStructures();
        }
    }

    @Override
    protected int getSubordinatesCount() {
        subordinatesCount = subordinates.size();
        for (Employee e : subordinates) {
            subordinatesCount += e.getSubordinatesCount();            
        }
        return subordinatesCount;
    }

    @Override
    protected void addEmployee(Employee e) {
        subordinates.add(e);
    }

    @Override
    protected void removeEmployee(Employee e) {
        subordinates.remove(e);
    }

}
