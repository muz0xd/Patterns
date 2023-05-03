package solid.ocp;

abstract class Student {
    String name, regNumber, department;
    double score;
    public Student(String name, String regNumber,  double score) {
        this.name = name;
        this.regNumber = regNumber;
        this.score = score;
    }
    
    @Override
    public String toString() {
        return ("Name: " + name +
                "\nReg number: " + regNumber +
                "\nDept: " + department +
                "\nMarks: " + score + 
                "\n***********");
    }    
    
}
