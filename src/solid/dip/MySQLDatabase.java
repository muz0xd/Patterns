package solid.dip;

public class MySQLDatabase implements DataBase {

    @Override
    public void saveEmpIdInDatabase(String empId) {
        System.out.println("The id " + empId + " is saved in the MySQL database.");
    }

}
