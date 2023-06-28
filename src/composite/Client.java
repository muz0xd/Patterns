package composite;

public class Client {
    
    public static void main(String[] args) {
        System.out.println("***Composite Pattern Demonstration***");
        
        Employee hodMath = formMathDept();
        Employee hodCompSc = formComputerScDept();
        Employee principal = formPrincipal(hodMath, hodCompSc);
        
        System.out.println("The details of principal object:");
        principal.printStructures();
        
        System.out.println("The details of the HOD(Computer Sc.) object:");
        hodCompSc.printStructures();
        
        System.out.println("The details of the HOD(Mathematics) object:");
        hodMath.printStructures();
        
        System.out.println("\n The structure of a Junior employee(leaf node):");
        hodMath.subordinates.get(0).printStructures();
        
        displayManagementDetail(principal, hodCompSc, hodMath);
        
        System.out.println("\nThe lecturer Mr.C.Jones(cseTeacher2) resigns.");
        hodCompSc.removeEmployee(hodCompSc.subordinates.get(1));
        System.out.println("The organization has the following members now:");
        principal.printStructures();
        displayManagementDetail(principal, hodCompSc, hodMath);
        
        System.out.println("Testing the structure of some junior employee's:");
        Employee juniorMathTeacher1 = hodMath.subordinates.get(0);
        Employee juniorCSETeacher1 = hodCompSc.subordinates.get(0);
        System.out.println("The Lecturer (M.Jacob) manages " + juniorMathTeacher1.getSubordinatesCount() + " employee(s).");
        System.out.println("The Lecturer (C.Kate) manages " + juniorCSETeacher1.getSubordinatesCount()+ " employee(s).");
    }
    
    private static Employee formComputerScDept() {
        System.out.println("Forming Computer Science department.");
        System.out.println("A HOD with three lectures is here.\n");
        
        Employee cseTeacher1 = new JuniorEmployee("C.Kate", "Lecturer");
        Employee cseTeacher2 = new JuniorEmployee("C.Jones", "Lecturer");
        Employee cseTeacher3 = new JuniorEmployee("C. Proctor", "Lecturer");
        
        Employee hodCompSc = new SeniorEmployee("Mr. V.Sarcar", "HOD(CSE)");
        
        hodCompSc.addEmployee(cseTeacher1);
        hodCompSc.addEmployee(cseTeacher2);
        hodCompSc.addEmployee(cseTeacher3);
        
        return hodCompSc;
    }
    
    private static Employee formMathDept() {
        System.out.println("Forming Mathematics department.");
        System.out.println("A HOD with two lecturers is here.\n");
        
        Employee mathTeacher1 = new JuniorEmployee("M.Jacob", "Lecturer");
        Employee mathTeacher2 = new JuniorEmployee("M.Rustom", "Lecturer");
        
        Employee hodMath = new SeniorEmployee("Mrs.S.Das.", "HOD(Math)");
        
        hodMath.addEmployee(mathTeacher1);
        hodMath.addEmployee(mathTeacher2);
        
        return hodMath;
    }
    
    private static Employee formPrincipal(Employee hodMath, Employee hodCompSC) {
        System.out.println("Forming the top-level management.");
        System.out.println("A principal with two HOD's is here.\n");
        
        Employee principal = new SeniorEmployee("Dr.S.Som", "Principal");
        
        principal.addEmployee(hodMath);
        principal.addEmployee(hodCompSC);
        
        return principal;
    }
    
    private static void displayManagementDetail(Employee principal, Employee hodCompSc, Employee hodMath) {
        System.out.println("The principal manages " + principal.getSubordinatesCount() + " employee(s).");
        System.out.println("The HOD(Computer Sc.) manages " + hodCompSc.getSubordinatesCount() + " employee(s).");
        System.out.println("The HOD(Mathematics) manages "+ hodMath.getSubordinatesCount() + " employee(s).");
        
        System.out.println("---------------");
    }
}
