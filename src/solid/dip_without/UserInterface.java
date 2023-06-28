package solid.dip_without;

public class UserInterface {
    private OracleDatabase oracleDatabase; 
    
    public UserInterface() {
        this.oracleDatabase = new OracleDatabase(); 
    }
    
    public void saveEmployeeId(String empId) {
        oracleDatabase.saveEmpIdInDatabase(empId);
    }

}
