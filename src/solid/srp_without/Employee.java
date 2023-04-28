package solid.srp_without;

import java.util.Random;

public class Employee {
    public String firstName, lastName, empId;
    public double experienceInYears;
    public Employee(String firstName, String lastName, String empId, double experienceInYears) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.experienceInYears = experienceInYears;
    }
    
    public void displayEmpDetail() {
        System.out.println("The employee name:" + lastName + "," + firstName);
        System.out.println("This employee has" + experienceInYears + "years of expirience.");
    }
    
    public String checkSeniority (double experienceInYears) {
        return experienceInYears > 5 ? "senior" : "junior"; 
    }
    
    public String generateEmpId(String empFirstName) {
        int random = new Random().nextInt(1000);
        empId = firstName.substring(0,1) + random;
        return empId;
    }

}
