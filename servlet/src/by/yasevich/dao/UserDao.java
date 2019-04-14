package by.yasevich.dao;

import by.yasevich.util.ConnectorDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    private final static String SQL_GET_USER="select login, pass from users where login=? and pass=?";
    private Connection connection;

    public UserDao()  {
        try {
            connection = ConnectorDB.getConnection(); }
        catch (SQLException e) { e.printStackTrace();}
    }

    public void closeConnection(){
        try { if (connection != null) {
            connection.close(); } }
        catch (Exception e) {
            e.printStackTrace(); }
    }

    public   boolean isValidUser (final String login, final String password) {

        PreparedStatement ps = null;
        try {
            ps = connection.prepareStatement(SQL_GET_USER);

            ps.setString(1, login);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                return true;           }

        } catch (SQLException e) {
            e.printStackTrace();      }

        finally {
            if (ps != null) {
                try {
                    ps.close();}
                catch (SQLException e) {
                    e.printStackTrace();
        }     } }
        return false;   }


}
