package solid.dip;

public class OracleDatabase implements DataBase {
    
    @Override
    public void saveEmpIdInDatabase(String empId) {
        System.out.println("The id " + empId + " is saved in the Oracle database.");        
    }

}
