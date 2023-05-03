package solid.ocp;

class ArtsDistinctionDecider implements DistinctionDecider {

    @Override
    public void evaluateDistinction(Student student) {
        if(student.score > 70) {
            System.out.println(student.regNumber + " has received distinction in arts");
        }
    }

}
