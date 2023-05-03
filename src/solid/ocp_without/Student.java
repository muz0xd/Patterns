package solid.ocp_without;

public class Student {
    String name, regNumber, department;
    double score;
    public Student(String name, String regNumber,  double score, String department) {
        this.name = name;
        this.regNumber = regNumber;
        this.department = department;
        this.score = score;
    }
    
    @Override
    public String toString() {
        return ("Name: " + name +
                "\nReg number: " + regNumber +
                "\n Dept: " + department +
                "\nMarks: " + score + 
                "\n***********");
    }    
    
}
