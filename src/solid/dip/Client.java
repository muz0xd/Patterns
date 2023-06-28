package solid.dip;

public class Client {

    public static void main(String[] args) {
        System.out.println("*** A demo with DIP.***");
        
        DataBase dataBase = new OracleDatabase();
        UserInterface userInterface = new UserInterface(dataBase);
        userInterface.saveEmployeeId("E001");
        
        dataBase = new MySQLDatabase();
        userInterface = new UserInterface(dataBase);
        userInterface.saveEmployeeId("E002");
    }
}
