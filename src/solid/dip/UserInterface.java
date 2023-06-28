package solid.dip;

public class UserInterface {
    
    private DataBase database; 
    
    public UserInterface(DataBase database) {
        this.database = database; 
    }
    
    public void saveEmployeeId(String empId) {
        database.saveEmpIdInDatabase(empId);
    }

}
