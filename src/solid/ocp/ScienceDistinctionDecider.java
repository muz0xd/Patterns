package solid.ocp;

class ScienceDistinctionDecider implements DistinctionDesider {

    @Override
    public void evaluateDistinction(Student student) {
        if(student.score > 80) {
            System.out.println("student.regNumber + \" has received distinction in science\"");
        }
    }

}
