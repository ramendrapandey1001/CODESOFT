package ATM_Interface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;

public class DataAccessLayer {
    public static void main(String[] args) {

    }

    public static Connection getconnection() throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:/mysql://localhost:3306", "root", "ramendra");
        return con;
    }

    public static LinkedList<Clint> SqlRepository() throws SQLException {
        Connection con = DataAccessLayer.getconnection();

    }
}
