package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

    private Connection connection = null;

    public Connection setConnection() {
        try {
            String url = "jdbc:mysql://localhost:3306/pustakakita1";
            String user = "root";
            String pass = "rafiind1324";
            String db = "pustakakita1";
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection(url, user, pass);
        } catch (ClassNotFoundException | SQLException e) {
        }
        return connection;
    }
}
