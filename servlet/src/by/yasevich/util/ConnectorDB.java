package by.yasevich.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Locale;
import java.util.ResourceBundle;

public class ConnectorDB {
    public static java.sql.Connection getConnection() throws SQLException {
        ResourceBundle resource = ResourceBundle.getBundle("db", Locale.getDefault() );
        String url = resource.getString("db.url");
        String user = resource.getString("db.user");
        String pass = resource.getString("db.pass");
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return DriverManager.getConnection(url, user, pass);     }
}
