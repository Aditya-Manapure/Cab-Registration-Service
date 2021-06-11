import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEstablishment{
    String url = "jdbc:oracle:thin:@localhost:1521:XE";
    Connection conn;
    static {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Driver Loaded");
    }

    public ConnectionEstablishment() {
        try {
            conn=DriverManager.getConnection(url,"system","oracle123");
            System.out.println("Connection Established !!");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public void close() throws SQLException {
        System.out.println("Closing system");
        conn.close();
        System.out.println("System closed successfully");
    }



    public void login(String name, String password) {
        Login newLogin = new Login(name, password);
    }


}
