package solid.ocp;

class ScienceDistinctionDecider implements DistinctionDecider {

    @Override
    public void evaluateDistinction(Student student) {
        if(student.score > 80) {
            System.out.println(student.regNumber + " has received distinction in science");
        }
    }

}
