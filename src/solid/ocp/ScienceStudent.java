package solid.ocp;

class ScienceStudent extends Student {

    public ScienceStudent(String name, String regNumber, double score, String dept) {
        super(name, regNumber, score);
        this.department = dept;
    }
}
