package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {

    public Connection conectDB() {
        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/whime?user=root&password=root";
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error in ConexaoDAO: " + e.getMessage());
        }
        return conn;
    }
}
