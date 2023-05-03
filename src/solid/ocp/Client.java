package solid.ocp;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String args[]) {
        System.out.println("***A demo that follows the OCP***");
        List<Student> scienceStudent = enrollScienceStudents();
        List<Student> artsStudent = enrollArtsStudents();
        
        System.out.println("===Results:===");
        for (Student student : scienceStudent) {
            System.out.println(student);
        }
        
        System.out.println("===Results:===");
        for (Student student : artsStudent) {
            System.out.println(student);
        }
        
        System.out.println("===Distinctions:===");
        DistinctionDecider scienceDistinctionDecider = new ScienceDistinctionDecider();
        DistinctionDecider artsDistinctionDecider = new ArtsDistinctionDecider();
        
        for (Student student : scienceStudent) {
            scienceDistinctionDecider.evaluateDistinction(student);
        }
        
        for (Student student : artsStudent) {
            artsDistinctionDecider.evaluateDistinction(student);
        }
    }
    
    private static List<Student> enrollScienceStudents() {
        Student sam = new ScienceStudent("Sam","R1",81.5,"Comp.Sc.");
        Student bob = new ScienceStudent("Bob","R2",72,"Physics");
        List<Student> scienceStudents = new ArrayList<Student>();
        scienceStudents.add(sam);
        scienceStudents.add(bob);
        return scienceStudents;
    }
    
    private static List<Student> enrollArtsStudents() {
        Student john = new ArtsStudent("John", "R3", 71,"History");
        Student kate = new ArtsStudent("Kate", "R4", 66.5,"English");
        List<Student> artsStudents = new ArrayList<Student>();
        artsStudents.add(john);
        artsStudents.add(kate);
        return artsStudents;
    }
    
}
